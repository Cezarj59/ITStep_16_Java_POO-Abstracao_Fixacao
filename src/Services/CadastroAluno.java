package Services;

import Matriculas.MatriculaAluno;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class CadastroAluno {

    static MatriculaAluno[] alunoArray = new MatriculaAluno[0];

    public static MatriculaAluno[] getAlunoArray() {
        return alunoArray;
    }

    public static void realizaCadastroAluno() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO ALUNOS---\n");

        String nome = JOptionPane.showInputDialog(null, "Informe o Nome: ");

        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF: ");

        String dataNascimento = JOptionPane.showInputDialog(null, "Informe a Data de Nascimento: ");

        String genero = JOptionPane.showInputDialog("Informe o Gênero: ");

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Altura: "));

        LocalDateTime horaCadastro = LocalDateTime.now();

        String atividade = JOptionPane.showInputDialog(null, """
                                                             Digite[1] -> Para Musculação
                                                             Digite[2] -> Para Crossfit
                                                             Digite[3] -> Para Luta""");
        

        alunoArray = aumentar(alunoArray);
        alunoArray[alunoArray.length - 1] = new MatriculaAluno(alunoArray.length, horaCadastro, atividade, peso, altura, nome, cpf, genero, dataNascimento);

        System.err.println("\nCadastro efetuado com sucesso!!!\n");
    }

    private static MatriculaAluno[] aumentar(MatriculaAluno[] arrayQueSeraAumentado) {
        MatriculaAluno[] aux = new MatriculaAluno[arrayQueSeraAumentado.length + 1];
        if (arrayQueSeraAumentado.length > 0) {
            System.arraycopy(arrayQueSeraAumentado, 0, aux, 0, arrayQueSeraAumentado.length);
        }

        return aux;
    }

}
