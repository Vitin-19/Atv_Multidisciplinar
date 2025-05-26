public abstract class Bioma {
    String nome;
    String clima;

    public String getNome() {
        return nome;
    };

    public String getClima() {
        return clima;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setClima(String clima) {
        this.clima = clima;
    };

    public abstract void apresentarNome();
    public abstract void exibirClima();
    public abstract void exibirDetalhes();
};
