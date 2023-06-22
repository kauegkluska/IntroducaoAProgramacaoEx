
package recuperacao_1;

import java.util.Scanner;

public class Recuperacao_1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        boolean primo;
        System.out.println("Digite um número inteiro maior ou igual a 2: ");
        num = Integer.parseInt(input.nextLine());
        while(num != 0){
            primo = verificarPrimo(num);
            if(primo == true){
                System.out.println(num+" é primo.");
            }
            else{
                System.out.println(num+" não é primo.");
            }
            System.out.println("Digite um número inteiro maior ou igual a 2: ");
            num = Integer.parseInt(input.nextLine());
            
        }
 
        }
    
    public static boolean verificarPrimo(int n){
        boolean primo = false;
        
        
        for(int i = 1;i<n+1;i++){
            
        if((i != n && i != 1 && i != 0)&& n % i == 0){    
            primo = false;
        }
        else{
            primo = true;
        }

        
    }
    return primo;
  }
}