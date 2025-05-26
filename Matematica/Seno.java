import java.util.Scanner;
public class Seno extends Trigono {
    Scanner sc1 = new Scanner(System.in);
    
    int AnguloSeno = sc1.nextInt();
    int catetoOposto = sc1.nextInt();


    @Override
    public void apresentarDefinicao() {
        System.out.println("O seno de um ângulo é a razão entre o cateto oposto ao referido ângulo e a hipotenusa de um triângulo retângulo. Dessa forma, pode-se entender que a razão é o resultado da divisão da medida do cateto oposto pela medida da hipotenusa. Porém, essa relação depende do ângulo considerado.");
        System.out.println("Lei dos Senos: A Lei dos Senos estabelece que num determinado triângulo, a razão entre o valor de um lado e o seno de seu ângulo oposto, será sempre constante.");
    }

    public void exibirFormula() {
        System.out.println("Seno = Cateto oposto sobre a Hipotenusa");
        System.out.println("Fórmula da lei dos senos: a/senA = b/senB = c/senC");
    }
}
