import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int x; // distancia;
        float y; // consumo
        
        float z; //média de consumo

        // entrada
        x = teclado.nextInt();
        y = teclado.nextFloat();

        // processamento
        z = x / y; //resultado real

        // saida

        System.out.printf("%.3f km/l", z);


    }



}