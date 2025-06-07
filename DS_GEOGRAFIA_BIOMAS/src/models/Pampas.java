package DS_GEOGRAFIA_BIOMAS.src.models;

// Subclasse Pampas herda de Bioma
public class Pampas extends Bioma {
    public Pampas() {
        setNome("Cerrado"); // nome do bioma
        setClima("Subtropical"); // clima do bioma
    };

    @Override // apresenta o nome
    public void apresentarNome() {
        System.out.println("Nome: " + getNome());
    };

    @Override // apresenta o clima
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Temperaturas moderadas e vegetação campestre");
    };

    @Override // apresenta os detalhes depois de digitar o nome do bioma na segunda opção
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma " + getNome() + ":");
        System.out.println("\nO Pampas é o único bioma brasileiro presente somente numa unidade federativa. Ele ocupa mais da metade do território do Rio Grande do Sul.");
        System.out.println("\nO clima é subtropical com as quatro estações do ano bem definidas e sua vegetação é marcada pela presença de gramíneas, arbustos e árvores de pequeno porte.");
        System.out.println("\nAlém disso, esse bioma é constituído de amplas áreas de pastagens, onde se desenvolvem grandes rebanhos.");
        System.out.println(" ");
    };
};
