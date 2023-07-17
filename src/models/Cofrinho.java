package models;
import java.util.ArrayList;

// A classe Cofrinho armazena várias moedas em uma lista e realiza operações com essas moedas.
public class Cofrinho {
    // Uma lista que armazena todas as moedas do cofrinho.
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    // Contadores para as quantidades de cada tipo de moeda.
    private int quantidadeDolares = 0;
    private int quantidadeReais = 0;
    private int quantidadeEuros = 0;

    // Método para adicionar moedas ao cofrinho.
    public void adicionarMoedas(Moeda moeda){
        // Aumenta o contador correspondente ao tipo de moeda.
        if (moeda.getClass() == Euro.class) {
            quantidadeEuros += 1;
        } else if (moeda.getClass() == Dolar.class) {
            quantidadeDolares += 1;
        } else if (moeda.getClass() == Real.class) {
            quantidadeReais += 1;
        }
        // Adiciona a moeda à lista de moedas.
        this.listaMoedas.add(moeda);
    }
    // Método para remover moedas do cofrinho.
    public void removerMoedas(Moeda moeda){
        // Remove a moeda da lista de moedas.
        this.listaMoedas.remove(moeda);
    }
    // Método para listar todas as moedas no cofrinho.
    public ArrayList<Moeda> listarMoedas() {
        // Retorna a lista de moedas.
        return listaMoedas;
    }

    // Método para calcular o valor total das moedas convertido para real.
    public double totalValorMoedasConvertido(){
        // Variável para armazenar o valor total.
        double valorTotal = 0;
        // Loop para somar o valor convertido para real de cada moeda.
        for (int i = 0; i < this.listaMoedas.size(); i++) {
            Moeda moeda = this.listaMoedas.get(i);
            valorTotal += moeda.converter();
        }
        return valorTotal;
    }
    // Métodos para obter a quantidade de cada tipo de moeda.
    public int getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public int getQuantidadeEuros() {
        return quantidadeEuros;
    }

    public int getQuantidadeReais() {
        return quantidadeReais;
    }
}