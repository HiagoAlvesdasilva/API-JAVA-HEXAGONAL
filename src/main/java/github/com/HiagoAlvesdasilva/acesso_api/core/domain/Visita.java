package github.com.HiagoAlvesdasilva.acesso_api.core.domain;

import java.time.LocalDateTime;

public class Visita {
    private long id;
    private LocalDateTime dataHora;
    private long idMorador;
    private long idVisitante;

    public Visita() {
    }

    public Visita(long id, LocalDateTime dataHora, long idMorador, long idVisitante) {
        this.id = id;
        this.dataHora = dataHora;
        this.idMorador = idMorador;
        this.idVisitante = idVisitante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public long getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(long idMorador) {
        this.idMorador = idMorador;
    }

    public long getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(long idVisitante) {
        this.idVisitante = idVisitante;
    }
}
