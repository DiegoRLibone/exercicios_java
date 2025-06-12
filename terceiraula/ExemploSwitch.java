package terceiraula;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[]args){
        int DiaSemana;
        String NomeDia;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número que corresponde ao dia da semana (1 á 7): ");
        DiaSemana = numero.nextInt();

        if (DiaSemana < 1 || DiaSemana > 7){
            System.out.println("Dia inválido, execute mais uma vez e lembre-se de colocar um número entre 1 e 9");
        }else{
            switch(DiaSemana){
                case 1: NomeDia = "Domingo"; break;
                case 2: NomeDia = "Segunda-feira"; break;
                case 3: NomeDia = "Terça-feira"; break;
                case 4: NomeDia = "Quarta-feira"; break;
                case 5: NomeDia = "Quinta-feira"; break;
                case 6: NomeDia = "Sexta-feira"; break;
                case 7: NomeDia = "Sábado"; break;
                default: NomeDia = "Dia inválido"; break;
            }
            System.out.println("O dia da semana escolhido foi: " + NomeDia);
        }
    }
}
