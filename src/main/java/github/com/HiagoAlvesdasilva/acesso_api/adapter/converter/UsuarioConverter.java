package github.com.HiagoAlvesdasilva.acesso_api.adapter.converter;

import github.com.HiagoAlvesdasilva.acesso_api.adapter.dtos.UsuarioDTO;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Pessoa;
import github.com.HiagoAlvesdasilva.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toTomain(UsuarioDTO usuarioDTO) {
        return new Usuario(usuarioDTO.getusuarioId(),
                usuarioDTO.getNome(),
                usuarioDTO.getEmail(),
                usuarioDTO.getSenha(),
                usuarioDTO.isAdministrador(),
                new Pessoa(usuarioDTO.getusuarioId(), usuarioDTO.getNome()));
    }

    public UsuarioDTO toDto(Usuario usuario) {
        return new UsuarioDTO(usuario.getusuarioId(),null, usuario.getEmail(), usuario.getSenha(), usuario.isAdministrador());
    }
}
