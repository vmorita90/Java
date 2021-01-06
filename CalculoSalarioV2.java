import java.util.Scanner;

public class CalculoSalarioV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        //entrada:
        System.out.print("Digite o salario do funcionario: ");
        salario = teclado.nextDouble();

        if (salario<=1000.){
            imposto = 0.0;
        }
        else if (salario<=1800.0){
            imposto = salario*0.1;
        }
        else if(salario<=2500.){
            imposto = salario*0.15;                 
        }
        else if(salario<=4000.0){
            imposto = salario*0.20;
        }
        else{
            imposto = 1300.0;
        }
            
        System.out.printf("Seu salario base: R$ %.2f\n", salario);
        System.out.printf("Imposto Retido: R$ %.2f\n", imposto);
        System.out.printf("Salario Liquido: R$ %.2f\n", salario - imposto);

        
    }

}