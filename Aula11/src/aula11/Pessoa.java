package aula11;
public abstract class Pessoa {
    // Classe abstrata: não pode ser instanciada
    // apenas pode ser uma superclasse
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public final void fazerAniversario() {
    // Método final não pode ser sobrescrito
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\nPessoa\n" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ".\n";
    }
}
