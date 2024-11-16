package github.com.HiagoAlvesdasilva.acesso_api.core.service;

import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioRepositoryPorts;
import github.com.HiagoAlvesdasilva.acesso_api.core.ports.UsuarioServicePorts;

public class UsuarioServiceImpl implements UsuarioServicePorts {

    private final UsuarioRepositoryPorts usuarioRepositoryPorts;

    public UsuarioServiceImpl(UsuarioRepositoryPorts usuarioRepositoryPorts) {
        this.usuarioRepositoryPorts = usuarioRepositoryPorts;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPorts.create(usuario);
    }

}
