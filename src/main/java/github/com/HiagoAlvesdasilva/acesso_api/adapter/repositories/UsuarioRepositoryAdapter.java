package github.com.HiagoAlvesdasilva.acesso_api.adapter.repositories;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.entities.UsuarioEntity;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioRepositoryPorts;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

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

}
