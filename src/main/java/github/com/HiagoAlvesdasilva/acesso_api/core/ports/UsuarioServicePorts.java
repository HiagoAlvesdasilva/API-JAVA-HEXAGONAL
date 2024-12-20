package github.com.HiagoAlvesdasilva.acesso_api.core.ports;

import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;

public interface UsuarioServicePorts {
    
    Usuario createUsuario(Usuario usuario);
    
    Usuario findById(long usuarioId);

    Usuario updateUsuario(long usuarioId, Usuario usuario);

    void deleteUsuario(long usuarioId);
}
