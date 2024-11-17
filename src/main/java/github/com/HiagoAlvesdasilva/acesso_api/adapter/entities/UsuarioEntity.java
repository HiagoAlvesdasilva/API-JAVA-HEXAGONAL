package github.com.HiagoAlvesdasilva.acesso_api.adapter.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "usuario_id")
    private long usuarioId;
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    @OneToOne
    @JoinColumn(referencedColumnName = "pessoa_id")
    private PessoaEntity pessoa;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String nome,long usuarioId, String email, String senha, boolean administrador, PessoaEntity pessoa) {
        this.nome = nome;
        this.usuarioId = usuarioId;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
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

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }
}
