package github.com.HiagoAlvesdasilva.acesso_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDTO {
    private long id;
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
}
