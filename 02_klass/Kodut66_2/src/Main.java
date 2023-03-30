public class Main {
    public static void main(String[] args) {
        Laoseis toode1 = new Laoseis("Toode1", 10, 2, 7);
        Laoseis toode2 = new Laoseis("Toode2", 30, 5, 10);

        toode1.TooteVotmine();
        System.out.println();

        toode2.TooteKogumass();
        System.out.println();
    }
}