package IntroducaoClasses.ExercicioPolimorfismo.Test;

import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Computador;
import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Liquidificador;
import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Produtos;
import IntroducaoClasses.ExercicioPolimorfismo.Dominio.Tomate;
import IntroducaoClasses.ExercicioPolimorfismo.Service.CalculadoraImposto;

public class Teste {
    public static void main(String[] args) {
        Produtos produto = new Computador("Alienware", 10000);
        Produtos produto2 = new Tomate("Tomate Cereja", 10);
        Produtos produto3 = new Liquidificador("Liquidificador Brastemp", 500);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(produto3);
    }
}