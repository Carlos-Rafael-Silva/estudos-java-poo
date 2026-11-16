package segundo.modulo.aulas.exeception.dominio.teste.runtime;

//Aula 98 - Exceções pt 04 - Lançando exceção unchecked

import java.util.Scanner;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println( divisao(1, 2));

        Scanner sys = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int id = sys.nextInt();
        if(id <18){
            throw new IllegalAccessException("Menor de idade é proibido");
        }
    }

    private static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Valor numérico tem que ser maior que 0");
        }
        return a/b;

    }
}
