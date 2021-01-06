import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        int numero, contador=0, resultado=0;

  
        for(contador=1; contador<=5;contador++){
            numero = teclado.nextInt();
            if(numero%2 == 0){
                resultado++;
            }
     

        }
        System.out.printf("%d valores positivos\n", resultado);
    }

}