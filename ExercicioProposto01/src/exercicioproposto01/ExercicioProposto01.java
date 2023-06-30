package exercicioproposto01;
public class ExercicioProposto01 {
    public static void main(String[] args) {
        Armario a1 = new Armario();
        a1.cor = "Branco";
        a1.material = "Madeira";
        a1.abrir();
        a1.status();
        
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.tamanho = 10f;
        l1.peso = 10.5f;
        l1.acender();
        l1.status();
        
        Caminhar c1 = new Caminhar();
        c1.começar();
        c1.tempo = 10f;
        c1.distancia = 200f;
        c1.velocidade = 20f;
        c1.status();
        c1.finalizar();
        
        Falar f1 = new Falar();
        f1.falarAlto();
        f1.status();
        f1.falarBaixo();
        f1.status();
        f1.falarNormal();
        f1.status();
    }
    
}
