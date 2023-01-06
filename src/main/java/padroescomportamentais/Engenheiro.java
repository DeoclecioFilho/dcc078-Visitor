package padroescomportamentais;

public class Engenheiro implements Pessoa{

    private int matricula;
    private String nome;
    private String nivel;

    public Engenheiro(int matricula, String nome, String nivel) {
        this.matricula = matricula;
        this.nome = nome;
        this.nivel = nivel;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirEngenheiro(this);
    }
}
