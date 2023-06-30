package projetolivro;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro\n"
                + "titulo: " + titulo
                + "\nautor: " + autor
                + "\ntotPaginas: " + totPaginas
                + "\npagAtual: " + pagAtual
                + "\naberto: " + aberto
                + "\nleitor: " + leitor.getNome() + "\n";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas()) {
            this.pagAtual++;
        } else {
            this.pagAtual = 0;
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0) {
            this.pagAtual++;
        } else {
            this.pagAtual = this.totPaginas;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
}
