package Matematica;

// Declara a classe abstrata Trigono
public abstract class Trigono {

    // Atributos da classe Trigono
    protected String Definicao; // Armazena a definição teórica
    private double Hipotenusa, CatAdjacente, CatOposto; //Medidas do lado do triangulo
    private String Formula; // Armazena a representação da formula
    private double TangenteF; // Valor final da Tangente
    private double SenoF; // Valor final do Seno
    private double CossenoF; // Valor final do Cosseno

    // Construtor da classe Trigono

    public Trigono(String Definicao, double Hipotenusa, double CatAdjacente, double CatOposto, double TangenteF, double SenoF, double CossenoF) {
        set_Definicao(Definicao);
        set_Formula(Formula);
        set_CatAdjacente(CatAdjacente);
        set_CatOposto(CatOposto);
        set_TangenteF(TangenteF);
        set_SenoF(SenoF);
        set_CossenoF(CossenoF);        
    };


    //Metodos GET
    public String get_Definicao() {
        return this.Definicao;
    }

    public String get_Formula() {
        return this.Formula;
    }

    public double get_TangenteF() {
        return this.TangenteF;
    }

    public double get_SenoF() {
        return this.SenoF;
    }

    public double get_CossenoF() {
        return this.CossenoF;
    }

    public double get_Hipotenusa() {
        return this.Hipotenusa;
    }

    public double get_CatAdjacente() {
        return this.CatAdjacente;
    }

    public double get_CatOposto() {
        return this.CatOposto;
    }


// MEtodos SET

    public void set_Definicao(String Definicao) {
        this.Definicao = Definicao;
    }

    public void set_Formula(String Formula) {
        this.Formula = Formula;
    }

    public void set_TangenteF(double TangenteF) {
        this.TangenteF = TangenteF;
    }

    public void set_SenoF(double SenoF) {
        this.SenoF = SenoF;
    }

    public void set_CossenoF(double CossenoF) {
        this.CossenoF = CossenoF;
    }

    public void set_CatAdjacente(double CatAdjacente) {
        this.CatAdjacente = CatAdjacente;
    }

    public void set_CatOposto(double CatOposto) {
        this.CatOposto = CatOposto;
    }

    public void set_Hipotenusa(double Hipotenusa) {
        this.Hipotenusa = Hipotenusa;
    }


    //Metodos Abstratos
    public abstract void apresentarDefinicao();
    public abstract void exibirFormula();

}