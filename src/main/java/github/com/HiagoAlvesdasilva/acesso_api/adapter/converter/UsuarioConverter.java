package github.com.HiagoAlvesdasilva.acesso_api.adapter.converter;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.dtos.UsuarioDTO;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toTomain(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getSenha(), usuarioDTO.isAdministrador());
    }

    public UsuarioDTO toDto(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.isAdministrador());
    }
}
