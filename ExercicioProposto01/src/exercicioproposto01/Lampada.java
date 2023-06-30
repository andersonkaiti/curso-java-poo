package exercicioproposto01;
public class Lampada {
   String cor;
   float tamanho;
   float peso;
   boolean aceso;
   
   void status() {
       System.out.println("\nCor: " + this.cor);
       System.out.println("Tamanho: " + this.tamanho);
       System.out.println("Peso: " + this.peso);
       System.out.println("Aceso: " + this.aceso);
   }
   
   void acender() {
       this.aceso = true;
   }
   
   void desligar() {
       this.aceso = false;
   }
}
