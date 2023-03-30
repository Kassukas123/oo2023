public class Laoseis {
    String toode;
    int kogus;
    int tellimus;
    int kaal;
    int kogumass;

    public Laoseis(String toode, int kogus, int tellimus, int kaal){
        this.toode = toode;
        this.kogus = kogus;
        this.tellimus = tellimus;
        this.kaal = kaal;
    }
    public void TooteVotmine(){
        this.kogus = this.kogus - this.tellimus;
        System.out.println("Seda toodet jäi veel lattu: "+this.kogus+" tükki.");
        if(this.kogus == 0 || this.kogus < 0){
            System.out.println("See toode sai laost otsa");
        }
    }
    public void TooteKogumass(){
        this.kogumass=this.kogus*this.kaal;
        System.out.println("Selle toote kogumass laos on: "+this.kogumass+" kilogrammi.");
    }
}
