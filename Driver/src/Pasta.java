import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();
    private List<Pasta> subPastas = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public List<Pasta> getSubPastas() {
        return subPastas;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void adicionarSubPasta(Pasta subPasta) {
        subPastas.add(subPasta);
    }

    public void removerArquivo(Arquivo arquivo) {
        arquivos.remove(arquivo);
    }

    public void removerSubPasta(Pasta subPasta) {
        subPastas.remove(subPasta);
    }

    public int getNumDeArquivos() {
        int numDeArquivos = arquivos.size();
        for (Pasta subPasta : subPastas) {
            numDeArquivos += subPasta.getNumDeArquivos();
        }
        return numDeArquivos;
    }

    public long getTamanho() {
        long tamanho = 0;
        for (Arquivo arquivo : arquivos) {
            tamanho += arquivo.getTamanho();
        }
        for (Pasta subPasta : subPastas) {
            tamanho += subPasta.getTamanho();
        }
        return tamanho;
    }

    public void moverArquivo(Arquivo arquivo, Pasta novaPasta) {
        arquivos.remove(arquivo);
        novaPasta.adicionarArquivo(arquivo);
    }

    public void moverSubPasta(Pasta subPasta, Pasta novaPasta) {
        subPastas.remove(subPasta);
        novaPasta.adicionarSubPasta(subPasta);
    }
}