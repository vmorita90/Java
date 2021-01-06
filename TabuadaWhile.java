import java.util.Scanner;

public class TabuadaWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador=0;

        System.out.println("Digite o numero pra calcular a tabuada");
        numero = teclado.nextInt();

        while(contador<=10){
            System.out.println(numero + " x " + contador + " = " + (numero*contador));
            contador=contador+1;


        }


    }
}