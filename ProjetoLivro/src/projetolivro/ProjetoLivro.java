package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 18, "M");
        p[1] = new Pessoa("Maria", 20, "F");
        
        l[0] = new Livro("Java Básico", "Lucas Silva", 300, p[0]);
        l[1] = new Livro("Java Avançado", "Guilherme Costa", 600, p[1]);
        l[2] = new Livro("Aprendendo Fundamentos Java", "Gustavo Guanabara", 400, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
