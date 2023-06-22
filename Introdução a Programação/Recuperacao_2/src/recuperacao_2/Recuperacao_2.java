
package recuperacao_2;

import java.util.Scanner;

public class Recuperacao_2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n, brinco, maiorEngordaBrinco = 0, maiorRendimentoBrinco = 0;
        float pesoAntes, pesoDia, pesoCarcaca, engorda, rendimento, maiorEngorda = 0,
        maiorRendimento = 0, pesoTotal = 0;
        System.out.println("Digite a quantidade de animais: ");
        n = Integer.parseInt(input.nextLine());
        
        
        for(int i = 1;i < n + 1;i++){
        System.out.println("Digite o número do brinco do animal "+i+": ");
        brinco = Integer.parseInt(input.nextLine());
        System.out.println("Digite o peso antes do confinamento: ");
        pesoAntes = Float.parseFloat(input.nextLine());
        System.out.println("Digite o peso no dia do Abate: ");
        pesoDia = Float.parseFloat(input.nextLine());
        System.out.println("Digite o peso da carcaça: ");
        pesoCarcaca = Float.parseFloat(input.nextLine());     
        engorda = calculeEngorda(pesoAntes, pesoDia);
        System.out.println("O animal engordou: "+engorda);
        rendimento = calculeRendimento(pesoDia, pesoCarcaca);
        System.out.println("Rendimento de Carcaça do animal: "+rendimento+"%");
        if(engorda > maiorEngorda){
            maiorEngorda = engorda;
            maiorEngordaBrinco = brinco;
        }
        if(rendimento > maiorRendimento){
            maiorRendimento = rendimento;
            maiorRendimentoBrinco = brinco;
        }
        pesoTotal = pesoTotal + pesoAntes;
        
        }
        apresentaResultado(maiorEngorda,maiorEngordaBrinco,
        maiorRendimento,maiorRendimentoBrinco, pesoTotal, n);
       
        }
        public static float calculeEngorda(float pesoAntes, float pesoDia){
            return pesoDia - pesoAntes;
        }
        public static float calculeRendimento(float pesoDia, float pesoCarcaca){           
            float rendimento = (pesoCarcaca * 100) / pesoDia;
            
            if(rendimento > 53){
                System.out.println("Animal bom");
            }
            else if(rendimento > 50){
                System.out.println("Animal regular");
            }
            else{
                System.out.println("Animal Ruim");
            }
            return rendimento;

    }
        public static void apresentaResultado(float maiorEngorda, int maiorEngordaBrinco,
                float maiorRendimento, int maiorRendimentoBrinco, float pesoTotal, float n){
            float pesoMedio = pesoTotal / n;
            System.out.println("O peso Médio dos animais antes do confinamento era: "+pesoMedio);
            System.out.println(maiorEngordaBrinco+" é o animal com maior ganho de peso com: "+maiorEngorda+"Kg.");
            System.out.println(maiorRendimentoBrinco+" é o animal com maaior rendimento de carcaca com: "+maiorRendimento+"%");            
            if(maiorRendimentoBrinco == maiorEngordaBrinco){
                System.out.println("O animal com maior ganho de peso durante o confinamento e com maior rendimento de carcaça é o mesmo");
            }
            else{
                System.out.println("O animal com maior ganho de peso durante o confinamento e com maior rendimento de carcaça não é o mesmo."); 
            }
            
        }
}
