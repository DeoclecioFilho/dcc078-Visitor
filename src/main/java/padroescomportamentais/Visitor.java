package padroescomportamentais;

public interface Visitor {

    String exibirEletricista(Eletricista eletricista);
    String exibirTecnico(Tecnico tecnico);
    String exibirEngenheiro(Engenheiro engenheiro);
    String exibirGerente(Gerente gerente);
}
