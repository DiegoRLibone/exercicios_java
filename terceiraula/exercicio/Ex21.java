package terceiraula.exercicio;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){
        float produto, juros;
        Scanner preco = new Scanner(System.in);
        produto = preco.nextFloat();
        juros = produto/5;
        System.out.println("Os valores da prestação dividas em 5 é de: " + juros);

    }
}
