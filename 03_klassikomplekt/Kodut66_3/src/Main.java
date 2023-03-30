public class Main {
    public static void main(String[] args) {
        Tooted toode1 = new Tooted(new Kaabel("Jõukaabel", "Must", "Keskmine"),25, 1200);
        Tooted toode2 = new Tooted(new Kaabel("Netikaabel", "Valge", "Väike"),10, 700);

        toode1.jamedamValik(40);
        toode2.duubeldaKogust();
    }
}