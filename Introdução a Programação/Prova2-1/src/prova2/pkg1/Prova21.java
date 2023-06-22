package prova2.pkg1;

import java.util.Scanner;

public class Prova21 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int fitasEstragadas;
        double receita, gastoReposicao, lucro, locacaoPreco, fitasQtde, fitaNovaPreco;
        System.out.println("Quantidade de fitas no início do ano: ");
        fitasQtde = Double.parseDouble(input.nextLine());
        System.out.println("Valor da locação: ");
        locacaoPreco = Double.parseDouble(input.nextLine());
        System.out.println("Valor de uma fita nova: ");
        fitaNovaPreco = Double.parseDouble(input.nextLine());
        
        receita = calculaReceita(fitasQtde, locacaoPreco);
        fitasEstragadas = calculaEstrago(fitasQtde);
        gastoReposicao = calculaReposicao(fitasEstragadas, fitaNovaPreco);
        lucro = calculaLucro(receita, gastoReposicao);
        apresentaResultado(receita, fitasEstragadas, gastoReposicao, lucro);
    }   
    public static double calculaReceita(double fitasQtde, double locacaoPreco){
        double uma, duas, tres, quatro, cinco;        
        uma = ((fitasQtde * 20/100)*locacaoPreco)*12;        
        duas = 2*((fitasQtde * 10/100)*locacaoPreco)*12;        
        tres = 3*((fitasQtde * 15/100)*locacaoPreco)*12;        
        quatro = 4*((fitasQtde * 25/100)*locacaoPreco)*12;       
        cinco = 5*((fitasQtde * 30/100)*locacaoPreco)*12;
        return uma + duas + tres + quatro + cinco;     
    }
    public static int calculaEstrago(double fitasQtde){
        return (int) (fitasQtde * 3/100);
    }
    public static double calculaReposicao(int fitasEstragadas, double fitaNovaPreco){
        return (fitasEstragadas / 2)*fitaNovaPreco;
    }
    public static double calculaLucro(double receita, double gastoReposicao){
        return receita - gastoReposicao - 2500 * 12;
    }
    public static void apresentaResultado(double receita,int fitasEstragadas,double gastoReposicao,double lucro){
        System.out.println("Receita anual: "+receita);
        System.out.println("Fitas estragadas: "+fitasEstragadas);
        System.out.println("Gasto com a reposição das fitas: "+gastoReposicao);
        System.out.println("Lucrro Anual: "+lucro);
        if(lucro < 0)
            System.out.println("Prejuízo");        
        else if (lucro < 36000)
            System.out.println("Lucro Baixo");        
        else
            System.out.println("Lucro Alto");        
    }
}
