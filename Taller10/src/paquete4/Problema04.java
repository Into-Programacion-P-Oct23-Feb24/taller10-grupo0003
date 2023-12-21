/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double valor;
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese los valores[%d][%d]:\n",
                        i,
                        j);
                valor = entrada.nextDouble();
                if (valor > 1000 && valor < 1199) {
                    datos[i][j] = valor;
                } else {
                    datos[i][j] = 10;
                }

            }
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (datos[i][j] == 10) {
                    contador = contador + 1;

                }
                System.out.printf("fila[%d] columna[%d] = %.0f\n",
                         i,
                        j,
                        datos[i][j]);
            }

        }
        System.out.printf("Valores fuera de rango: %d\n",
                contador);
    }

}
