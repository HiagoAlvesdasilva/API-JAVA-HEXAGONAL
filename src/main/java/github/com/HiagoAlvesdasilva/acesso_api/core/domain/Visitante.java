package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

public class Visitante {
    private long id;
    private String rg;
    private long idPessoa;

    public Visitante() {
    }

    public Visitante(long id, String rg, long idPessoa) {
        this.id = id;
        this.rg = rg;
        this.idPessoa = idPessoa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
