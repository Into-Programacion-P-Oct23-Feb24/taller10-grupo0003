/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String reporte = "";
        double[][] ventas = new double[2][5];
        double ventas_r;
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double suma = 0;
        
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese el numero de ventas[%d][%d]:\n",
                        f,
                        c);
                ventas_r = entrada.nextInt();
                ventas[f][c] = ventas_r;
                suma = suma + ventas[f][c];
            }
        }
        for (int i = 0; i < ventas.length; i++) {
            reporte = String.format("%sVendedor(a) %s\n",
                    reporte,
                    vendedores[i]);
        }
        System.out.printf("%sHa realizado un total de %.2f en ventas\n",
                reporte,suma);

    }
}
