package segundo.modulo.aulas;

import segundo.modulo.aulas.dominio.Escola;
import segundo.modulo.aulas.dominio.Materia;
import segundo.modulo.aulas.dominio.Professores;
//Aula 66 - Orientação Objetos - Associação pt 03 - Associação unidirecional muitos para um

public class Aula18 {
    public static void main(String[] args) {

        Materia materia = new Materia("Portugues" );
        Materia materia2 = new Materia("Matematica" );

        Materia[] materias = {materia, materia2};

        Professores  professor = new Professores("Pedro",  materias);


    }
}
