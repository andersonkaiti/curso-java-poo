package aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1113);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor();
        p1.setEspecialidade("Informática");
        p1.setSalario(2000f);
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setCurso("Ciência da Computação");
        t1.setRegistroProfissional(1000);
        t1.setIdade(20);
        t1.setNome("Fabrício");
        t1.setSexo("M");
        System.out.println(t1.toString());
    }
}
