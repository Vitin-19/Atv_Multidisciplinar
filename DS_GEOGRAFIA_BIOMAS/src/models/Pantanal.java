package DS_GEOGRAFIA_BIOMAS.src.models;

// Subclasse Pantanal herda de Bioma
public class Pantanal extends Bioma {
    public Pantanal() {
        setNome("Pantanal"); // nome do bioma
        setClima("Tropical"); // clima do bioma
    };

    @Override // apresenta o nome
    public void apresentarNome() {
        System.out.println("Nome: " + getNome());
    };

    @Override // apresenta o clima
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Varia de períodos de cheia e de seca");
    };

    @Override // apresenta os detalhes depois de digitar o nome do bioma na segunda opção
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma " + getNome() + ":");
        System.out.println("\nO Bioma Pantanal, considerado o de menor extensão territorial do país, abrange dois estados brasileiros: Mato Grosso e Mato Grosso do Sul.");
        System.out.println("\nO clima predominante é tropical continental com altas temperaturas e chuvas, de verão chuvoso e inverno seco.");
        System.out.println("\nA vegetação do pantanal é marcada pelas gramíneas, árvores de médio porte, plantas rasteiras e arbustos. O nome desse bioma remete às regiões alagadiças presentes, ou seja, os pântanos.");
        System.out.println(" ");
    };
};