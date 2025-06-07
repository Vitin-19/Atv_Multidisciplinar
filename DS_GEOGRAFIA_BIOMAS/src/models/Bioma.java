package DS_GEOGRAFIA_BIOMAS.src.models;

// Classe abstrata Bioma, usada como base para as subclasses
public abstract class Bioma {
    String nome; // variavel do nome
    String clima; // variavel do clima

    // metodo getter para acessar nome e clima
    public String getNome() {
        return nome;
    };

    public String getClima() {
        return clima;
    };

    // metodo setter para definir nome e clima
    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setClima(String clima) {
        this.clima = clima;
    };

    // metodos abstratos que serão implementados nas subclasses
    public abstract void apresentarNome();
    public abstract void exibirClima();
    public abstract void exibirDetalhes();
};
