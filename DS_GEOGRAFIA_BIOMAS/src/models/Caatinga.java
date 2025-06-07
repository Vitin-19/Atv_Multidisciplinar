package DS_GEOGRAFIA_BIOMAS.src.models;

// Subclasse Caatinga que herda de Bioma
public class Caatinga extends Bioma {
    public Caatinga() {
        setNome("Caatinga"); // nome do bioma
        setClima("Semiárido"); // clima do bioma
    };

    @Override // apresneta o nome
    public void apresentarNome() {
        System.out.println("Nome: " + getNome());
    };

    @Override // apresenta o clima
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Pouco úmido e vegetação adaptada à seca");
    };

    @Override // apresenta os detalhes depois de digitar o nome do bioma na segunda opção
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma " + getNome() + ":");
        System.out.println("\nA Caatinga ocupa grande parte da região nordeste do país. Ela abrange os estados do: Ceará, Bahia, Paraíba, Pernambuco, Piauí, Rio Grande do Norte, Alagoas e Sergipe.");
        System.out.println("\nAlém disso, há presença desse tipo de bioma em pequenas partes dos estados do Maranhão e de Minas Gerais.");
        System.out.println("\nTípico do clima semi árido, localizado no sertão nordestino, a caatinga apresenta uma vegetação arbustiva de médio porte, com galhos retorcidos e folhas adaptadas para os períodos de secas. Os cactus são característicos da Caatinga.");
        System.out.println(" ");
    };
};