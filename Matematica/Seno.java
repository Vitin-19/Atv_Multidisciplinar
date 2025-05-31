import java.util.Scanner;
public class Seno extends Trigono {
    public Seno(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF,
            double CossenoF) {
        super(Definicao, Hipotenusa, CatAdjacente, CatOposto, TangenteF, SenoF, CossenoF);
        set_Definicao("Seno");
        set_CatOposto(CatOposto);
        set_Hipotenusa(Hipotenusa);
        set_SenoF(CossenoF);
    }

    Scanner scanner = new Scanner(System.in);
    double CatOposto, Hipotenusa, SenoF;
    


    @Override
    public void apresentarDefinicao() {
        System.out.println("---- SENO ----\n");
        System.out.println("Definição: O seno de um ângulo é a razão entre o cateto oposto ao referido ângulo e a hipotenusa de um triângulo retângulo. Dessa forma, pode-se entender que a razão é o resultado da divisão da medida do cateto oposto pela medida da hipotenusa. Porém, essa relação depende do ângulo considerado. \nLei dos Senos: A Lei dos Senos estabelece que num determinado triângulo, a razão entre o valor de um lado e o seno de seu ângulo oposto, será sempre constante.");

        System.out.println("\nDefinição: Lei dos Senos --> A Lei dos Senos estabelece que num determinado triângulo, a razão entre o valor de um lado e o seno de seu ângulo oposto, será sempre constante.");
    }

    public void exibirFormula() {
        System.out.println("---- Calculando Seno ----\n");

        System.out.println("\nA fórmula para calcular o Seno é essa: \nSeno = Cateto oposto sobre a Hipotenusa");

        System.out.println("Insira o valor do Cateto Oposto: ");
        CatOposto = scanner.nextDouble();
        System.out.println("Insira o valor da Hipotenusa: ");
        Hipotenusa = scanner.nextDouble();

        SenoF = CatOposto / Hipotenusa;

        System.out.println("O valor do Seno é: " + SenoF);
        
    }
}
