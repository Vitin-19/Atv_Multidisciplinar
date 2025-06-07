package DS_GEOGRAFIA_BIOMAS.src.models;

// Subclasse Amazonia que herda de Bioma
public class Amazonia extends Bioma {
    public Amazonia() {
        setNome("Amazônia"); // nome do bioma
        setClima("Quente e úmido"); // clima do bioma
    };

    @Override // apresenta o nome
    public void apresentarNome() {
        System.out.println("Nome: " + getNome());
    };

    @Override // apresenta o clima
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Com chuvas frequentes e alta biodiversidade");
    };

    @Override // apresenta os detalhes depois de digitar o nome do bioma na segunda opção
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma " + getNome() + ":");
        System.out.println("\nConsiderado o maior Bioma brasileiro e a maior reserva de diversidade biológica do mundo, o bioma Amazônia corresponde a quase metade do território nacional.");
        System.out.println("\nAbrange os estados brasileiros do: Acre, Amapá, Amazonas, Pará, Roraima; parte de Rondônia, Mato Grosso, Maranhão e Tocantins.");
        System.out.println("\nO clima dessa região é quente e úmido e sua densa vegetação é caracterizada pela floresta amazônica com árvores de grande porte.");
        System.out.println(" ");
    };
};