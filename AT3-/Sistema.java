import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    static ArrayList<Aluno> alunos = new ArrayList<>(); // temporário, depois vira BD

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch(opcao){
                case 1:
                    cadastrarAluno(input);
                    break;
                case 2:
                    consultarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);
    }

    public static void cadastrarAluno(Scanner input){
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Matrícula: ");
        String matricula = input.nextLine();

        Aluno aluno = new Aluno(nome, idade, matricula);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void consultarAlunos(){
        System.out.println("\n--- Lista de alunos ---");
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for(Aluno a : alunos){
                System.out.println(a.mostrarInfo());
            }
        }
    }
}