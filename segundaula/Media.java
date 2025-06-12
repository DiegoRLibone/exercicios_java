package segundaula;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        float n1, n2, n3, n4, media;


        Scanner entradaNotas = new Scanner(System.in);

        System.out.println("Nota 1 é de: ");
        n1 = entradaNotas.nextInt();

        System.out.println("Nota 2 é de: ");
        n2 = entradaNotas.nextInt();

        System.out.println("Nota 3 é de: ");
        n3 = entradaNotas.nextInt();

        System.out.println("Nota 4 é de: ");
        n4 = entradaNotas.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é de: " + media);

        if (media >= 6){
            System.out.println("Aluno aprovado");
        }else if (media >= 5){
            System.out.println("Aluno de recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }


    }
}
