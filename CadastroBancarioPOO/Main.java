import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a operação que deseja realizar:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Excluir Clientes");
            System.out.println("4 - Sair");
            int resposta = scanner.nextInt();

            while (resposta !=4){
                if (resposta == 1) {
                    System.out.println("Cadastrar novo cliente: ");
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Informe o CPF: ");
                    String cpf = scanner.next();
                    scanner.next();

                    System.out.println("Informe o número da conta: ");
                    String numeroConta = scanner.next();
                    scanner.next();

                    System.out.println("Informe a agência: ");
                    String agencia = scanner.next();
                    scanner.next();

                    System.out.println("Informe o saldo: ");
                    double saldo = scanner.nextDouble();
                    scanner.next(); 
                }
            }
        }
    }