package models;
// A classe Euro representa a moeda Euro. Ela herda de Moeda.
public class  Euro extends Moeda{
    // Construtor que inicializa a moeda Euro com um valor específico.
    public Euro(double value) {
        super(value);// Chama o construtor da classe mãe (Moeda) com o valor fornecido.
    }
    // Método que imprime informações sobre a moeda Euro.
    @Override
    public void info() {
        // Obtém o nome da classe (Euro) e imprime junto com o valor atual da moeda.
        String className = this.getClass().getName();
        System.out.println(className + "Valor total em" + this.value);
    }
    // Método que converte o valor da moeda para Euro.
    // Como a moeda já está em Euro, ela apenas retorna o valor original.
    @Override
    public double converter() {
        return this.value;
    }
}
