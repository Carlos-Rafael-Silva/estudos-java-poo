package segundo.modulo.aulas.exeception.dominio.teste.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("src/projeto/teste.txt");
        try {
            boolean isnewFile = file.createNewFile();
            System.out.println("Arquivo criado " + isnewFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

