import java.text.DecimalFormat;

public class LucroNotebook {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void exibirSugestoes(Notebook notebook) {
        System.out.println("\nSugestão de preços de venda para Notebook:");
        for (int i = 10; i <= 100; i += 10) {
            double precoVenda = notebook.getValorTotal() * (1 + i / 100.0);
            System.out.println("- " + i + "% de lucro → R$ " + df.format(precoVenda));
        }
    }

    public static void calcularLucroPersonalizado(Notebook notebook, double precoVenda) {
        double valorPago = notebook.getValorTotal();
        double lucro = ((precoVenda - valorPago) / valorPago) * 100;
        System.out.println("Valor pago: R$ " + df.format(valorPago));
        System.out.println("Valor de venda desejado: R$ " + df.format(precoVenda));
        System.out.println("Lucro de " + df.format(lucro) + "%");
    }

}
