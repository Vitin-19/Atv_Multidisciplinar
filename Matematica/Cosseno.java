package Matematica;

//IMPORTATIONS
import java.util.Scanner;

//Declaração da classe Cosseno que herda do Trigono
public class Cosseno extends Trigono {

    //Construtor da Cosseno
    public Cosseno(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF, double CossenoF) {

    //Chama o construtor do Trigono
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);

        set_Definicao("Cosseno");
        set_CatAdjacente(CatAdjacente);
        set_Hipotenusa(Hipotenusa);
        set_CossenoF(CossenoF);
        
    }

    //Instância do Scanner
    Scanner scanner = new Scanner(System.in);
    //Declaração de variáveis usadas no exibirFormula
    double CatAdjacente, CossenoF, Hipotenusa;

    
    // Sobreescrebve o método abstrato do Trigono
    @Override
    //Método para apresentar a definição do Cosseno
    public void apresentarDefinicao() {
        System.out.println("---- COSSENO ----\n");
        System.out.println("DEFINIÇÃO: O cosseno de um ângulo é a razão entre a medida do cateto adjacente e a medida da hipotenusa.");

        System.out.println("\nLei dos Cossenos --> A Lei dos Cossenos estabelece que em qualquer triângulo, o quadrado de um dos lados, corresponde à soma dos quadrados dos outros dois lados, menos o dobro do produto desses dois lados pelo cosseno do ângulo entre eles.");
    }

    // Método para exibir e calcular as formulas do Cosseno
    public void exibirFormula() {
        System.out.println("---- Calculando Cosseno ----\n");
        System.out.println("\nA fórmula para calcular o Cosseno é essa: \nCosseno = Cateto adjacente sobre Hipotenusa");
        
        System.out.println("Insira o valor do Cateto Adjacente: ");
        // Lê o valor do Cateto Adjacente inserido pelo usuário
        CatAdjacente = scanner.nextInt(); 
        System.out.println("Insira o valor da Hipotenusa: ");
        // Lê o valor da hipotenusa inserida pelo usuário
        Hipotenusa = scanner.nextInt();
        // Realiza o calculo
        CossenoF = CatAdjacente / Hipotenusa;
        // Apresenta o valor final do calculo
        System.out.println("O valor do Cosseno é: " + CossenoF);

    }
}