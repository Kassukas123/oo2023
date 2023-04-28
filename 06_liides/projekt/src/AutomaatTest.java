import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("Mari","40404049996");
        assertEquals("F", ee.getSugu());
    }

    @Test
    public void kontrolli_kas_on_vigane_kui_isikukoodi_alguses_on_7() {
        IsikukoodEE ee = new IsikukoodEE("Mari","70303039914");
        assertEquals("Vigane isikukood!", ee.getSugu());
    }

    @Test
    public void kontrolli_kas_kuupaev_on_03_03_1903_kui_isikukood_30303039816() {
        IsikukoodEE ee = new IsikukoodEE("Mari","30303039816");
        assertEquals("03.03.1903", ee.getKuupaev());
    }

    @Test
    public void kontrolli_kas_kuupaev_on_03_03_1903_kui_isikukood_111111_111Q() {
        IsikukoodFI fi = new IsikukoodFI("Martins","111111-111Q");
        assertEquals("11.11.1911", fi.getKuupaev());
    }
}
