package Matematica;

import java.util.Scanner;

public class Cosseno extends Trigono {
    public Cosseno(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF,
            double CossenoF) {
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);
        set_Definicao("Cosseno");
        set_CatAdjacente(CatAdjacente);
        set_Hipotenusa(Hipotenusa);
        set_CossenoF(CossenoF);
        
    }

    Scanner scanner = new Scanner(System.in);
    double CatAdjacente, CossenoF, Hipotenusa;

    @Override
    public void apresentarDefinicao() {
        System.out.println("---- COSSENO ----\n");
        System.out.println("Definição: O cosseno de um ângulo é a razão entre a medida do cateto adjacente e a medida da hipotenusa.");

        System.out.println("\nDefinição: Lei dos Cossenos --> A Lei dos Cossenos estabelece que em qualquer triângulo, o quadrado de um dos lados, corresponde à soma dos quadrados dos outros dois lados, menos o dobro do produto desses dois lados pelo cosseno do ângulo entre eles.");
    }

    public void exibirFormula() {
        System.out.println("---- Calculando Cosseno ----\n");
        System.out.println("\nA fórmula para calcular o Cosseno é essa: \nCosseno = Cateto adjacente sobre Hipotenusa");
        
        System.out.println("Insira o valor do Cateto Adjacente: ");
        CatAdjacente = scanner.nextInt();
        System.out.println("Insira o valor da Hipotenusa: ");
        Hipotenusa = scanner.nextInt();

        CossenoF = CatAdjacente / Hipotenusa;

        System.out.println("O valor do Cosseno é: " + CossenoF);

    }
}