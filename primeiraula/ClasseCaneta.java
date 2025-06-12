package primeiraula;

public class ClasseCaneta {

    String modelo;
    String cor;
    float ponta; //valor escrito
    int carga; //valor numérico
    boolean tampada; //verdadeiro ou falso

    //trabalhando métodos

    void rabiscar(){
        if(this.tampada==true) {
            System.out.println("Erro! Caneta tampada!");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    void desenhar(){
        if(this.tampada = false){
            System.out.println("Estou Desenhando!");
        }else{
            System.out.println("Caneta tampada!");

        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void estado_atual(){
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a pornta: " + this.ponta);
        System.out.println("Esta caneta está com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta está tampada? " + this.tampada);
    }

    void marcar(){
        if(this.tampada == false){
            System.out.println("Marcando!");
        }else{
            System.out.println("destampe a caneta primeiro");
        }
    }
}
