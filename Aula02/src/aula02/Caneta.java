package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Cor: " + this.cor); // this: autorreferência.
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada + "\n");
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    
    void tampar() {
        this.tampada = true; // this é o nome do objeto que chamou, então this é c1.
    }
    
    void destampar() {
        this.tampada = false;
    }
}
