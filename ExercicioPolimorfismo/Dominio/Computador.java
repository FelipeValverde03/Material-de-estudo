package IntroducaoClasses.ExercicioPolimorfismo.Dominio;

public class Computador extends Produtos{
    public static final double Imposto = 0.10;
    public Computador(String nome, double valor) {
        super(nome,valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Clculando imposto sob o Computador:");
        return this.valor*Imposto;
    }
    
}
