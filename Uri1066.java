import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        int numero, contador=0, pares=0, impares=0, positivos=0, negativos=0;

  
        for(contador=1; contador<=5;contador++){
            numero = teclado.nextInt();

            //valores pares
            if(numero%2 == 0){
                pares++;
            }
            else{
                impares++;
            }
            if(numero>0){
                positivos++;
            }
            if(numero<0)
            {
                negativos++;
            }
     

        }
        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
    }

}