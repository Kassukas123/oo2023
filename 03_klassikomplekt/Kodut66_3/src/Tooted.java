public class Tooted {
    Kaabel kaabel;
    int jamedus;
    int kogus;

    public Tooted(Kaabel kaabel, int jamedus, int kogus) {
        this.kaabel = kaabel;
        this.jamedus = jamedus;
        this.kogus= kogus;
    }

    public void jamedamValik(int paksus) {
        this.jamedus = paksus;
        System.out.println("Olete valinud paksema kaabli: "+this.jamedus+ "mm.");
    }

    public void duubeldaKogust() {
        this.kogus = this.kogus * 2;
        System.out.println("Toote uus kogus: "+this.kogus+ " tükki.");
    }
}
