package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

public class Pessoa {
    private long usuarioId;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(long usuarioId, String nome) {
        this.usuarioId = usuarioId;
        this.nome = nome;
    }

    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
