public class Seno extends Trigono {
    private Integer AnguloSeno;

    public AnguloSeno(Integer AnguloSeno) {
        this.AnguloSeno = AnguloSeno;
    }

    @Override
    public String apresentarDefinicao() {
        return System.out.println("O seno de um ângulo é a razão entre o cateto oposto ao referido ângulo e a hipotenusa de um triângulo retângulo. Dessa forma, pode-se entender que a razão é o resultado da divisão da medida do cateto oposto pela medida da hipotenusa. Porém, essa relação depende do ângulo considerado.");
    }
}
