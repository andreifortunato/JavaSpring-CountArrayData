package com.desafio.java.junior.sysmanager;

public class ContadorDeArrays extends DesafioJavaApplication {


    Integer countNumbers() {
        countNumbers(Integer[]{ 1, 3, 24, 35, 2, 0, 8, 7, 4 });
        Integer[] count = {};
        Integer aux = 0;
        Integer n = 0;


        System.out.println("Contador desordenado ");
        for (n = 0; n < 8; n++) {
            System.out.println(" " + count[n]);
        }
        System.out.println(" ");

        for (n = 0; n < 8; n++) {
            for (int j = 0; j < 7; j++) {
                if (count[j] > count[j + 1]) {
                    aux = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = aux;
                }
            }
        }

        System.out.println("Contador em Ordem:");
        for (n = 0; n < 8; n++) {
            System.out.println(" " + count[n]);
        }

        System.out.println("Contador em Ordem:");
        for (n = 0; n < 8; n++) {
            for (int i = 0; i < 7; i++) {
                if (count[i] < 4) {
                    System.out.println(" " + count[n]);

                }
                return null;
            }
        }
    }
}







