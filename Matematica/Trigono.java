public abstract class Trigono {
    private String catetoOposto;
    private String catetoAdjacente;
    private String hipotenusa;
    private Integer Area;
    private Integer Base;
    private Integer Altura;
   

    public String getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(String catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public String getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(String catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public String getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(String Hipotenusa) {
        this.hipotenusa = Hipotenusa;
    }

    public Integer getArea() {
        return Area;
    }

    public void setArea(Integer Area) {
        this.Area = Area;
    }

    public Integer getBase() {
        return Base;
    }

    public void setBase(Integer Base) {
        this.Base = Base;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }

    public Integer setAnguloSeno() {
        return AnguloSeno;
    }


    public abstract void apresentarDefinicao();
    public abstract void exibirFormula();
    
}