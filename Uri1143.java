import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, cont=0;
        x=teclado.nextInt();

        do{
            
        cont++;

       
            System.out.printf("%d %d %d\n", cont, cont*cont, cont*cont*cont);
       

                 
        } while(cont!=x);
        

    }
}