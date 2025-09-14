import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Pesquisar veículos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Marca: ");
                    String marca = scan.nextLine();
                    System.out.println("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.println("Placa: ");
                    String placa = scan.nextLine();
                    int ano = scan.nextInt();
                    scan.nextLine();

                    Veiculo v = new Veiculo(marca, modelo, placa, ano);
                    veiculos.add(v);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        for (Veiculo veiculo : veiculos) {
                            System.out.println(veiculo);
                        }
                    }
                break;
                case 3:
                    break;

                default:
                    break;
            }
        }
    }
}
