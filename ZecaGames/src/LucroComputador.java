import java.text.DecimalFormat;

class LucroComputador {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void exibirSugestoes(Computador computador) {
        System.out.println("\nSugestão de preços de venda para Computador:");
        for (int i = 10; i <= 100; i += 10) {
            double precoVenda = computador.getValorTotal() * (1 + i / 100.0);
            System.out.println("- " + i + "% de lucro → R$ " + df.format(precoVenda));
        }
    }

    public static void calcularLucroPersonalizado(Computador computador, double precoVenda) {
        double valorPago = computador.getValorTotal();
        double lucro = ((precoVenda - valorPago) / valorPago) * 100;
        System.out.println("Valor pago: R$ " + df.format(valorPago));
        System.out.println("Valor de venda desejado: R$ " + df.format(precoVenda));
        System.out.println("Lucro de " + df.format(lucro) + "%");
    }
}