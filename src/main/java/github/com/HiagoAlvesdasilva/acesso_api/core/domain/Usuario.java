package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

public class Usuario {

    private long usuarioId;
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private Pessoa pessoa;


    public Usuario() {}

    public Usuario(long usuarioId, String nome, String email, String senha, boolean administrador, Pessoa pessoa) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.pessoa = pessoa;
    }

    public long getusuarioId() {
        return usuarioId;
    }

    public void setId(long id) {
        this.usuarioId = id;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
