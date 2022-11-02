package Services;

import Matriculas.MatriculaAluno;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class ConsultaAluno {

    public static void exibeCadastrosAluno() {
        DateTimeFormatter dataBr = DateTimeFormatter.ofPattern("dd/MM/yyyy' às 'HH:mm");

        MatriculaAluno[] alunoCadastrado = CadastroAluno.alunoArray;

        System.out.println("\n\n====Relatório de Alunos Cadastrados====\n\n");

        if (alunoCadastrado.length > 0) {

            for (MatriculaAluno alunoCadastrado1 : alunoCadastrado) {

                String atividade = "1".equals(alunoCadastrado1.getAtividade()) ? "Musculação" : "2".equals(alunoCadastrado1.getAtividade()) ? "Musculação" : "Luta";

                if (alunoCadastrado1 != null) {
                    System.out.println("\n------ Cadastro: " + alunoCadastrado1.getId() + " ------"
                            + "\nData e Hora do Cadastro: " + alunoCadastrado1.getDataHora().format(dataBr)
                            + "\nNome: " + alunoCadastrado1.getDadosPessoais().getNome()
                            + "\nCPF: " + alunoCadastrado1.getDadosPessoais().getCpf()
                            + "\nGenero: " + alunoCadastrado1.getDadosPessoais().getGenero()
                            + "\nData de Nascimento: " + alunoCadastrado1.getDadosPessoais().getDataNascimento()
                            + "\nPeso: " + alunoCadastrado1.getDadosPessoais().getPeso()
                            + "\nAltura: " + alunoCadastrado1.getDadosPessoais().getAltura()
                            + "\nAtividade: " + atividade
                            + atividadeReturn(alunoCadastrado1.getAtividade(), alunoCadastrado1.getDadosPessoais().getPeso(), alunoCadastrado1.getDadosPessoais().getAltura())
                    );
                } else {
                    break;
                }
            }

        } else {
            System.out.println("""
                               
                               ################################
                               ## Não há Alunos Cadastrados! ##
                               ################################
                               
                               """);
        }

    }

    static public String atividadeReturn(String paramAtividade, double peso, double altura) {
        String resultado = "";

        switch (paramAtividade) {

            case "1" ->
                resultado = "\nIMC: " + new DecimalFormat("0.##").format(peso / (altura * altura));
            case "2" ->
                resultado = "\nIMC: " + new DecimalFormat("0.##").format(peso / (altura * altura));
            case "3" ->
                resultado = peso <= 65 ? "\nCategoria: PESO PENA" : peso <= 75 ? "\nCategoria: PESO GALO" : peso <= 85 ? "\nCategoria: PESO MÉDIO" : "\nCategoria PESO PESADO";

        }
        return resultado;
    }
}
