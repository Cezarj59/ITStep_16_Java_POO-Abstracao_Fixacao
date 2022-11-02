package Menu;

import java.util.Scanner;

public class Menu {

    static Scanner read = new Scanner(System.in);

    public static void menu() {

        while (0 == 0) {
            System.out.println("\n@@ ------Academia CWB------ @@");
            System.out.println("\n----------Menu Inicial----------\n");
            System.out.println("[1] Cadastros");
            System.out.println("[2] Consultas");
            System.out.println("[0] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    menuCadastro();
                case "2" ->
                    menuConsulta();

                case "0" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menu();
                }
            }
        }
    }

    public static void menuCadastro() {
        System.out.println("\n----------Menu Cadastros----------\n");
        System.out.println("[1] Cadastros de Alunos");
        System.out.println("[2] Cadastros de Professores");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {

            case "1" -> {
                Services.CadastroAluno.realizaCadastroAluno();
                subMenuCadastro();

            }
            case "2" -> {
                System.out.println("\n## Nada ainda!!! ##\n");
                subMenuCadastro();

            }
            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }

            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuCadastro();
            }
        }

    }

    public static void menuConsulta() {
        System.out.println("\n----------Menu Consultas----------\n");
        System.out.println("[1] Consulta de Aluno");
        System.out.println("[2] Consulta de Professor");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {
            case "1" ->
                Services.ConsultaAluno.exibeCadastrosAluno();

            case "2" ->
                System.out.println("\n## Nada ainda!!! ##\n");

            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);

            }
            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuConsulta();
            }
        }
    }

    public static void subMenuCadastro() {

        while (0 == 0) {
            System.out.println("\n-----------Sub Menu Cadastros-----------\n");
            System.out.println("[1] Novo Cadastro de Aluno");
            System.out.println("[2] Novo Cadastro de Professor");
            System.out.println("[3] Menu Inicial");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    Services.CadastroAluno.realizaCadastroAluno();

                case "2" ->
                    System.out.println("\n## Nada ainda!!! ##\n");

                case "3" ->
                    menu();

                default -> {
                    System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    subMenuCadastro();
                }
            }
        }
    }
}
