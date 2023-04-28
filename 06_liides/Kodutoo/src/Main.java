public class Main {
    public static void main(String[] args) {

        Euroalus euroalus = new Euroalus(350, 0.4, 120, 80, 150);
        System.out.println("Tehted euroalustega:");
        System.out.println("Täishaagisesse mahub " + euroalus.taishaagis() + " euroalust");
        System.out.println("Selliste aluste kogumass täishaagises on " + euroalus.kogumass() + " kilogrammi");
        System.out.println("Sellise ühe aluse ruumala on " + euroalus.ruumala() + " ruutmeetrit");
        System.out.println();

        Poolikalus poolikalus = new Poolikalus(120, 0.2, 60, 80, 50);
        System.out.println("Tehted poolalustega:");
        System.out.println("Täishaagisesse mahub " + poolikalus.taishaagis() + " poolalust");
        System.out.println("Selliste aluste kogumass täishaagises on " + poolikalus.kogumass() + " kilogrammi");
        System.out.println("Sellise ühe aluse ruumala on " + poolikalus.ruumala() + " ruutmeetrit");
        System.out.println();

        Pikendatud_Euroalus pikendatudEuroalus = new Pikendatud_Euroalus(550, 0.5, 150, 80, 200);
        System.out.println("Tehted pikendatud euroalustega:");
        System.out.println("Täishaagisesse mahub " + pikendatudEuroalus.taishaagis() + " pikendatud euroalust");
        System.out.println("Selliste aluste kogumass täishaagises on " + pikendatudEuroalus.kogumass() + " kilogrammi");
        System.out.println("Sellise ühe aluse ruumala on " + pikendatudEuroalus.ruumala() + " ruutmeetrit");
    }
}