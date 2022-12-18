package primeirodesafio;

import java.util.ArrayList;
import java.util.Collections;

public class Metodos {

//Esse método ordena e imprime os números ímpares de maneira decrescente
    public void ordenaNumerosImpar(ArrayList<Integer> lista){
        Collections.reverse(lista);
        for (int numeros: lista) {
            if (numeros %2 == 1){
                System.out.println(numeros);
            }
        }
    }

    //Esse método ordena e imprime os números ímpares de maneira crescente
    public void ordenarNumerosPar(ArrayList<Integer> lista){
        Collections.sort(lista);
        for (int numeros: lista) {
            if (numeros %2 == 0){
                System.out.println(numeros);
            }
        }
    }
}
