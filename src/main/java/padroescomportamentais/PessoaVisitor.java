package padroescomportamentais;

public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirEletricista(Eletricista eletricista) {

        return "Eletricista{" +
                "matricula=" + eletricista.getMatricula() +
                ", nome='" + eletricista.getNome() + '\'' +
                ", cargo='" + eletricista.getCargo() + '\'' +
                '}';
    }

    @Override
    public String exibirTecnico(Tecnico tecnico) {

        return "Tecnico{" +
                "matricula=" + tecnico.getMatricula() +
                ", nome='" + tecnico.getNome() + '\'' +
                ", salario=" + tecnico.getSalario() +
                '}';
    }

    @Override
    public String exibirEngenheiro(Engenheiro engenheiro) {

        return "Engenheiro{" +
                "matricula=" + engenheiro.getMatricula() +
                ", nome='" + engenheiro.getNome() + '\'' +
                ", nivel='" + engenheiro.getNivel() + '\'' +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {

        return "Gerente{" +
                "matricula=" + gerente.getMatricula() +
                ", nome='" + gerente.getNome() + '\'' +
                ", interino=" + gerente.getInterino() +
                '}';
    }
}
