import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero, soma=0;
        int contador=0, resultado=0;

  
        for(contador=1; contador<=6;contador++){
            numero = teclado.nextFloat();
            if(numero>0){
                soma=soma+numero;
                resultado++;
            }
     

        }
        System.out.printf("%d valores positivos\n", resultado);
        System.out.printf("%.1f\n", soma/resultado);
    }

}