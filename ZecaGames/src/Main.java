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
                System.out.print("Valor total pago: ");
                valorTotal = scanner.nextDouble();
                
                Computador computador = new Computador(placaMae, gabinete, memoriaRam, fonte, hd, ssd, placaVideo, cooler, valorTotal);
                LucroComputador.exibirSugestoes(computador);
                
                System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
                double precoPersonalizado = scanner.nextDouble();
                
                LucroComputador.calcularLucroPersonalizado(computador, precoPersonalizado);
            } else if (opcao == 3) {
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
                
                VideoGame videoGame = new VideoGame(nome, marca, armazenamento, possuiControle, possuiDefeito, valorTotal);
                LucroVideoGame.exibirSugestoes(videoGame);
                
                System.out.print("\nDigite um preço personalizado para calcular o lucro: ");
                double precoPersonalizado = scanner.nextDouble();
                LucroVideoGame.calcularLucroPersonalizado(videoGame, precoPersonalizado);
            }
        } while (opcao != 4);
        
        System.out.println("Saindo... Obrigado por usar o ZecaGames!");
        scanner.close();
    }
}