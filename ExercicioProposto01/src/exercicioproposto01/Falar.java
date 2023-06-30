package exercicioproposto01;
public class Falar {
    float volume;
    
    void status() {
        if (this.volume < 50) {
            System.out.println("\nFalando baixo.");
        } else if (this.volume < 60) {
            System.out.println("\nFalando normal.");
        }  else {
            System.out.println("\nFalando alto.");
        }
    }
    
    void falarAlto() {
        this.volume = 60f;
    }
    
    void falarBaixo() {
        this.volume = 40f;
    }
    
    void falarNormal() {
        this.volume=  50f;
    }
}
