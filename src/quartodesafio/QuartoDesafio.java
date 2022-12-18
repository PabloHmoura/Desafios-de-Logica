package quartodesafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuartoDesafio {
//Fiz esse código para facilicar a entrada das frases a partir de um arquivo de texto que foi inserido no projeto :)
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("textos.txt"));
        // loop para ler cada linha de entrada e desembaralhar (decifrar) a string
        while (scanner.hasNext()) {
            // lê a linha de entrada
            String linha = scanner.nextLine();
            // divide a string ao meio
            String metade1 = linha.substring(0, linha.length()/2);
            String metade2 = linha.substring(linha.length()/2);
            // inverte a primeira metade da string
            StringBuilder metade1Invertida = new StringBuilder(metade1).reverse();
            StringBuilder metade2Invertida = new StringBuilder(metade2).reverse();

            String linhaOriginal = metade1Invertida + metade2Invertida.toString();

            System.out.println(linhaOriginal);
        }
    }
}
