import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao Cofrinho de Victor RU:3907199");

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        Moeda moeda = new Real(0.0);
        int opcao = 0;

        // Define as cotações das moedas
        double cotacaoReal = 1.0;
        double cotacaoEuro = 4.8;
        double cotacaoDolar = 5.4;

        while (opcao != 5){
            /* Enquanto a opção não for 5 (encerrar), o programa continuará funcionando*/
            System.out.println(" ==== Menu Inicial ==== ");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Adicionar moedas");
            System.out.println("2 - Remover moedas");
            System.out.println("3 - Listar todas as moedas");
            System.out.println("4 - Calcular total de dinheiro convertido em real");
            System.out.println("5 - Encerrar");
            System.out.print(">>> ");

            opcao = scanner.nextInt();// Lê a opção do usuário

            switch (opcao) {
                case 1:
                    int opcaoMoeda = 0;
                    double quantidade = 0.0;
                    System.out.println("1 - Adicionar Real");
                    System.out.println("2 - Adicionar Euro");
                    System.out.println("3 - Adicionar Dolar");
                    System.out.println("4 - Sair");
                    opcaoMoeda = scanner.nextInt(); // Lê a opção do usuário para a moeda

                    System.out.print("Digite a quantidade: ");
                    quantidade = scanner.nextInt(); // Lê a quantidade de moedas a serem adicionadas

                    // De acordo com a opção escolhida, uma moeda de Real, Euro ou Dólar é criada e adicionada ao cofrinho
                    if (opcaoMoeda == 1 ){
                        moeda = new Real (cotacaoReal);
                    };
                    if (opcaoMoeda == 2 ){
                        moeda = new Euro(cotacaoEuro);
                    };
                    if (opcaoMoeda == 3 ){
                        moeda = new Dolar(cotacaoDolar);
                    };
                    if (opcaoMoeda == 4 ){
                        continue;
                    };

                    // Adiciona a quantidade de moedas escolhida ao cofrinho
                    for ( int i = 0; i < quantidade; i++ ){
                        cofrinho.adicionarMoedas(moeda);
                    }

                    break;
                case 2:
                    System.out.println("Escolha uma moeda a ser retirada");
                    ArrayList<Moeda> listMoedas = cofrinho.listarMoedas();
                    for (int i = 0; i < listMoedas.size(); i++) {
                            moeda = listMoedas.get(i);
                            System.out.println(i + 1 + " - " + moeda.getClass().getSimpleName());
                        }
                    System.out.println(0 +" Sair");

                    opcaoMoeda = scanner.nextInt(); // Lê a opção do usuário para a moeda a ser removida
                    if (opcaoMoeda == 0 ) {
                        continue;  // Se a opção for 0 (sair), não remove nenhuma moeda e retorna ao menu principal
                    }
                    cofrinho.removerMoedas(listMoedas.get(opcaoMoeda - 1));
                    break;
                case 3:
                    System.out.println("Quantidade de moedas de Euros: " + cofrinho.getQuantidadeEuros());
                    System.out.println("Quantidade de moedas de Dólares: " + cofrinho.getQuantidadeDolares());
                    System.out.println("Quantidade de moedas de Reais: " + cofrinho.getQuantidadeReais());
                    break;
                case 4:
                    double valor = cofrinho.totalValorMoedasConvertido(); // Obtém o valor total das moedas convertido em reais
                    System.out.println("Valor total das moedas convertidas em reais: "+ valor);
                    break;
            }
        }


    }
}