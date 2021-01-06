import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double x, reajuste, novosalario, percentual;
                
        x = teclado.nextDouble();
           
  

        if(x>=0 && x<=400.00){
            reajuste = 0.150;
        }
        else if(x>=400.01 && x<=800.00){
            reajuste = 0.120;
        }
        else if(x>=800.01 && x<=1200.00){
            reajuste = 0.100;
        }
        else if(x>=1200.01 && x<=2000.00){
            reajuste = 0.070;
        }
        else{
            reajuste = 0.040;

        }

        novosalario=x*(1.00+reajuste);
        percentual = reajuste*100.000;


        System.out.printf("Novo salario: %.2f\n", novosalario);
        System.out.printf("Reajuste: %.2f\n", novosalario-x);
        System.out.printf("Em percentual: %.0f %%\n", percentual);

    }


}
