import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero;
        int contador=0, resultado=0;

  
        for(contador=1; contador<=6;contador++){
            numero = teclado.nextFloat();
            if(numero>0){
                resultado++;
            }
     

        }
        System.out.printf("%d valores positivos\n", resultado);
    }

}