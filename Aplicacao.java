import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=== Menu ===");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Excluir veículos");
            System.out.println("4 - Pesquisa Veículos");
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
                System.out.println("Digite a placa do veículo que deseja excluir: ");
                String placaExcluir = scan.nextLine();

                boolean removido = false;
                Iterator<Veiculo> it = veiculos.iterator();
                while (it.hasNext()) {
                    Veiculo veiculo = it.next();
                    if (veiculo.getPlaca().equalsIgnoreCase(placaExcluir)) {
                        it.remove();
                        System.out.println("Veículo removido com sucesso!");
                        removido = true;
                        break;
                    }
                }

                    if (!removido) {
                        System.out.println("Nenhum veículo encontrado com a placa: " + placaExcluir);
                    }
                        break;
                
                case 4: 
                System.out.println("Deseja pesquisar por Placa ou Modelo? (P/M)");
                String opcaoPesquisa = scan.nextLine().trim().toUpperCase();

                boolean encontradoPesquisa = false;

                if (opcaoPesquisa.equals("P")) {
                    System.out.println("Digite a placa do veículo: ");
                    String placaPesquisa = scan.nextLine();

                    for (Veiculo veiculo : veiculos) {
                        if (veiculo.getPlaca().equalsIgnoreCase(placaPesquisa)) {
                            System.out.println(veiculo.toString());
                            encontradoPesquisa = true;
                break; 
            }
        }

                } else if (opcaoPesquisa.equals("M")) {
                    System.out.println("Digite o modelo ou parte do modelo do veículo: ");
                    String modeloPesquisa = scan.nextLine().toLowerCase();
                
                for (Veiculo veiculo : veiculos) {
                    if (veiculo.getModelo().toLowerCase().contains(modeloPesquisa)) {
                        System.out.println(veiculo.toString());
                        encontradoPesquisa = true;
            }
         }

                } else {
                    System.out.println("Opção inválida!");
            }

                if (!encontradoPesquisa) {
                    System.out.println("Nenhum veículo encontrado com esses critérios.");
        }
                    break;
    
            
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

