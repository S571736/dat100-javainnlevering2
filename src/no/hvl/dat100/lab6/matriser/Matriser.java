package no.hvl.dat100.lab6.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        // TODO
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j]);
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        String str = "";
        // TODO
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                str += matrise[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        //Litt risky å sette "kollonene" til å være matrise.length ettersom 2D arrays kan ha forskjellige lengder, men antar dette går greit ettersom det er matriser det er snakk om
        int[][] m = new int[matrise.length][matrise.length];
        // TODO

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                m[i][j] = matrise[i][j] * tall;
            }
        }

        return m;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        //Liten test for å sjekke at hovedlistene er like lange og første sublistene er like lang
        if (a.length != b.length || a[1].length != b[1].length) {

            return false;
        }
        // TODO
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {
        int[][] speilet = new int[matrise.length][matrise[0].length];
        // TODO


        for (int i = 0; i < matrise[0].length; i++) {
            for (int j = 0; j < matrise.length; j++) {


                speilet[i][j] = matrise[j][i];


            }

        }
        return speilet;

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        // TODO
        if (a[0].length != b.length) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=0;
                for (int k = 0; k < a.length; k++) {
                    c[i][j] += a[i][k]*b[k][j];

                }
            }

        }
        return c;
    }
}
