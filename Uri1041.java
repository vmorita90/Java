import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x, y;
        String message="";
        
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        //message = "teste";



        if(x==0.0 && y!=0.0 ){
            message = "Eixo Y";
        }
        else if(y==0.0 && x!=0.0){
            message = "Eixo X";
        }
        else if(x==0.0 && y==0.0){
            message = "Origem";
        }
        else if(x>0.0){
            if(y>0.0){
                message = "Q1";
            }
            else{
                message = "Q4";
            }
        }
        else{
            if(x<0.0){
                if(y>0.0){
                    message = "Q2";
                }
                else{
                    message = "Q3";
                }
            }


        }
        
        System.out.printf("%s\n", message);

        }
        

    }


            
        

        