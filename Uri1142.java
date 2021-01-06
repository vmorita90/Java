import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, cont=0;
        x=teclado.nextInt();

        do{
            
        cont++;
        if(cont%4==0){
            System.out.println("PUM");
        }
        else{
            System.out.printf("%d ", cont);
        }

                 
        } while(cont!=x*4);
        

    }
}