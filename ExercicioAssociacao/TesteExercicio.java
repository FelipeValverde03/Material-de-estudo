package IntroducaoClasses.ExercicioClasses;

public class TesteExercicio {
    public static void main(String[] args) {
        Local local = new Local("Bairro do Limoeiro");
        Aluno aluno1 = new Aluno("Cebolinha", 7);
        Aluno aluno2 = new Aluno("Cascao", 7);
        Professor professor = new Professor("Franjinha", "Ciencia");
        Seminario seminario1 = new Seminario("Maquina do Tempo");

        Aluno[] alunos = {aluno1,aluno2};
        Seminario seminario2 = new Seminario("Plano para roubar o coelho da Monica",alunos, local);
        Seminario[] seminarios = {seminario1,seminario2};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
