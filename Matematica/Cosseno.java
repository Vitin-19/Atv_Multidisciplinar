public class Cosseno extends Trigono {
    @Override
    public void apresentarDefinicao() {
        System.out.println("O cosseno de um ângulo é a razão entre a medida do cateto adjacente e a medida da hipotenusa.");

        System.out.println("Lei dos Cossenos: A Lei dos Cossenos estabelece que em qualquer triângulo, o quadrado de um dos lados, corresponde à soma dos quadrados dos outros dois lados, menos o dobro do produto desses dois lados pelo cosseno do ângulo entre eles.");
    }

    public void exibirFormula() {
        System.out.println("Cosseno = Cateto adjacente sobre Hipotenusa");

        System.out.println("Fórmula da Lei dos Cossenos: a² = b² + c² - 2.b.c.cos, b² = a² + c² - 2.a.c.cos, c² + a² + b² - 2.a.b.cos");
    }
}