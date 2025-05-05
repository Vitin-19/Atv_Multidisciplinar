package models;

public class Movimento_Variado extends Movimento implements Formulas{
    private double aceleracao;

    public Movimento_Variado(double velocidade, double distancia, double aceleracao){
        super(velocidade, distancia);
        this.aceleracao = aceleracao;
    }

    //Get e set de aceleração
    public void setAceleracao(double aceleracao){
        this.aceleracao = aceleracao;
    }
    public double getAceleracao(){
        return aceleracao;
    }


}
