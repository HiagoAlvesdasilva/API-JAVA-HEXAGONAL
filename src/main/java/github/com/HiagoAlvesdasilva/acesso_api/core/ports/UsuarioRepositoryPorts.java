package github.com.HiagoAlvesdasilva.acesso_api.core.ports;

import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;

public interface UsuarioRepositoryPorts {

    Usuario create(Usuario usuario);
    
    Usuario findById(long usuarioId);
    
    Usuario update(long usuarioId, Usuario usuario);

    void delete(long usuarioId);
}
