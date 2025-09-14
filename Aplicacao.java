import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== Menu ===");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Pesquisar veículos");
            System.out.println("4 - Excluir veículos");
            System.out.println("0 - Sair");
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
                    System.out.println("Ano: ");
                    int ano = scan.nextInt();
                    scan.nextLine();

                    
                    boolean encontrado = false;

                    for (Veiculo vPlaca : veiculos){
                        if (vPlaca.getPlaca().equalsIgnoreCase(placa)){
                        encontrado = true;
                        break;
                    }
                }

                    if(encontrado){
                        System.out.println(placa + " já está na lista.");
                    }
                    else{
                        Veiculo v = new Veiculo(marca, modelo, placa, ano);
                        veiculos.add(v);
                        System.out.println("Veículo cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        System.out.println("==== Lista de Veículos ====");
                        for (Veiculo veiculo : veiculos) {
                            System.out.println(veiculo.toString());
                        }
                    }
                break;

                case 3:
                    break;

                case 4:
                    break;

                case 0:

                default:
                    break;
            }
        }
    }
}