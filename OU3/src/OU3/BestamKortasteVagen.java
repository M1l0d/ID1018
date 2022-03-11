package OU3;

import java.util.Arrays;

public class BestamKortasteVagen {

    /* Metoden tar emot tre vektorer och returnerar en vektor
    där första siffran motsvarar den kortaste vägen från Z1 Z2 och
    där andra siffran motsvarar den kortaste vägen från Z2 till Z3 */
    public static String bestamVilkenVag(double[] a, double[][] b, double[] c) {

        double[][] d = new double[a.length][c.length];
        int[] mellanstationer = new int[2];
        mellanstationer[0] = 0;
        mellanstationer[1] = 0;
        double dMin = a[0] + b[0][0] + c[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                d[i][j] = a[i] + b[i][j] + c[j];
                if (dMin > d[i][j]) {
                    dMin = d[i][j];
                    mellanstationer [0] = i + 1;
                    mellanstationer [1] = j + 1;
            }
        }
    }
        return Arrays.toString(mellanstationer);
    }

    // Metoden tar emot tre vektorer och returnerar den kortaste streckan
    public static double bestamKortasteStrackan(double[] a, double[][] b, double[] c) {
        double[][] d = new double[a.length][c.length];
        double dMin = a[0] + b[0][0] + c[0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                d[i][j] = a[i] + b[i][j] + c[j];
                if (dMin > d[i][j]) {
                    dMin = d[i][j];
                }
            }
        }
        return dMin;
    }
}