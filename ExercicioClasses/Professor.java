package IntroducaoClasses.ExercicioClasses;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    
    
    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("=======================\nO professor "+this.nome+" esta encarregado dos seminarios:\n");
        if (seminarios==null)return;
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            if (seminario.getLocal()==null)continue;
            System.out.println("\nQue será no "+seminario.getLocal().getEndereco());
            if (seminario.getAlunos()==null || seminario.getAlunos().length==0)continue;
            System.out.println("\nNo qual vai:");
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println(aluno.getNome()+" que possui "+aluno.getIdade()+" anos");
            }
            System.out.println("=======================");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    
}
