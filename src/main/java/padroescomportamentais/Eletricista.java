package padroescomportamentais;

public class Eletricista implements Pessoa{


    private int matricula;
    private String nome;
    private String cargo;

    public Eletricista(int matricula, String nome, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }


    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirEletricista(this);
    }
}
