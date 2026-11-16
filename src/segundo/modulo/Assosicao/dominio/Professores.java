package segundo.modulo.aulas.dominio;

public class Professores {
    private String nome;
    Materia[] materias;

    public Professores(String nome, Materia[] materia) {
        this.nome = nome;
        this.materias = materia;
    }


    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
