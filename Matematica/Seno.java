package Matematica;

// IMPORTATIONS
import java.util.Scanner;
// Declaração da classe Seno que herda do Trigono
public class Seno extends Trigono {
    // Contrutor do Seno
    public Seno(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF, double CossenoF) {
        // Chama o construtor da Trigono
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);

        set_Definicao("Seno");
        set_CatOposto(CatOposto);
        set_Hipotenusa(Hipotenusa);
        set_SenoF(CossenoF);
    }
    // Instância do Scanner 
    Scanner scanner = new Scanner(System.in);
    // Declarações de variáveis utilizadas no método exibirFormulas
    double CatOposto, Hipotenusa, SenoF;
    

    // Sobreescrebve o método abstrato do Trigono
    @Override
    //Método para apresentar a definição do Seno
    public void apresentarDefinicao() {
        System.out.println("---- SENO ----\n");
        System.out.println("DEFINIÇÃO: O seno de um ângulo é a razão entre o cateto oposto ao referido ângulo e a hipotenusa de um triângulo retângulo. Dessa forma, pode-se entender que a razão é o resultado da divisão da medida do cateto oposto pela medida da hipotenusa. Porém, essa relação depende do ângulo considerado.");

        System.out.println("\nLei dos Senos --> A Lei dos Senos estabelece que num determinado triângulo, a razão entre o valor de um lado e o seno de seu ângulo oposto, será sempre constante.");
    }

    // Método para exibirFormula do Seno
    public void exibirFormula() {
        System.out.println("---- Calculando Seno ----\n");

        System.out.println("\nA fórmula para calcular o Seno é essa: \nSeno = Cateto oposto sobre a Hipotenusa");

        System.out.println("Insira o valor do Cateto Oposto: ");
        // Lê o valor do Cateto Oposto inserido pelo usuário
        CatOposto = scanner.nextDouble();
        System.out.println("Insira o valor da Hipotenusa: ");
        // Lê o valor da Hipotenusa inserido pelo usuário
        Hipotenusa = scanner.nextDouble();
        // Realiza o calculo
        SenoF = CatOposto / Hipotenusa;     
        // Exibe o valor final do calculo
        System.out.println("O valor do Seno é: " + SenoF);
        
    }
}
