
import java.text.DecimalFormat;

class LucroVideoGame {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void exibirSugestoes(VideoGame videoGame) {
        System.out.println("\nSugestão de preços de venda para Video Game:");
        for (int i = 10; i <= 100; i += 10) {
            double precoVenda = videoGame.getValorTotal() * (1 + i / 100.0);
            System.out.println("- " + i + "% de lucro → R$ " + df.format(precoVenda));
        }
    }

    public static void calcularLucroPersonalizado(VideoGame videoGame, double precoVenda) {
        double lucro = ((precoVenda - videoGame.getValorTotal()) / videoGame.getValorTotal()) * 100;
        System.out.println("Valor pago: R$ " + df.format(videoGame.getValorTotal()));
        System.out.println("Valor de venda desejado: R$ " + df.format(precoVenda));
        System.out.println("Lucro de " + df.format(lucro) + "%");
    }
}