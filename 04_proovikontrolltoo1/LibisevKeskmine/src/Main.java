import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1 võimalus
        String vastus = aritmeetiliseKeskmiseLeidmine(12, 15, 17);
        System.out.println(vastus);
        //2 võimalus
        System.out.println(aritmeetiliseKeskmiseLeidmine2(10,9,7));

        double[] sisend = {3,4,5,6};
        //arrays tuleb importida
        // List<Double> sisend = new ArrayList(Arrays.asList(3,4,5,6));  vaja importida list, arrayList JA Arrays
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));

        //libisevkeskine liidab algusest kolm arvu ning leiab nende keskmise,
        // järgmisena liigub ta ühe sammu edasi ja liidab need kolm arvu ja leiab keskmise jne..
        LibisevKeskmine libisev = new LibisevKeskmine(2,3,4);
        libisev.lisaArv(5);
        libisev.lisaArv(6);
        libisev.lisaArv(7);
        System.out.println(libisev.arvudKeskmisega);
    }

    //1 võimalus
    private static String aritmeetiliseKeskmiseLeidmine(double arv1, double arv2, double arv3) {
        double aritmeetilineKeskmine = (arv1 + arv2 + arv3) / 3;
        return ("Aritmeetiline keskmine on " + aritmeetilineKeskmine);
    }

    //2 võimalus
    private static double aritmeetiliseKeskmiseLeidmine2(double arv1, double arv2, double arv3) {
        return (arv1 + arv2 + arv3) / 3;
    }

    // List numbriteList = new ArrayList(); see on manipuleeritav   List<Double>
    // Lis numbriteList[]  read only

    private static double[] libisevKeskmine(double[] arvud) {
        double[] valjund = new double[arvud.length - 2];
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3;
        }
        return valjund;
    }
}