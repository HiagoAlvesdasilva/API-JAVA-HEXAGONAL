package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

public class Morador {
    private long id;
    private String cpf;
    private String endereco;
    private String telefone;
    private long idPessoa;

    public Morador() {
    }

    public Morador(long id, String cpf, String endereco, String telefone, long idPessoa) {
        this.id = id;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idPessoa = idPessoa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
