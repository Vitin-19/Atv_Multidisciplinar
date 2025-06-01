package DS_GEOGRAFIA_BIOMAS.src.models;

public class MataAtlantica extends Bioma {
    public MataAtlantica() {
        setNome("Mata Atlântica");
        setClima("Tropical úmido");
    };

    @Override
    public void apresentarNome() {
        System.out.println("\nNome: " + getNome());
    };

    @Override
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Alta úmidade e vegetação densa");
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma Mata Atlântica:");
        System.out.println("\nA Mata Atlântica ocupa a faixa litorânea de norte a sul do país. Assim, ela engloba a totalidade de três estados brasileiros: Espírito Santo, Rio de Janeiro e Santa Catarina; grande parte do Paraná e pequenas porções de onze estados.");
        System.out.println("\nO clima predominante é tropical úmido com altas temperaturas e índice pluviométrico. A vegetação nesse bioma é marcada pela presença de árvores de grande e médio porte, formando uma floresta densa e fechada.");
        System.out.println(" ");
    };
};
