package Matriculas;

import java.time.LocalDateTime;

public class Matricula {

    private int id;
    private LocalDateTime dataHora;
    private String atividade;

    public Matricula(int id, LocalDateTime dataHora, String atividade) {
        this.id = id;
        this.dataHora = dataHora;
        this.atividade = atividade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    

}
