import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n===== ZecaGames - Cálculo de Lucros =====");
            System.out.println("1 - Calcular lucro de Computador (Gamer ou Desktop de Escritório)");
            System.out.println("2 - Calcular lucro de Notebook");
            System.out.println("3 - Calcular lucro de Video Game");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            if (opcao == 1) {
                Computador computador = criarComputador(scanner);
                LucroComputador.exibirSugestoes(computador);
                
                System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
                double precoPersonalizado = lerValor(scanner, "Preço Personalizado");
                
                LucroComputador.calcularLucroPersonalizado(computador, precoPersonalizado);
            }
            
        } while (opcao != 4);
        
        System.out.println("Saindo... Obrigado por usar o ZecaGames!");
        scanner.close();
    }

    public static Computador criarComputador(Scanner scanner) {
        System.out.print("Digite o modelo da Placa Mãe: ");
        String placaMae = scanner.nextLine();
        System.out.print("Digite o modelo do Gabinete: ");
        String gabinete = scanner.nextLine();
        System.out.print("Digite o modelo da Memória RAM: ");
        String memoriaRam = scanner.nextLine();
        System.out.print("Digite o modelo da Fonte: ");
        String fonte = scanner.nextLine();
        System.out.print("Digite o modelo do HD (ou pressione Enter para pular): ");
        String hd = scanner.nextLine();
        System.out.print("Digite o modelo do SSD (ou pressione Enter para pular): ");
        String ssd = scanner.nextLine();
        System.out.print("Digite o modelo da Placa de Vídeo (ou pressione Enter para pular): ");
        String placaVideo = scanner.nextLine();
        System.out.print("Digite o modelo do Cooler (ou pressione Enter para pular): ");
        String cooler = scanner.nextLine();
        
        double valorTotal = 0;
        valorTotal += lerValor(scanner, "Placa Mãe");
        valorTotal += lerValor(scanner, "Gabinete");
        valorTotal += lerValor(scanner, "Memória RAM");
        valorTotal += lerValor(scanner, "Fonte");
        valorTotal += lerValor(scanner, "HD");
        valorTotal += lerValor(scanner, "SSD");
        valorTotal += lerValor(scanner, "Placa de Vídeo");
        valorTotal += lerValor(scanner, "Cooler");

        return new Computador(placaMae, gabinete, memoriaRam, fonte, hd, ssd, placaVideo, cooler, valorTotal);
    }

    public static double lerValor(Scanner scanner, String componente) {
        double valor;
        while (true) {
            System.out.print(componente + " - Valor Pago: ");
            try {
                valor = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (valor < 0) {
                    System.out.println("O valor não pode ser negativo. Tente novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
        return valor;
    }
}
