package terceiraula;
import java.util.Scanner;

public class Exemplo2Switch {
    public static void main(String[] args){

        int mes;
        String escolha;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o número do seu mês de aniversário: ");
        mes = numero.nextInt();

        switch(mes){
            case 1: escolha = "Janeiro"; break;
            case 2: escolha = "Fevereiro"; break;
            case 3: escolha = "Março"; break;
            case 4: escolha = "Abril"; break;
            case 5: escolha = "Maio"; break;
            case 6: escolha = "Junho"; break;
            case 7: escolha = "Julho"; break;
            case 8: escolha = "Agosto"; break;
            case 9: escolha = "Setembro"; break;
            case 10: escolha = "Outubro"; break;
            case 11: escolha = "Novembro"; break;
            case 12: escolha = "Dezembro"; break;
            default: escolha = "Mês Inválido"; break;

        }
        System.out.println("Seu mês de aniversário é: " + escolha);
    }
}
