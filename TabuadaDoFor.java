import java.util.Scanner;

public class TabuadaDoFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, contador=0;

        System.out.println("Digite o numero para fazer a tabuada");
        numero = teclado.nextInt();

        for(contador=0; contador<=10;contador++){
            System.out.println(numero + " x " + contador + " = " + (numero*contador));

        }

    }

}

