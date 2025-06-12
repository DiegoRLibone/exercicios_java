package primeiraula;

import org.w3c.dom.ls.LSOutput;

public class Caneta {

    public static void main(String[] args){

        ClasseCaneta caneta1 = new ClasseCaneta();

        caneta1.modelo = "esferográfica";
        caneta1.cor = "preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 70;
        //caneta1.tampada = true;
        caneta1.estado_atual();
        caneta1.destampar();
        caneta1.desenhar();

        ClasseCaneta caneta2 = new ClasseCaneta();

        caneta2.modelo = "hidrográfica";
        caneta2.cor = "Amarelo translúcido";
        caneta2.ponta = 0.7f;
        caneta2.carga = 65;
        caneta2.estado_atual();
        caneta2.marcar();

    }
}
