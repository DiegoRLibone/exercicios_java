package terceiraula.exercicio;
import java.util.Scanner;

// usando for para simplificação do código, arrependimento de não ter usando nos exercícios anteriores

public class Ex17 {
    public static void main(String[] args){
        Scanner M_idade = new Scanner(System.in);
        int maiorDeIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = M_idade.nextInt();
            if (idade >= 18) {
                maiorDeIdade++;
            }
        }

        System.out.println("Total de pessoas maiores de idade: " + maiorDeIdade);

    }
}
