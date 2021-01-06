import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int X, cont=1, numero;
        String message1="", message2="";
        
        X = teclado.nextInt();

        for(cont=1; cont<=X;cont++){
            numero = teclado.nextInt();
            message1="";
            message2="";
            //valores pares
            if(numero%2 == 0 && numero!=0){
                message1="EVEN ";
            }
            else{
                message1="ODD ";
            }
            if(numero>0){
                message2="POSITIVE";
            }
            if(numero<0){
                message2="NEGATIVE";
            }
            if(numero==0){
                message1="NULL";
            }
            
            System.out.printf("%s%s\n", message1, message2);
            }
            }
            

        }

    
