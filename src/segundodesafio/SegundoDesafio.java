package segundodesafio;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        //Notas
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;

        //Moedas
        int mCinquenta = 0;
        int mVinteCinco= 0;
        int mDez= 0;
        int mCinco= 0;
        int mUm= 0;

        String notas = "nota(s)";
        String de = "de";
        String rs = "R$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja analisar");
        double entrada = scanner.nextDouble();
        double valor = 0;

        while (entrada != valor) {

            if (entrada - valor >= 100d){
                cem++;
                valor += 100d;
            }
            else if(entrada - valor >= 50d){
                cinquenta++;
                valor += 50d;
            }
            else if (entrada - valor >= 20d){
                vinte++;
                valor += 20d;
            }
            else if (entrada - valor >= 10d){
                dez++;
                valor += 10d;
            }
            else if (entrada - valor >= 5d){
                cinco++;
                valor += 5d;
            }
            else if (entrada - valor >= 2d){
                dois++;
                valor += 2d;
            }
            else if (entrada - valor >= 1){
                um++;
                valor += 1d;
            }
            else if (entrada - valor >= 0.50){
                mCinquenta++;
                valor += 0.50d;
            }
            else if (entrada - valor >= 0.25){
                mVinteCinco++;
                valor += 0.25;
            }
            else if (entrada - valor >= 0.10){
                mDez++;
                valor += 0.10;
            }
            else if (entrada - valor >= 0.05){
                mCinco++;
                valor += 0.05;
            }
            else if (entrada - valor >= 0.01){
                mUm++;
                valor += 0.01;
            }
        }
        //Arrays que armazenam as informações necessárias para apresentar o resultado para o usuário
        int[] array = {
                cem, cinquenta, vinte, dez, cinco, dois, um, mCinquenta, mVinteCinco, mDez, mCinco, mUm
        };

        float[] valores = {
                100, 50, 20, 10, 5, 2, 1, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f
        };

        for (int i = 0; i < array.length -1; i ++) {
            if (i == 0){
                System.out.println("NOTAS:");
            }
            if (i == 7){
                System.out.println("MOEDAS:");
            }
            String formatado = String.format("%2s %10s %10s %10s %09.2f", array[i], notas, de, rs, valores[i]);
            System.out.println(formatado);
        }
    }
}
