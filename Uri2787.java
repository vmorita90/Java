import java.util.Scanner;

public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int L, C, color;

        L = teclado.nextInt();
        C = teclado.nextInt();

        if(L%2!=0){
            if(C%2!=0){
                color=1;
            }
            else{
                color=0;
            }
        }
        else{
            if(C%2!=0){
                color=0;
            }
            else{
                color=1;
            }
        }

    System.out.printf("%d\n", color);


    }
    
