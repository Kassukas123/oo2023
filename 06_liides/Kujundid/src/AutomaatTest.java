import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kolmnurga_ymbermoot() {
        Kolmnurk kolmnurk = new Kolmnurk(3, 5.0,6.0,7.0);
        assertEquals(18.0, kolmnurk.arvutaYmberMoot(), 0.0);
    }
}
