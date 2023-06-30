package exercicioproposto01;
public class Armario {
    String cor;
    String material;
    boolean aberto;
    
    void status() {
        System.out.println("\nCor: " + this.cor);
        System.out.println("Material: " + this.material);
        System.out.println("Aberto: " + this.aberto);
    }
    
    void abrir() {
        this.aberto = true;
    }
    
    void fechar() {
        this.aberto = false;
    }
    
    void guardar() {
        
    }
}
