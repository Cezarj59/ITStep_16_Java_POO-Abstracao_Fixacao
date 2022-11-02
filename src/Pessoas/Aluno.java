package Pessoas;

public class Aluno extends Pessoa {

    
    private double peso;
    private double altura;

    public Aluno(double peso, double altura, String nome, String cpf, String genero, String dataNascimento) {
        super(nome, cpf, genero, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
