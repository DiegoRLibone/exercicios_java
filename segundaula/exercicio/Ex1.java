package segundaula.exercicio;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int ano,mes,dia,idadeDias;

        Scanner calc_dias = new Scanner(System.in);

        System.out.println("Quantos anos?");
        ano = calc_dias.nextInt();
        ano = ano * 365;

        System.out.println("Quantos meses?");
        mes = calc_dias.nextInt();
        mes = mes * 30;

        System.out.println("Quantos dias?");
        dia = calc_dias.nextInt();

        idadeDias = ano + mes + dia;

        System.out.println("A idade em dias é de: " + idadeDias);
    }
}
