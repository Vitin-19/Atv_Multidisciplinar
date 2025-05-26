public class Tangente extends Trigono {
    @Override
    public void apresentarDefinicao() {
        System.out.println("A tangente de um ângulo é a razão do cateto oposto e a medida do cateto adjacente.");

        System.out.println("Lei das Tangentes: A Lei das Tangentes estabelece a relação entre as tangentes de dois ângulos de um triângulo e os comprimentos de seus lados opostos.");
    }

    public void exibirFormula() {
        System.out.println("Tangente = Cateto oposto sobre o Cateto adjacente");

        System.out.println("a + b / a - b = tan[1/2 (A + B)] / tan[1/2 (A - B)]");
    }
}
