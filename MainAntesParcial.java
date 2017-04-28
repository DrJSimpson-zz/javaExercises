package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hora = 1;
        int minuto = 5;
        int segundos = 15;

        System.out.println(calcularHoraEnSegundos(1));
        System.out.println(calcularMinutoEnSegundos(1));
        System.out.println(6);

        System.out.println("--------------------");
        System.out.println(calcularHMSEnSegundos(1,1,6));
    }

    public static int calcularHMSEnSegundos(int horas, int minutos, int segundos) {
        return calcularHoraEnSegundos(horas) +
                calcularMinutoEnSegundos(minutos) +
                segundos;
    }

    public static int calcularHoraEnSegundos(int horas) {
        return horas * calcularMinutoEnSegundos(60);
    }

    public static int calcularMinutoEnSegundos(int minutos) {
        return minutos * 60;
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static void mostrarPrimosHastaN() {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        for (int i = 1; i < numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public void readThings() {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        float b = s.nextFloat();
        String str = s.nextLine();
    }
}
