package models;

/*
 Representa um conceito geral de uma moeda.
*/
public abstract class Moeda{
    protected double value;

    /**
     * Construtor para Moeda.
     *
     * @param value o valor da moeda
     */
    public Moeda(double value) {
        this.value = value;
    }
    /**
     * Fornece informações sobre a moeda.
     */
    public abstract void info();

    /**
     * Converte o valor da moeda para Real.
     *
     * @return o valor da moeda em Real
     */
    public abstract double converter();
}