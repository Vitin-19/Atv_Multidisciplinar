package Matematica;

// IMPORTATIONS
import java.util.Scanner;
// Declara da classe Tangente que herda da Trigono
public class Tangente extends Trigono{
    // Construtor da Tangente
    public Tangente(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF, double CossenoF) {
        // Chama o construtor da Trigono
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);

        set_Definicao("Tangente");
        set_TangenteF(TangenteF);
        set_CatOposto(CatOposto);
        set_CatAdjacente(CatAdjacente);
    }

    // Insttância do Scanner 
    Scanner scanner = new Scanner(System.in);
    // Declarações de variáveis
    double CatOposto, CatAdjacente, TangenteF;
    
    // Sobreescrebve o método abstrato do Trigono
    @Override
    // Método para apresentar a definição da Tangente
    public void apresentarDefinicao() {
        System.out.println("---- TANGENTE ----\n");
        System.out.println("DEFINIÇÃO: A tangente de um ângulo é a razão do cateto oposto e a medida do cateto adjacente.");

        System.out.println("\nLei das Tangentes --> A Lei das Tangentes estabelece a relação entre as tangentes de dois ângulos de um triângulo e os comprimentos de seus lados opostos.");
    }

    // Método para exibir a formula da Tangente
    public void exibirFormula() {
        System.out.println("---- Calculando Tangente ----\n");
        System.out.println("\nA fórmula para calcular a Tangente é essa: \nTangente = Cateto oposto sobre o Cateto adjacente ");

        System.out.println("Insira o valor do Cateto Oposto: ");
        // Lê o valor do Cateto Oposto inserido pelo usuário
        CatOposto = scanner.nextDouble();
        System.out.println("Insira o valor do Cateto Adjacente: ");
        // Lê o valor do Cateto Adjacente inserido pelo usuário
        CatAdjacente = scanner.nextDouble();

        TangenteF = CatOposto/CatAdjacente;
        // Exibe o valor final do calculo
        System.out.println("O valor da Tangente é: " + TangenteF);
    }
}
