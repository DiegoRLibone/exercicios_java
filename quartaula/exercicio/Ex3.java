package quartaula.exercicio;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String nome;
        System.out.println("Digite seu nome");

        nome = ler.next();

        for(int i = 1; i <= 10; i++){
            System.out.println(nome);
        }
    }
}
