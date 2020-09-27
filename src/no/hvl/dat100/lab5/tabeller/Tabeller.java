package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        // TODO
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (!(i == tabell.length - 1)) {
                System.out.print(", ");
            }
            if (i == tabell.length - 1) {
                System.out.println();
            }
        }

    }

    // b)
    public static String tilStreng(int[] tabell) {

        String str = "[";
        // TODO

        for (int i = 0; i < tabell.length; i++) {
            str += tabell[i];
            if (!(i == tabell.length - 1)) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }

    // c)
    public static int summer(int[] tabell) {
        int sum = 0;
        // TODO
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }

        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        // TODO
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                return true;
            }
        }

        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        // TODO
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                return i;
            }
        }

        return -1;

    }

    // f)
    public static int[] reverser(int[] tabell) {

        int[] reversert = new int[tabell.length];
        int j = 0;
        // TODO
        for (int i = tabell.length - 1; i >= 0; i--) {
            reversert[j] = tabell[i];
            j++;
        }

        return reversert;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        int past;
        // TODO

        if (tabell.length < 2) {
            return true;
        }

        past = tabell[0];
        for (int i = 1; i < tabell.length; i++) {
            if (past > tabell[i]) {
                return false;
            }
        }

        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] nytab = new int[tabell1.length + tabell2.length];
        // TODO

        for (int i = 0; i < tabell1.length; i++) {
            nytab[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++) {
            nytab[i + tabell1.length] = tabell2[i];
        }

        return nytab;
    }

}
