import java.util.Scanner;

public class Uri2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int D, p=0;
                
        D = teclado.nextInt();


        if(D<=800){
            p = 1;
        }
        else if(D>800 && D<=1400){
            p = 2;
        }
        else if(D>1400 && D<=2000){
            p = 3;
        }
                   
  
        System.out.printf("%d\n", p);

    }


}
