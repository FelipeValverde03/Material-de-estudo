package IntroducaoClasses.ExercicioPolimorfismo.Dominio;

public class Liquidificador extends Produtos {
    public static final double Imposto = 0.10;
    public Liquidificador(String nome, double valor) {
        super(nome,valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Clculando imposto sob o Liquidificador:");
        return this.valor * Imposto;
    }
}
