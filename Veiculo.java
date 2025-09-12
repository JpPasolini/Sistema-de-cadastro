public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;

    Veiculo() {

    }

    Veiculo(String marca, String modelo, String placa, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(){
        this.modelo = modelo;
    }
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(){
        this.placa = placa;
    }
    public int getano(){
        return ano;
    }

    public void setAno(){
        this.ano = ano;
    }

    public String toString() {
    return "=== Dados do Veículo ===\n" +
           "Marca: " + marca + "\n" +
           "Modelo: " + modelo + "\n" +
           "Placa: " + placa + "\n" +
           "Ano: " + ano;
}


    }
