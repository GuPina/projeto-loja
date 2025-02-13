class Notebook {
    private String modelo;
    private String marca;
    private String processador;
    private int memoria;
    private int armazenamento;
    private boolean temSSD;
    private boolean temCarregador;
    private double valorTotal;

    public Notebook(String modelo, String marca, String processador, int memoria, int armazenamento, boolean temSSD, boolean temCarregador, double valorTotal) {
        this.modelo = modelo;
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.temSSD = temSSD;
        this.temCarregador = temCarregador;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", processador='" + processador + '\'' +
                ", memoria=" + memoria +
                ", armazenamento=" + armazenamento +
                ", temSSD=" + temSSD +
                ", temCarregador=" + temCarregador +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
