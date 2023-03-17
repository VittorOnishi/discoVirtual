import org.junit.jupiter.api.*;
public class TestDriver {

    private Pasta raiz;
    private Pasta pasta1;
    private Pasta pasta2;
    private Pasta pasta3;
    private Pasta pasta4;
    private Arquivo arquivo1;
    private Arquivo arquivo2;
    private Arquivo arquivo3;
    @BeforeEach
    public void setup() {
        raiz = new Pasta("Raiz");
        pasta1 = new Pasta("Pasta1");
        pasta2 = new Pasta("Pasta2");
        pasta3 = new Pasta("Pasta3");
        pasta4 = new Pasta("Pasta4");
        arquivo1 = new Arquivo("Arquivo1", 100);
        arquivo2 = new Arquivo("Arquivo2", 200);
        arquivo3 = new Arquivo("Arquivo3", 300);
        raiz.adicionarSubPasta(pasta1);
        raiz.adicionarSubPasta(pasta2);
        pasta2.adicionarSubPasta(pasta3);
        raiz.adicionarArquivo(arquivo1);
        pasta1.adicionarArquivo(arquivo2);
        pasta3.adicionarArquivo(arquivo3);
        pasta3.adicionarSubPasta(pasta4);
    }

    @Test
    public void testGetNumDeArquivos() {
        Assertions.assertEquals(3, raiz.getNumDeArquivos());
        Assertions.assertEquals(1, pasta1.getNumDeArquivos());
        Assertions.assertEquals(1, pasta2.getNumDeArquivos());
        Assertions.assertEquals(1, pasta3.getNumDeArquivos());
    }

    @Test
    public void testGetTamanho() {
        Assertions.assertEquals(600, raiz.getTamanho());
        Assertions.assertEquals(200, pasta1.getTamanho());
        Assertions.assertEquals(300, pasta2.getTamanho());
    }

    @Test
    public void testMoverArquivo() {
        raiz.moverArquivo(arquivo1, pasta1);
        Assertions.assertEquals(3, raiz.getNumDeArquivos());
        Assertions.assertEquals(2, pasta1.getNumDeArquivos());
        Assertions.assertEquals(600, raiz.getTamanho());
        Assertions.assertEquals(300, pasta1.getTamanho());
    }

    @Test
    public void testRemoverArquivo() {
        pasta1.removerArquivo(arquivo2);
        Assertions.assertEquals(2, raiz.getNumDeArquivos());
        Assertions.assertEquals(0, pasta1.getNumDeArquivos());
        Assertions.assertEquals(400, raiz.getTamanho());
        Assertions.assertEquals(0, pasta1.getTamanho());
    }

    @Test
    public void testGetNumerodePastas(){
        Assertions.assertEquals(4, raiz.getNumDePastas());
        Assertions.assertEquals(0, pasta1.getNumDePastas());
        Assertions.assertEquals(2, pasta2.getNumDePastas());
        Assertions.assertEquals(1, pasta3.getNumDePastas());


    }

    @Test
    public void removerSubPastas(){
        raiz.removerSubPasta(pasta1);
        pasta3.removerSubPasta(pasta4);
        Assertions.assertEquals(2, raiz.getNumDePastas());
        Assertions.assertEquals(0, pasta3.getNumDePastas());


    }





}
