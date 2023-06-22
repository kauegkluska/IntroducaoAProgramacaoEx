
package prova2_3;

import java.util.Scanner;

public class Prova2_3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int funcionarios;
        float salarioMinimo, horas, horasExtras,dependentes, salarioBruto, salarioLiquido, mediaBruto, brutoTotal = 0, maior = 0;
        
        System.out.println("Salario Minimo: ");
        salarioMinimo = Float.parseFloat(input.nextLine());
        System.out.println("Número de Funcionarios: ");
        funcionarios = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < funcionarios;i++){
                       
            System.out.println("Número de Horas Trabalhadas: ");
            horas = Float.parseFloat(input.nextLine());
            System.out.println("Número de Horas Extras Trabalhadas: ");
            horasExtras = Float.parseFloat(input.nextLine());
            System.out.println("Número de Dependentes: ");
            dependentes = Float.parseFloat(input.nextLine());
            salarioBruto = calculaBruto(salarioMinimo, horas, horasExtras, dependentes);
            salarioLiquido = calculaLiquido(salarioBruto);
            System.out.println("Salário Bruto: "+salarioBruto);
            System.out.println("Salário Líquido: "+salarioLiquido);
            brutoTotal = brutoTotal + salarioBruto;
            if(salarioBruto > maior){
                maior = salarioBruto;
            }
            
        }
        mediaBruto = brutoTotal / funcionarios;
        System.out.println("O maior salário bruto entre os funcionários é: "+maior);
        System.out.println("A media entre os salarios brutos é: "+mediaBruto);        

    }
    public static float calculaBruto(float salarioMinimo, float horas, float horasExtras, float dependentes){
        float horasExtrasValor, salarioMes, valorHora = salarioMinimo / 10;
        horasExtrasValor = (valorHora * 50/100f) + valorHora;
        salarioMes = valorHora * horas;
        salarioMes = salarioMes + dependentes * 320;
        salarioMes = salarioMes + horasExtrasValor * horasExtras;
        return salarioMes;
    }
    public static float calculaLiquido(float salarioBruto){
        float irpf, inss;
        if(salarioBruto < 2000){
            irpf = 0;            
        }
        else if (salarioBruto < 3999){
            irpf = salarioBruto * 10/100;
        }
        else if (salarioBruto < 7999){
            irpf = salarioBruto * 15/100;
        }
        else{
            irpf = salarioBruto * 20/100;
        }
        if(salarioBruto < 5000){
            inss = salarioBruto * 8/100;
        }
        else{
            inss = salarioBruto * 11/100;
        }
        return salarioBruto - irpf - inss;
    }
}
