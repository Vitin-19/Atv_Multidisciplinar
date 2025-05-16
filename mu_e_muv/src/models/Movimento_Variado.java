package models;

public class Movimento_Variado extends Movimento implements Formulas_MUV{
    private double aceleracao;

    public Movimento_Variado(double velocidade, double distancia, double aceleracao, double tempo){
        super(velocidade, distancia, tempo);
        this.aceleracao = aceleracao;
    }

    //Get e set de aceleração
    public void setAceleracao(double aceleracao){
        this.aceleracao = aceleracao;
    }
    public double getAceleracao(){
        return aceleracao;
    }

    @Override
    public void explicarMovimentoEspecifico(){
        System.out.println("O movimento variado é aquele que a sua velocidade varia com o tempo, uma vez que é afetada pela ação da aceleração.");
    }
    
    @Override
    public void mostrarFormulas(){
        System.out.println("Fórmulas: ");
        System.out.println("S = S0 + V0 x (a/2)t² => Sorvetão: Calcular o ponto final do movimento");
        System.out.println("V = V0 + at => Voat: Função horária da velocidade");
        System.out.println("V² = V0² + 2aΔS => Torricelli: Calcular a velocidade sem o tempo");
        System.out.println("Legenda: ");
        System.out.println("V = Velocidade");
        System.out.println("S = Espaço (Distância)");
        System.out.println("a = Aceleração");
        System.out.println("t = tempo");
        System.out.println("V0 = Velocidade inicial");
        System.out.println("S0 = Espaço inicial (Ponto de partida do movimento)");
        System.out.println("Δ = Variação");
    }

    @Override
    public double sorvetao(double v0, double s0, double aceleracao, double tempo){
        return s0 + v0 * (aceleracao/2)*tempo*tempo;
    }
    @Override
    public double voat(double v0, double aceleracao, double tempo){
        return v0 + aceleracao*tempo;
    }
    @Override
    public double torricelli(double v0, double deltaS, double aceleracao){
        return Math.sqrt(v0*v0 + 2*aceleracao*deltaS);
    }
}