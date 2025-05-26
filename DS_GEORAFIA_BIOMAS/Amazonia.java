public class Amazonia extends Bioma {
    public Amazonia() {
        setNome("Amazônia");
        setClima("Quente e úmido");
    };

    @Override
    public void apresentarNome() {
        System.out.println("\nNome: " + getNome());
    };

    @Override
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Com chuvas frequentes e alta biodiversidade");
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma Amazônia:");
        System.out.println(" ");
        System.out.println("\nConsiderado o maior Bioma brasileiro e a maior reserva de diversidade biológica do mundo, o bioma Amazônia corresponde a quase metade do território nacional.");
        System.out.println("\nAbrange os estados brasileiros do: Acre, Amapá, Amazonas, Pará, Roraima; parte de Rondônia, Mato Grosso, Maranhão e Tocantins.");
        System.out.println("\nO clima dessa região é quente e úmido e sua densa vegetação é caracterizada pela floresta amazônica com árvores de grande porte.");
        System.out.println(" ");
    };
};
