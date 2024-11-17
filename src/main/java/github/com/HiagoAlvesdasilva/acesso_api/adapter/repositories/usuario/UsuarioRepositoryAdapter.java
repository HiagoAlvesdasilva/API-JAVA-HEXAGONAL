package github.com.HiagoAlvesdasilva.acesso_api.adapter.repositories.usuario;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.entities.PessoaEntity;
import github.com.HiagoAlvesdasilva.acesso_api.adapter.entities.UsuarioEntity;
import github.com.HiagoAlvesdasilva.acesso_api.adapter.repositories.pessoa.PessoaRepository;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioRepositoryPorts;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPorts {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;
    private final PessoaRepository pessoaRepository;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, ModelMapper modelMapper, PessoaRepository pessoaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class); // Salve a entidade Pessoa antes de salvar Usuario
        PessoaEntity pessoaEntity = usuarioEntity.getPessoa();
        if (pessoaEntity != null && pessoaEntity.getPessoaId() == 0) {
            pessoaEntity = pessoaRepository.save(pessoaEntity);
            usuarioEntity.setPessoa(pessoaEntity);
        }
        UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity);
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
