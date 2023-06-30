package aula11;
public class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;
    
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com sucesso.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\nAluno\n" + "matricula: " + matricula + ", curso: " + curso + ".\n";
    }
}
