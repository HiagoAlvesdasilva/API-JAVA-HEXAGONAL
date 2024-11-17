package github.com.HiagoAlvesdasilva.acesso_api.adapter.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pessoa_id")
    private long pessoaId;
    private String nome;

    public long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
