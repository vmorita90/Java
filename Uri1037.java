import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x, y;
        String message="";
        
        x = teclado.nextDouble();
        
    
    

        if(x>=0 && x<=25.0){
            message = "Intervalo [0,25]";
        }
        else if(x>25.0 && x<=50){
            message = "Intervalo (25,50]";
        }
        else if(x>50.0 && x<=75){
            message = "Intervalo (50,75]";
        }
        else if(x>75.0 && x<=100.0){
            message = "Intervalo (75,100]";
        }
        else{
            message = "Fora de intervalo";

        }

        System.out.printf("%s\n", message);

    }


}
