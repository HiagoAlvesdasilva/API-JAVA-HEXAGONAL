package github.com.HiagoAlvesdasilva.acesso_api.adapter.repositories;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.entities.UsuarioEntity;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioRepositoryPorts;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPorts {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Usuario create(Usuario usuario) {;
        UsuarioEntity novoUsuario = usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(novoUsuario, Usuario.class);
    }

    @Override
    public Usuario findById(long usuarioId) {
        Optional<UsuarioEntity> usuarioEntityOptional = usuarioRepository.findById(usuarioId);
        if (usuarioEntityOptional.isPresent()) {
            return modelMapper.map(usuarioEntityOptional.get(), Usuario.class);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + usuarioId);
        }
    }

    @Override
    public Usuario update(long usuarioId, Usuario usuario) {
        Optional<UsuarioEntity> usuarioEntityOptional = usuarioRepository.findById(usuarioId);
        if (usuarioEntityOptional.isPresent()) {
            UsuarioEntity usuarioExistente = usuarioEntityOptional.get();
            usuarioExistente.setNome(usuario.getNome());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setSenha(usuario.getSenha());
            usuarioExistente.setAdministrador(usuario.isAdministrador());
            UsuarioEntity usuarioAtualizado = usuarioRepository.save(usuarioExistente);
            return modelMapper.map(usuarioAtualizado, Usuario.class);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + usuarioId);
        }
    }

    @Override
    public void delete(long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

}
