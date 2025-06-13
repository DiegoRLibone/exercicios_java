package quintaula;
import java.util.Random;
import java.util.Scanner;

public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner Escolha = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();// gerador de numeros aleatórios
        numero_conta = gerador_numero.nextInt(1000);//número máximo de 1000
    }

    public void verSaldo(){
        System.out.println("O número da conta é: " + numero_conta + "\nO titular da conta é: " + titular_conta + "\nO saldo da conta é: " + saldo);
    }

    public void saque(double valor_saque){
        if(saldo >= valor_saque){
            saldo -= valor_saque;
            System.out.println("Valor do saldo atual é: " + saldo);
        }else{
            System.out.println("Seu saldo é insulficiente!");
        }
    }

    public void deposito(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Depósito inválido! O valor do depósito é menor ou igual a 0.");
        }else{
            saldo += valorDeposito;
            System.out.println("Depósito concluído com sucesso! Saldo atual de: " + saldo);
        }
    }

    public void emprestimo(double valorEmprestimo){

        if (saldo < 100){
            if (valorEmprestimo > 1000){
                System.out.println("O valor de empréstimo pedido é muito alto (max. 1000)");
            }else{
                saldo += valorEmprestimo;
                System.out.println("empréstimo realizado com sucesso! Saldo atual de: " + saldo);
            }
        }else{
            System.out.println("o empréstimo não está liberado! Saldo maior ou igual a 100");
        }
    }

    public void exibirMenu(){
        System.out.println("Bem vindo ao Banco NSPagamentos! \n Escolha a sua opção: \n 1 - Ver Saldo \n 2 - Sacar \n 3 - Depositar \n 4 - Empréstimo \n 5 - Finalizar");
    }

    public void Iniciar() {
        int opcao;
        do {
            exibirMenu();
            opcao = Escolha.nextInt();
            Escolher_funcao (opcao);
        } while (opcao != 5);
    }

    public void Escolher_funcao(int opcao){
        double saque, deposito, emprestimo;

        switch (opcao){
            case 1:
                verSaldo();
                break;

            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                saque = Escolha.nextDouble();
                saque(saque);
                break;

            case 3:
                System.out.println("Digite o valor a ser depositado: ");
                deposito = Escolha.nextDouble();
                deposito(deposito);
                break;

            case 4:
                System.out.println("Digite o valor do empréstimo: ");
                emprestimo = Escolha.nextDouble();
                emprestimo(emprestimo);
                break;

            case 5:
                System.out.println("Operação finalizada!");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}