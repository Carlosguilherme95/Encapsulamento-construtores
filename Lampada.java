public class Lampada {
    private String marca;
    private String modelo;
    private boolean lampLigada = true;

    String Lampada(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        return marca + modelo;
    }

   public void ligar() {
       System.out.println("Lampada ligada");

    }

   public void desligar() {
        lampLigada = false;
        if (lampLigada == false) {
            System.out.println("Lampada desligada");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLampLigada() {
        return lampLigada;
    }

    public void setLampLigada(boolean lampLigada) {
        this.lampLigada = lampLigada;
    }
}

