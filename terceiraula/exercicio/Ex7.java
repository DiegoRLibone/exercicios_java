package terceiraula.exercicio;

public class Ex7 {
    public static void main(String[] args){
        float media1, n1, n2, n3, media2, n4, n5, n6, somaMedia;

        n1 = 8;
        n2 = 9;
        n3 = 7;
        media1 = (n1 + n2 + n3) / 3;

        n4 = 4;
        n5 = 5;
        n6 = 6;
        media2 = (n4 + n5 + n6) / 3;

        somaMedia = (media1 + media2) /2;

        System.out.println(media1 + " <- (Números usados para a média 1: 8, 9, 7)");
        System.out.println(media2 + " <- (Números usados para a média 2: 4, 5, 6)");

        System.out.println(somaMedia + " <- (resultado da média das médias anteriores)");
    }
}
