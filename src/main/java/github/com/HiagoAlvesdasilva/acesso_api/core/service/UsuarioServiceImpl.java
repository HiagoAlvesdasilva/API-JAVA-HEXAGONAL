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

    @Override
    public Usuario findById(long usuarioId) {
        return usuarioRepositoryPorts.findById(usuarioId);
    }

    @Override
    public Usuario updateUsuario(long usuarioId, Usuario usuario) {
        return usuarioRepositoryPorts.update(usuarioId, usuario);
    }

    @Override
    public void deleteUsuario(long usuarioId) {
        usuarioRepositoryPorts.delete(usuarioId);
    }


}
