package quartodesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // lê a quantidade de casos de teste
        System.out.println("Digite a quantidade de linhas que deseja comparar");
        int numCasos = scanner.nextInt();
        List<String> lista = new ArrayList<>();
        //Esse scanner foi adicionado pois existe um erro no scanner(padrão) quando se utiliza o nextint(), é apenas para o código funcionar corretamente
        scanner.nextLine();
        // loop para ler cada linha de entrada e desembaralhar (decifrar) a string
        for (int i = 1; i < numCasos+1; i++) {
            // lê a linha de entrada
            System.out.println("Digite a " + i + "ª frase: ");
            String linha = scanner.nextLine();
            // divide a string ao meio
            String metade1 = linha.substring(0, linha.length() / 2);
            String metade2 = linha.substring(linha.length() / 2);
            // inverte a primeira metade da string
            StringBuilder metade1Invertida = new StringBuilder(metade1).reverse();
            // inverte a segunda metade da string
            StringBuilder metade2Invertida = new StringBuilder(metade2).reverse();

            // concatena as duas metades invertidas para formar a string original
            String linhaOriginal = metade1Invertida.toString() + metade2Invertida;
            lista.add(linhaOriginal);
        }
        for (String linhas: lista) {
            System.out.println(linhas);
        }
    }
}
