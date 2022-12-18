package primeirodesafio;

import java.util.*;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que irá digitar: ");
        int valorEntrada = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        //Laço de repetição de acordo com o número informado pelo usuário
        int qtd = 0;
        while (qtd < valorEntrada){
            System.out.println("Digite um numero inteiro: ");
            int numero = scanner.nextInt();
            //adicionando os números na lista
            lista.add(numero);
            qtd ++;
        }
        //Chamando os métodos que ordenam e apresentam os números
        System.out.println("Sequência de números pares:");
        metodos.ordenarNumerosPar(lista);

        System.out.println("Sequência de números ímpares:");
        metodos.ordenaNumerosImpar(lista);
    }



}
