package padroescomportamentais;

public class Gerente implements Pessoa{

    private int matricula;
    private String nome;
    private Boolean interino;

    public Gerente(int matricula, String nome, Boolean interino) {
        this.matricula = matricula;
        this.nome = nome;
        this.interino = interino;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getInterino() {
        return interino;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
