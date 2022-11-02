package Matriculas;

import Pessoas.Aluno;
import java.time.LocalDateTime;

public class MatriculaAluno extends Matricula {

    private Aluno dadosPessoais;

    public MatriculaAluno(int id, LocalDateTime dataHora, String atividade) {
        super(id, dataHora, atividade);
    }

    public MatriculaAluno(int id, LocalDateTime dataHora, String atividade, double peso, double altura, String nome, String cpf, String genero, String dataNascimento) {
        super(id, dataHora, atividade);
        this.dadosPessoais = new Aluno(peso, altura, nome, cpf, genero, dataNascimento);
    }

    public Aluno getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(Aluno dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
    
    

}
