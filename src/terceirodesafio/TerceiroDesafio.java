package terceirodesafio;

import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tamanho do array
        System.out.println("Digite o tamanho do array");
        int n = scanner.nextInt();

        // valor alvo
        System.out.println("Digite o valor alvo");
        int k = scanner.nextInt();

        //array com o tamanho lido
        int[] arr = new int[n];

        //elementos do array
        System.out.println("Digite um numero e aperte ENTER");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Chamada da função
        int resultado = numPares(k, arr);

        // imprime o resultado
        System.out.println();
        System.out.println("Resultado:" + resultado);
    }

    public static int numPares(int k, int[] arr) {
        // variável que irá armazenar o resultado final
        int resultado = 0;

        // loop para percorrer o array
        for (int i = 0; i < arr.length; i++) {
            // loop para comparar o elemento atual com os elementos restantes do array
            for (int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    resultado++;
                }
            }
        }
        return resultado;
    }
}
