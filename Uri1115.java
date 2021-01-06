import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, y;
        String message="";

        do{

        x=teclado.nextInt();
        y=teclado.nextInt();
    
        if(x>0){
            if(y>0){
                message = "primeiro";
                System.out.println(message);
            }
            else{
                message = "quarto";
                System.out.println(message);
            }
        }
        else{
            if(x<0){
                if(y>0){
                    message = "segundo";
                    System.out.println(message);
                }
                else{
                    message = "terceiro";
                    System.out.println(message);
                }
            }


        }
        
        
        } while(x!=0 && y!=0);
    }
}