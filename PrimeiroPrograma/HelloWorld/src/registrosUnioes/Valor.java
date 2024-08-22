package registrosUnioes;

public class Valor {
    private int inteiro;
    private double decimal;
    private String texto;

    // Definir o valor como inteiro
    public void setValor(int valor) {
        this.inteiro = valor;
        this.decimal = 0.0;
        this.texto = null;
    }

    // Definir o valor como decimal
    public void setValor(double valor) {
        this.inteiro = 0;
        this.decimal = valor;
        this.texto = null;
    }

    // Definir o valor como texto
    public void setValor(String valor) {
        this.inteiro = 0;
        this.decimal = 0.0;
        this.texto = valor;
    }

    // Exibir o valor atualmente definido
    public void exibirValor() {
        if (this.texto != null) {
            System.out.println("Valor: " + this.texto);
        } else if (this.decimal != 0.0) {
            System.out.println("Valor: " + this.decimal);
        } else {
            System.out.println("Valor: " + this.inteiro);
        }
    }
}