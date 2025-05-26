public class Pampas extends Bioma {
    public Pampas() {
        setNome("Cerrado");
        setClima("Subtropical");
    };

    @Override
    public void apresentarNome() {
        System.out.println("\nNome: " + getNome());
    };

    @Override
    public void exibirClima() {
        System.out.println("Clima: " + getClima() + " - Temperaturas moderadas e vegetação campestre");
    };

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes do bioma Pampa:");
        System.out.println(" ");
        System.out.println("\nO Pampa é o único bioma brasileiro presente somente numa unidade federativa. Ele ocupa mais da metade do território do Rio Grande do Sul.");
        System.out.println("\nO clima é subtropical com as quatro estações do ano bem definidas e sua vegetação é marcada pela presença de gramíneas, arbustos e árvores de pequeno porte.");
        System.out.println("\nAlém disso, esse bioma é constituído de amplas áreas de pastagens, onde se desenvolvem grandes rebanhos.");
        System.out.println(" ");
    };
};
