import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = lerOpcao(scanner);
            
            switch (opcao) {
                case 1:
                    Computador computador = criarComputador(scanner);
                    LucroComputador.exibirSugestoes(computador);
                    calcularLucroPersonalizado(scanner, computador);
                    break;
                case 2:
                    Notebook notebook = criarNotebook(scanner);
                    LucroNotebook.exibirSugestoes(notebook);
                    calcularLucroPersonalizado(scanner, notebook);
                    break;
                case 3:
                    VideoGame videoGame = criarVideoGame(scanner);
                    LucroVideoGame.exibirSugestoes(videoGame);
                    calcularLucroPersonalizado(scanner, videoGame);
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar o ZecaGames!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n===== ZecaGames - Cálculo de Lucros =====");
        System.out.println("1 - Calcular lucro de Computador (Gamer ou Desktop de Escritório)");
        System.out.println("2 - Calcular lucro de Notebook");
        System.out.println("3 - Calcular lucro de Video Game");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        return opcao;
    }

    private static Computador criarComputador(Scanner scanner) {
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
        
        System.out.print("Valor total pago: ");
        double valorTotal = scanner.nextDouble();
        
        return new Computador(placaMae, gabinete, memoriaRam, fonte, hd, ssd, placaVideo, cooler, valorTotal);
    }

    private static Notebook criarNotebook(Scanner scanner) {
        System.out.print("Digite o modelo do Notebook: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a marca do Notebook: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o processador do Notebook: ");
        String processador = scanner.nextLine();
        System.out.print("Digite a quantidade de memória (em GB): ");
        int memoria = scanner.nextInt();
        System.out.print("Digite a quantidade de armazenamento (em GB): ");
        int armazenamento = scanner.nextInt();
        System.out.print("Possui SSD? (true/false): ");
        boolean temSSD = scanner.nextBoolean();
        System.out.print("Possui carregador? (true/false): ");
        boolean temCarregador = scanner.nextBoolean();
        
        System.out.print("Digite o valor total pago: ");
        double valorTotal = scanner.nextDouble();
        
        return new Notebook(modelo, marca, processador, memoria, armazenamento, temSSD, temCarregador, valorTotal);
    }

    private static VideoGame criarVideoGame(Scanner scanner) {
        System.out.print("Digite o modelo do Video Game: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a marca do Video Game: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o tamanho do armazenamento: ");
        String armazenamento = scanner.nextLine();
        System.out.print("Possui controle? (true/false): ");
        boolean possuiControle = scanner.nextBoolean();
        System.out.print("Possui defeito? (true/false): ");
        boolean possuiDefeito = scanner.nextBoolean();
        
        System.out.print("Digite o valor total pago: ");
        double valorTotal = scanner.nextDouble();
        
        return new VideoGame(nome, marca, armazenamento, possuiControle, possuiDefeito, valorTotal);
    }

    private static void calcularLucroPersonalizado(Scanner scanner, Computador computador) {
        System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
        double precoPersonalizado = scanner.nextDouble();
        LucroComputador.calcularLucroPersonalizado(computador, precoPersonalizado);
    }

    private static void calcularLucroPersonalizado(Scanner scanner, Notebook notebook) {
        System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
        double precoPersonalizado = scanner.nextDouble();
        LucroNotebook.calcularLucroPersonalizado(notebook, precoPersonalizado);
    }

    private static void calcularLucroPersonalizado(Scanner scanner, VideoGame videoGame) {
        System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
        double precoPersonalizado = scanner.nextDouble();
        LucroVideoGame.calcularLucroPersonalizado(videoGame, precoPersonalizado);
    }
}