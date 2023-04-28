public class Pikendatud_Euroalus extends Kaup implements Laadimine{
    int pikkus;
    int laius;
    int korgus;
    double maht;

    public Pikendatud_Euroalus(int kaal, double laadimismeeter, int pikkus, int laius, int korgus) {
        super(kaal, laadimismeeter);
        this.pikkus = pikkus;
        this.laius = laius;
        this.korgus = korgus;
        this.maht = 13.6 / laadimismeeter;
    }

    @Override
    public double taishaagis() {
        double taishaagis = 13.6;
        double maht = taishaagis / laadimismeeter;
        return maht;
    }

    @Override
    public double kogumass() {
        double kogumass = maht * kaal;
        return kogumass;
    }

    @Override
    public double ruumala() {
        int ruumala = pikkus*laius*korgus;
        return ruumala / 1000000.0;
    }
}