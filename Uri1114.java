import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, pass;

        x=2002;

        do{
            
            pass = teclado.nextInt();
            if(pass==x){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }

            }while(x!=pass);

        }

    }
