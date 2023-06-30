package aula11;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.nome + " renovada.");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é isento de mensalidade por ser bolsista.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "\nBolsista\n" + "bolsa: " + bolsa + ".\n";
    }
}
