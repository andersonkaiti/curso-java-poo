package exercicioproposto01;
public class Caminhar {
    float tempo;
    float distancia;
    float velocidade;
    
    void status() {
        System.out.println("\nTempo: " + this.tempo);
        System.out.println("Distância: " + this.distancia);
        System.out.println("Velocidade: " + this.velocidade);
    }
    
    void começar() {
        System.out.println("\nContagem de tempo e distância iniciada.");
        this.tempo = 0f;
        this.distancia = 0f;
        this.velocidade = 0f;
    }
    
    void finalizar() {
        this.tempo = tempo;
        this.distancia = distancia;
    }
}
