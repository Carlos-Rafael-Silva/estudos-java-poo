package segundo.modulo.aulas.dominio;

import segundo.modulo.aulas.dominio.Professores;


public class Escola {
    private String nome;
    Professores[] professores;

    public Escola(String nome, Professores[] professores) {
        this.nome = nome;
        this.professores = professores;

    }

    public void imprime() {
        System.out.println("----------Escola---------- ");
        System.out.println(this.nome);
        if (professores != null) {
            System.out.println("----------Professores---------- ");
            for (Professores i : professores) {
                System.out.println("Professores: " + i.getNome());
                if (i.getMaterias() != null) {
                    System.out.println("----------Materia---------- ");
                    for (Materia m : i.getMaterias()) {
                        System.out.println("Materia: " + m.getNome());

                    }
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
