public class Main {
    public static void main(String[] args) {

        Pasta raiz = new Pasta("Raiz");
        Pasta pasta1 = new Pasta("Pasta1");
        Pasta pasta2 = new Pasta("Pasta2");
        Pasta pasta3 = new Pasta("Pasta3");
        Pasta pasta4 = new Pasta("Pasta4");


        raiz.adicionarSubPasta(pasta1);
        raiz.adicionarSubPasta(pasta2);
        pasta2.adicionarSubPasta(pasta3);
        pasta3.adicionarSubPasta(pasta4);


        Arquivo arquivo1 = new Arquivo("Arquivo1", 100);
        Arquivo arquivo2 = new Arquivo("Arquivo2", 200);
        Arquivo arquivo3 = new Arquivo("Arquivo3", 300);
        Arquivo arquivo4 = new Arquivo("Arquivo4", 400);


        raiz.adicionarArquivo(arquivo1);
        pasta1.adicionarArquivo(arquivo2);
        pasta3.adicionarArquivo(arquivo3);
        pasta4.adicionarArquivo(arquivo4);


        System.out.println("Pasta raiz:");
        System.out.println("Número de pastas: " + raiz.getNumDePastas());
        System.out.println("Número de arquivos: " + raiz.getNumDeArquivos());
        System.out.println("Tamanho total: " + raiz.getTamanho());

        System.out.println("Pasta pasta1:");
        System.out.println("Número de subpastas: " + pasta1.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta1.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta1.getTamanho());

        System.out.println("Pasta pasta2:");
        System.out.println("Número de subpastas: " + pasta2.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta2.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta2.getTamanho());

        System.out.println("Pasta pasta3:");
        System.out.println("Número de subpastas: " + pasta3.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta3.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta3.getTamanho());

        System.out.println("Pasta pasta4:");
        System.out.println("Número de subpastas: " + pasta4.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta4.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta4.getTamanho());
        System.out.println("\n");

        raiz.moverArquivo(arquivo1, pasta1);
        pasta3.moverArquivo(arquivo3, pasta1);

        System.out.println("Pasta raiz após mover arquivos:");
        System.out.println("Número de subpastas: " + raiz.getNumDePastas());
        System.out.println("Número de arquivos: " + raiz.getNumDeArquivos());
        System.out.println("Tamanho total: " + raiz.getTamanho());

        System.out.println("Pasta Pasta1 após mover arquivos:");
        System.out.println("Número de subpastas: " + pasta1.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta1.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta1.getTamanho());
        System.out.println("\n");

        raiz.moverSubPasta(pasta1, pasta3);
        pasta3.moverSubPasta(pasta4, pasta2);

        System.out.println("Pasta raiz após mover subpastas:");
        System.out.println("Número de subpastas: " + raiz.getNumDePastas());
        System.out.println("Número de arquivos: " + raiz.getNumDeArquivos());
        System.out.println("Tamanho total: " + raiz.getTamanho());

        System.out.println("Pasta pasta2 após mover subpastas:");
        System.out.println("Número de subpastas: " + pasta2.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta2.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta2.getTamanho());

        System.out.println("Pasta pasta3 após mover subpastas:");
        System.out.println("Número de subpastas: " + pasta3.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta3.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta3.getTamanho());
        System.out.println("\n");

        pasta1.removerArquivo(arquivo2);

        System.out.println("Pasta Pasta1 após remover arquivos:");
        System.out.println("Número de subpastas: " + pasta1.getNumDePastas());
        System.out.println("Número de arquivos: " + pasta1.getNumDeArquivos());
        System.out.println("Tamanho total: " + pasta1.getTamanho());
        System.out.println("\n");

        raiz.removerSubPasta(pasta2);

        System.out.println("Pasta raiz após remover subpasta:");
        System.out.println("Número de subpastas: " + raiz.getNumDePastas());
        System.out.println("Número de arquivos: " + raiz.getNumDeArquivos());
        System.out.println("Tamanho total: " + raiz.getTamanho());
        System.out.println("\n");



    }
}