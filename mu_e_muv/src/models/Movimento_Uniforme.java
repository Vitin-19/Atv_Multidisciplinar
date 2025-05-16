package models;

public class Movimento_Uniforme extends Movimento implements Formulas_MU{
    public Movimento_Uniforme(double velocidade, double distancia, double tempo){
        super(velocidade, distancia, tempo);
    }

    @Override
    public void explicarMovimentoEspecifico(){
        System.out.println("Movimento uniforme é a variação do espaço de um objeto quando a velocidade dele não varia com o tempo.");
    }
    @Override
    public void mostrarFormulas(){
        System.out.println("V = Δs/Δv => Velocidade média: Calcula a velocidade média do movimento");
        System.out.println("Triângulo Deus vê tudo: Utilizado para calcular todos os valores possíveis no movimento uniforme => ");
        System.out.println("  D  ");
        System.out.println("-----");
        System.out.println("V . t");
        System.out.println("Legenda: ");
        System.out.println("Δs = Variação do espaço (espaço inicial - espaço final)");
        System.out.println("Δv = Variação do espaço (velocidade inicial - velocidade final)");
        System.out.println("D = S = Espaço");
        System.out.println("V = Velocidade");
        System.out.println("t = Tempo");
    }
    
    @Override
    public double velocidadeMedia(double deltaS, double deltaV){
        return deltaS / deltaV;
    }
    @Override
    public double calcular_distancia(double velocidade, double tempo){
        return velocidade * tempo;
    }
    @Override
    public double calcular_tempo(double espaco, double velocidade){
        return espaco / velocidade;
    }
}
