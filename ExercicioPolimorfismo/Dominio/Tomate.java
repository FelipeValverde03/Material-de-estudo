package IntroducaoClasses.ExercicioPolimorfismo.Dominio;

public class Tomate extends Produtos {
    public static final double Imposto = 0.05;
    public static final String dataValidade = "30/03/2030";
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Clculando imposto sob o Tomate:");
        return this.valor * Imposto;
    }
    public String getDataValidade() {
        return dataValidade;
    }
}
