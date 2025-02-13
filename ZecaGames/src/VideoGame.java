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

    public double getValorTotal() {
        return valorTotal;
    }
}