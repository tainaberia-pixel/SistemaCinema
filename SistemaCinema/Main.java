import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListaIngressos lista = new ListaIngressos(10);
        int opcao;
        do{
            System.out.println("SISTEMA DE INGRESSOS DE CINEMA ");
            System.out.println("1. Cadastrar Ingresso ");
            System.out.println("2. Exibir Todos os Ingressos ");
            System.out.println("3. Ordenar por Número do Assento ");
            System.out.println("4. Ordenar por Valor ");
            System.out.println("5. Ordenar por Horário");
            System.out.println("0. Sair ");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Nome do filme: ");
                    String filme = scanner.nextLine();
                    System.out.print("Número da sala: ");
                    int sala = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Horário (ex: 19:30): ");
                    String horario = scanner.nextLine();
                    System.out.print("Número do assento: ");
                    int assento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Valor R$: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    Ingresso ingresso = new Ingresso(filme, sala, horario, assento, cliente, valor);
                    if (lista.adicionar(ingresso)) {
                        System.out.println("Ingresso cadastrado com sucesso.\n");
                    }
                    break;
                case 2:
                    lista.exibirTodos();
                    break;
                case 3:
                    lista.ordenarPorAssento();
                    lista.exibirTodos();
                    break;
                case 4:
                    lista.ordenarPorValor();
                    lista.exibirTodos();
                    break;
                case 5:
                    lista.ordenarPorHorario();
                    lista.exibirTodos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        } while (opcao != 0);
        scanner.close();
    }
}