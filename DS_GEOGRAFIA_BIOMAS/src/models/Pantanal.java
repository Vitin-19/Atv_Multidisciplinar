package DS_GEOGRAFIA_BIOMAS.src.models;
public class Pantanal extends Bioma {
    public Pantanal() {
        setNome("Pantanal");
        setClima("Tropical");
    };

    @Override
    public void apresentarNome() {
        System.out.println("\nNome: " + getNome());
    };

    @Override
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Varia de períodos de cheia e de seca");
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma Pantanal:");
        System.out.println("\nO Bioma Pantanal, considerado o de menor extensão territorial do país, abrange dois estados brasileiros: Mato Grosso e Mato Grosso do Sul.");
        System.out.println("\nO clima predominante é tropical continental com altas temperaturas e chuvas, de verão chuvoso e inverno seco.");
        System.out.println("\nA vegetação do pantanal é marcada pelas gramíneas, árvores de médio porte, plantas rasteiras e arbustos. O nome desse bioma remete às regiões alagadiças presentes, ou seja, os pântanos.");
        System.out.println(" ");
    };
};