package edu.pab.unidad0;

import java.util.Scanner;

public class Pagos {

    private static Scanner in = new Scanner(System.in);

    private static int getMesesVencidos() {
        System.out.print("Ingrese el numero de meses vencidos: ");
        int meses = Integer.parseInt(in.nextLine());
        return meses;
    }

    private static void solicitarPagos(double[] pagos) {
        int cantidadMeses = pagos.length;
        for (int i = 0; i < cantidadMeses; i++) {
            System.out.print("Ingrese pago del mes # " + (i + 1) + ": ");
            pagos[i] = Double.parseDouble(in.nextLine());
        }
    }

    private static double calcularPromedio(double[] pagos) {
        int cantidadMeses = pagos.length;
        double suma = 0;
        for (int i = 0; i < cantidadMeses; i++) {
            suma += pagos[i]; // suma = suma + pagos[i];
        }
        double promedio = suma / cantidadMeses;
        return promedio;
    }

    private static double buscarPagoMayor(double[] pagos) {
        double mayor = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (mayor < pagos[i]) {
                mayor = pagos[i];
            }
        }
        return mayor;
    }

    private static double buscarPagoMenor(double[] pagos) {
        double menor = pagos[0];
        for (int i = 1; i < pagos.length; i++) {
            if (menor > pagos[i]) {
                menor = pagos[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int cantidadMeses = getMesesVencidos();
        double[] pagos = new double[cantidadMeses];

        solicitarPagos(pagos);
        double promedio = calcularPromedio(pagos);
        double mayor = buscarPagoMayor(pagos);
        double menor = buscarPagoMenor(pagos);

        System.out.println();
        System.out.println("El promedio es  : " + promedio);
        System.out.println("El pago mayor es: " + mayor);
        System.out.println("El pago menor es: " + menor);
    }

}