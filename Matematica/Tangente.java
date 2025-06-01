package Matematica;

import java.util.Scanner;
public class Tangente extends Trigono{

    public Tangente(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF,
            double CossenoF) {
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);
        set_Definicao("Tangente");

        set_TangenteF(TangenteF);
        set_CatOposto(CatOposto);
        set_CatAdjacente(CatAdjacente);
    }


    Scanner scanner = new Scanner(System.in);
    double CatOposto, CatAdjacente, TangenteF;
    

    @Override
    public void apresentarDefinicao() {
        System.out.println("---- TANGENTE ----\n");
        System.out.println("Definição: A tangente de um ângulo é a razão do cateto oposto e a medida do cateto adjacente.");

        System.out.println("\nDefinição: Lei das Tangentes --> A Lei das Tangentes estabelece a relação entre as tangentes de dois ângulos de um triângulo e os comprimentos de seus lados opostos.");
    }

    public void exibirFormula() {
        System.out.println("---- Calculando Tangente ----\n");
        System.out.println("\nA fórmula para calcular a Tangente é essa: \nTangente = Cateto oposto sobre o Cateto adjacente ");

        System.out.println("Insira o valor do Cateto Oposto: ");
        CatOposto = scanner.nextDouble();
        System.out.println("Insira o valor do Cateto Adjacente: ");
        CatAdjacente = scanner.nextDouble();

        TangenteF = CatOposto/CatAdjacente;

        System.out.println("O valor da Tangente é: " + TangenteF);
    }
}
