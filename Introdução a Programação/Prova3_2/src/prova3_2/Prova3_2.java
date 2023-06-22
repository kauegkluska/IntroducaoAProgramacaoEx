package prova3_2;

import java.util.Scanner;

public class Prova3_2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;
        String [] nomes = new String[10];
        float [] salario = new float[10];
        int maiorSaldo = 0;
        int e = 0;
        float somaSalario = 0;
        
        for(int i = 0;i < 10;i++){
            System.out.println("Nome do usuario "+ i + "" +": ");
            nomes[i] = input.nextLine();
        }
        for(int i = 0;i < 10;i++){
            System.out.println("Salário inicial "+ i + "" +": ");
            salario[i] = Integer.parseInt(input.nextLine());
        }
    
        while(e != 4){
        System.out.println("Operações: ");
        System.out.println("1- Sacar Dinheiro.");
        System.out.println("2- Depositar Dinheiro");
        System.out.println("3- Consultar Saldo");
        System.out.println("4- Sair");
        e = Integer.parseInt(input.nextLine());
        switch (e){
            case 1: sacaDinheiro(nomes, salario);
            break;
            case 2: depositaDinheiro(nomes, salario);
            break;
            case 3: consultaSaldo(nomes, salario);
            }
        }
        
        System.out.println("Voce selecionou a opção sair");
        for(int i = 0; i < 10;i++){
            System.out.println(nomes[i]+ " -  R$"+salario[i]);
            somaSalario = somaSalario + salario[i];
            if(salario[i] > maiorSaldo)
            maiorSaldo = i;
        }
        System.out.println("O saldo de todos os usuários somados é de: R$"+somaSalario);
        System.out.println("O usuário com maior saldo é: "+nomes[maiorSaldo]);
        System.out.println("Com R$"+salario[maiorSaldo]);
        
        
 
            
    }
    public static void sacaDinheiro(String[] nomes, float[]salario){
        System.out.println("Nome do usuário: ");
        String nome = input.nextLine();
        for(int i = 0;i < 10; i++){
            if(nome.equals(nomes[i])){
                System.out.println("Valor a ser sacado: ");
                float valor = Float.parseFloat(input.nextLine());
                if(valor > salario[i])
                    System.out.println("Saldo insuficiente");
                else
                    salario[i] = salario[i] - valor;     
            }
            
        }       
    }
    public static void depositaDinheiro(String[] nomes, float[]salario){
        System.out.println("Nome do usuário: ");
        String nome = input.nextLine();
        for(int i = 0;i < 10; i++){
        if(nome.equals(nomes[i])){
                System.out.println("Valor a ser depositado: ");
                float valor = Float.parseFloat(input.nextLine());
                salario[i] = salario[i] + valor;       
            }
            
        }          
    }
    public static void consultaSaldo(String[] nomes, float[]salario){
            System.out.println("Nome do usuário: ");
            String nome = input.nextLine();
            for(int i = 0;i < 10; i++){
            if(nome.equals(nomes[i])){
                System.out.println("O saldo do usuário é: "+salario[i]);
                
            }
            }
    }
    }
   
    


