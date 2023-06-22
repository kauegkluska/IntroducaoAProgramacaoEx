
package prova3_1;

import java.util.Scanner;

public class Prova3_1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Tamanho da matriz quadrada (maior que 2): ");   
        n = Integer.parseInt(input.nextLine());
        while (n<2){
      
        System.out.println("Digite um número maior que 2! ");
        System.out.println("Tamanho da matriz quadrada (maior que 2): ");   
        n = Integer.parseInt(input.nextLine());
        }

        int [][] A = new int[n][n];
        for(int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.println("Valor da matriz na posição:"+i+", "+j);
                A[i][j] = Integer.parseInt(input.nextLine());}        
        }
        
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");

        }
        inverteMatriz(A);
        
     
    
    }
    public static void inverteMatriz(int[][] matriz){
        int [] normal = new int[10];
        int [] invertida = new int[10];
        for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 10; j++) {
                normal[j] = matriz[i][j];
                invertida[j] = matriz[matriz.length - 1 - i][j];
                matriz[i][j] = invertida[j];
                matriz[matriz.length - 1 - i][j] = normal[j];
           }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
            
    }
}

   
