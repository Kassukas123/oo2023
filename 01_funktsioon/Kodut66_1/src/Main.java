public class Main {
    public static void main(String[] args) {
        int arv1 = 15000;
        int arv2 = 10500;
        System.out.println(arv1 + " - " + arv2 + " = " + lahutamine(arv1, arv2));

        int temperatuur = 10;
        System.out.println(ilmhinnang(temperatuur)+ " ,temperatuur on "+ (temperatuur)+ " kraadi");

        double kell = 8.15;
        System.out.println("Kui kool algab " + (kell) + " , siis võiks kodust juba väljuda " + ajaplaneerimine(kell));
    }

    private static int lahutamine(int arv1, int arv2) {
        return arv1 - arv2;
    }

    private static String ilmhinnang(int temperatuur) {
        String hinnang;
        if (temperatuur > 15) {
            hinnang = "Õues on soe";
        } else {
            hinnang = "Õues on külm";
        }
        return hinnang;
    }

    private static double ajaplaneerimine(double kell) {
        return (double) kell - (double) 1.00;
    }
}