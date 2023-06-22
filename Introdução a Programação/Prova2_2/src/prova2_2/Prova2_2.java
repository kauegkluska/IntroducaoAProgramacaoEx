
package prova2_2;

import java.util.Scanner;

public class Prova2_2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t1, t2, q;
        
        q = leQuantidade();
        
        t1 = leTermos(-1, "1");
                
        t2 = leTermos(t1, "2");
        
        calculaSerie(q,t1,t2);
               
    }
    public static int leQuantidade(){
        int q;
        System.out.println("Quantidade de Termos (3 a 100): ");
        q =Integer.parseInt(input.nextLine());
        while(q < 3 || q > 100){
            System.out.println("Digite um valor válido ");
            q = Integer.parseInt(input.nextLine());
        }
        return q;
    }
    public static int leTermos(int anterior, String texto){
        int t;
        System.out.println("Termo "+ texto +":");
        t = Integer.parseInt(input.nextLine());
         while(t < 0 || t <= anterior){
            System.out.println("Digite um valor válido ");
            t = Integer.parseInt(input.nextLine());        
         }
        return t;
    }
    public static void calculaSerie(int q, int t1, int t2){   
        int novo;
        System.out.println(t1);       
        System.out.println(t2);
        for(int i = 3; i <= q;i++){
            if(i%2 != 0){
            novo = t1 + t2;
            t1 = t2;
            t2 = novo;
            }
            else{
            novo = t1 - t2;
            t1 = t2;
            t2 = novo;
            } 
            System.out.println(novo);
        }
    }
   
}
