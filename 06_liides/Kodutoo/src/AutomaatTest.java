import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    //Euroalus testid
    @Test
    public void kontrolli_euralus_ruumala() {
        Euroalus euroalus = new Euroalus(400, 0.4, 120, 80, 100);
        assertEquals(0.96, euroalus.ruumala(), 0.1);
    }

    @Test
    public void kontrolli_euralus_taishaagist(){
        Euroalus euroalus = new Euroalus(400, 0.4, 120, 80, 100);
        assertEquals(34, euroalus.taishaagis(), 0.1);
    }

    @Test
    public void kontrolli_euralus_kogumassi(){
        Euroalus euroalus = new Euroalus(400, 0.4, 120, 80, 100);
        assertEquals(13600.0, euroalus.kogumass(), 0.1);
    }

    //Poolikalus testid
    @Test
    public void kontrolli_poolikalus_ruumala() {
        Poolikalus poolikalus = new Poolikalus(250, 0.2, 60, 80, 80);
        assertEquals(0.384, poolikalus.ruumala(), 0.1);
    }

    @Test
    public void kontrolli_poolikalus_taishaagist(){
        Poolikalus poolikalus = new Poolikalus(250, 0.2, 60, 80, 80);
        assertEquals(68, poolikalus.taishaagis(), 0.1);
    }

    @Test
    public void kontrolli_poolikalus_kogumassi(){
        Poolikalus poolikalus = new Poolikalus(250, 0.2, 60, 80, 80);
        assertEquals(17000.0, poolikalus.kogumass(), 0.1);
    }

    //Pikendatud euroalus testid
    @Test
    public void kontrolli_pikendatud_euralus_ruumala() {
        Pikendatud_Euroalus pikendatudEuroalus = new Pikendatud_Euroalus(500, 0.5, 150, 80, 100);
        assertEquals(1.2, pikendatudEuroalus.ruumala(), 0.1);
    }

    @Test
    public void kontrolli_pikendatud_euralus_taishaagist() {
        Pikendatud_Euroalus pikendatudEuroalus = new Pikendatud_Euroalus(500, 0.5, 150, 80, 100);
        assertEquals(27.2, pikendatudEuroalus.taishaagis(), 0.1);
    }

    @Test
    public void kontrolli_pikendatud_euralus_kogumassi() {
        Pikendatud_Euroalus pikendatudEuroalus = new Pikendatud_Euroalus(500, 0.5, 150, 80, 100);
        assertEquals(13600, pikendatudEuroalus.kogumass(), 0.1);
    }
}