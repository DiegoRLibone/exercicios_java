package terceiraula.exercicio;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        int idade;

        Scanner Idade = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        idade = Idade.nextInt();

        if (idade <16){
            System.out.println("Não pode votar");
        } else if (idade >= 18 && idade <=65) {
            System.out.println("Voto obrigatório");
        }else{
            System.out.println("Voto Opcional");
        }

    }
}
