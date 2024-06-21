package IntroducaoClasses.ExercicioPolimorfismo.Dominio;

public  abstract class Produtos implements Taxa{
    protected String nome;
    protected double valor;
    
    public Produtos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
}