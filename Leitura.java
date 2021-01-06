// importar o componente scanner para fazer leitura do teclado, pacote Util da linguagem Java

import java.util.Scanner;


public class Leitura{
    public static void main(String args[]){

        // Passo 1. Declarar um componoente (variável) do tipo Scanner;
        Scanner teclado;

        // Passo 2. indicar que o scanner vai ler do teclado;
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println("Por favor digite um valor inteiro");
        a = teclado.nextInt();

        System.out.println("Por favor digite um valor real");
        b = teclado.nextDouble();

        System.out.println("Voce digitou os valores " + a + " e " + b);

    }    


    
}