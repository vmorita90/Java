import java.util.Scanner;

public class TabuadaDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, contador=0;

        System.out.println("Digite o numero para calcular a tabuada");
        numero = teclado.nextInt();

        do{
            System.out.println(numero + " x " + contador + " = " + (contador*numero));
            contador++;

        } while (contador <= 10);

    }

}