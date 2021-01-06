import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int X, cont=0, aux=0;
        
        X = teclado.nextInt();

        while(cont<=5){
            
            if(X%2!=0){
                cont++;
                System.out.println(X);
            }
            X++;

    }
}
}