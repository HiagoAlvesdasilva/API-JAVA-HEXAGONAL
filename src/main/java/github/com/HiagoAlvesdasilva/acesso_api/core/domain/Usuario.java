package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

public class Usuario {

    private long id;
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;


    public Usuario() {
    }

    public Usuario(long id, String nome, String email, String senha, boolean administrador) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
