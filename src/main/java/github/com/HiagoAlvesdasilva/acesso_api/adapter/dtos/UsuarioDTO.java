package github.com.HiagoAlvesdasilva.acesso_api.adapter.dtos;


public class UsuarioDTO {
    private long usuarioId;
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;

    public UsuarioDTO() {
    }

    public UsuarioDTO(long usuarioId, String nome, String email, String senha, boolean administrador) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public long getusuarioId() {
        return usuarioId;
    }

    public void setId(long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
