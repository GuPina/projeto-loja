class Computador {
    private String placaMae;
    private String gabinete;
    private String memoriaRam;
    private String hd;
    private String ssd;
    private String placaVideo;
    private String fonte;
    private String cooler;
    private double valorTotal;

    public Computador(String placaMae, String gabinete, String memoriaRam, String fonte, String hd, String ssd, String placaVideo, String cooler, double valorTotal) {
        if (placaMae == null || gabinete == null || memoriaRam == null || fonte == null) {
            throw new IllegalArgumentException("Placa Mãe, Gabinete, Memória RAM e Fonte são obrigatórios.");
        }
        this.placaMae = placaMae;
        this.gabinete = gabinete;
        this.memoriaRam = memoriaRam;
        this.fonte = fonte;
        this.hd = hd != null ? hd : "";
        this.ssd = ssd != null ? ssd : "";
        this.placaVideo = placaVideo != null ? placaVideo : "";
        this.cooler = cooler != null ? cooler : "";
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
