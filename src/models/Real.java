package models;
// A classe Real representa a moeda Real. Ela herda de Moeda.
public class Real extends Moeda{
    // Construtor que inicializa a moeda Real com um valor específico.
    public Real(double value) {// Chama o construtor da classe mãe (Moeda) com o valor fornecido.
        super(value);
    }
    // Método que imprime informações sobre a moeda Real.
    @Override
    public void info() {
        // Obtém o nome da classe (Real) e imprime junto com o valor atual da moeda.
        String className = this.getClass().getName();
        System.out.println(className + "Valor total em" + this.value);
    }

    // Método que converte o valor da moeda para Real.
    // Como a moeda já está em Real, ela apenas retorna o valor original.
    @Override
    public double converter() {
        return this.value;
    }
}
