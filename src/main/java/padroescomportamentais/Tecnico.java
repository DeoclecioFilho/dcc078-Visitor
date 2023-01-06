package padroescomportamentais;

public class Tecnico implements Pessoa{

    private int matricula;
    private String nome;
    private double salario;

    public Tecnico(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirTecnico(this);
    }
}
