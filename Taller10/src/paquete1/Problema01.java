/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};

        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis",
            "David Bell"};

        double suma = 0;
        String reporte = "";
        double[] promedios = new double[3];
        double promedio = 4;

        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
                promedio = suma / 4;
            }

            promedios[i] = promedio;

        }
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante: %s tiene un promedio de: "
                    + "de notas: %.2f\n",
                    reporte,
                    nombresEstudiante[i],
                    promedios[i]);
        }

        System.out.printf("%s\n", reporte);
    }

}
