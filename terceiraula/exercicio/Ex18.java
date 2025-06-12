package terceiraula.exercicio;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner descricao = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = 200;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = descricao.next();
            System.out.print("Digite a idade: ");
            int idade = descricao.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");
    }
}
