package aula11;
public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println("Praticando.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "\nTecnico\n" + "registroProfissional: " + registroProfissional + ", curso: " + this.getCurso() + ".\n";
    }
}
