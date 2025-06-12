package muitoexercicio;
import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = entrada.next().toLowerCase();
        int dias;

        if (mes.equals("fevereiro")) {
            dias = 28;
        } else if (mes.equals("abril") || mes.equals("junho") || mes.equals("setembro") || mes.equals("novembro")) {
            dias = 30;
        } else {
            dias = 31;
        }

        System.out.println("O mês de " + mes + " tem " + dias + " dias.");
    }
}