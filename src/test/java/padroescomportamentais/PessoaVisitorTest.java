package padroescomportamentais;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    PessoaVisitor pessoaVisitor;
    Eletricista eletricista;
    Tecnico tecnico;
    Engenheiro engenheiro;
    Gerente gerente;

    @BeforeEach
    void setUp() {
        pessoaVisitor = new PessoaVisitor();
        eletricista = new Eletricista(60358, "Maria","Encarregado");
        tecnico = new Tecnico(70879,"Francisco", 4580.0);
        engenheiro = new Engenheiro(98456,"Tatiana","Senior" );
        gerente = new Gerente(85655,"Arnaldo",false);
    }

    @AfterEach
    void tearDown() {
        pessoaVisitor = null;
        eletricista = null;
        tecnico = null;
        engenheiro = null;
        gerente = null;
    }

    @Test
    void deveExibirEletricista(){
        assertEquals("Eletricista{matricula=60358, nome='Maria', cargo='Encarregado'}", pessoaVisitor.exibir(eletricista));
    }
    @Test
    void deveExibirTecnico(){
        assertEquals("Tecnico{matricula=70879, nome='Francisco', salario=4580.0}", pessoaVisitor.exibir(tecnico));
    }
    @Test
    void deveExibirEngenheiro(){
        assertEquals("Engenheiro{matricula=98456, nome='Tatiana', nivel='Senior'}", pessoaVisitor.exibir(engenheiro));
    }

    @Test
    void deveExibirGerente(){
        assertEquals("Gerente{matricula=85655, nome='Arnaldo', interino=false}", pessoaVisitor.exibir(gerente));
    }

}