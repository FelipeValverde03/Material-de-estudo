package IntroducaoClasses.ExercicioPolimorfismo.Service;

import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Produtos;
import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produtos produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:"+produto.getNome());
        System.out.println("Valor:"+produto.getValor());
        System.out.println("Imposto:"+imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade"+tomate.getDataValidade());
        }
    }
}
