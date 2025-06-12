package quartaula;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args){
        int n;
        Scanner numeros = new Scanner(System.in);

        for(n=10; n>=0; n--){
            System.out.println("digite o número "+ n);
            n = numeros.nextInt();
        }
        System.out.println(n + "\n");
    }
}
