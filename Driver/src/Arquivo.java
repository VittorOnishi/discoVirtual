public class Arquivo {
    private String nome;
    private long tamanho;

    public Arquivo(String nome, long tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public long getTamanho() {
        return tamanho;
    }
}