
class VideoGame {
    private String nome;
    private String marca;
    private String armazenamento;
    private boolean possuiControle;
    private boolean possuiDefeito;
    private double valorTotal;

    public VideoGame(String nome, String marca, String armazenamento, boolean possuiControle, boolean possuiDefeito, double valorTotal) {
        this.nome = nome;
        this.marca = marca;
        this.armazenamento = armazenamento;
        this.possuiControle = possuiControle;
        this.possuiDefeito = possuiDefeito;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public boolean isPossuiControle() {
        return possuiControle;
    }

    public boolean isPossuiDefeito() {
        return possuiDefeito;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", possuiControle=" + possuiControle +
                ", possuiDefeito=" + possuiDefeito +
                ", valorTotal=" + valorTotal +
                '}';
    }
}