package DS_GEOGRAFIA_BIOMAS.src.models;

// Subclasse MataAtlantica herda de Bioma
public class MataAtlantica extends Bioma {
    public MataAtlantica() {
        setNome("Mata Atlântica"); // nome do bioma
        setClima("Tropical úmido"); // clima do bioma
    };

    @Override // apresenta o nome
    public void apresentarNome() {
        System.out.println("Nome: " + getNome());
    };

    @Override // apresenta o clima
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Alta úmidade e vegetação densa");
    };

    @Override // apresenta os detalhes depois de digitar o nome do bioma na segunda opção
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma " + getNome() + ":");
        System.out.println("\nA Mata Atlântica ocupa a faixa litorânea de norte a sul do país. Assim, ela engloba a totalidade de três estados brasileiros: Espírito Santo, Rio de Janeiro e Santa Catarina; grande parte do Paraná e pequenas porções de onze estados.");
        System.out.println("\nO clima predominante é tropical úmido com altas temperaturas e índice pluviométrico. A vegetação nesse bioma é marcada pela presença de árvores de grande e médio porte, formando uma floresta densa e fechada.");
        System.out.println(" ");
    };
};
