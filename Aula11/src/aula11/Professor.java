package aula11;
public class Professor {
    private String especialidade;
    private float salario;
    
    public void receberAumento(int aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nProfessor\n" + "especialidade: " + especialidade + ", salario: " + salario + ".\n";
    }
}
