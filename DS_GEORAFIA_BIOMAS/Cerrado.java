public class Cerrado extends Bioma {
    public Cerrado() {
        setNome("Cerrado");
        setClima("Tropical Sazonal");
    };

    @Override
    public void apresentarNome() {
        System.out.println("\nNome: " + getNome());
    };

    @Override
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Periodos de chuva e seca bem definidos");
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma Cerrado:");
        System.out.println(" ");
        System.out.println("\nO Cerrado é considerado o segundo maior bioma do Brasil em extensão. Ele abrange os estados do: Maranhão, Distrito Federal, Goiás, Mato Grosso do Sul, Minas Gerais e Tocantins. Além disso, ocupa uma pequena área de outros seis estados.");
        System.out.println("\nO clima predominante no cerrado é tropical sazonal, com períodos de chuvas e de secas. Já a sua vegetação, é caracterizada por árvores de troncos retorcidos, gramíneas e arbustos. Em geral, as árvores são de pequeno porte e esparsas.");
        System.out.println(" ");
    };
};
