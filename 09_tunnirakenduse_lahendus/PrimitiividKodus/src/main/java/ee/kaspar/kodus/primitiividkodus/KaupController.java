package ee.kaspar.kodus.primitiividkodus;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KaupController {
    List<Kaup> kaubad = new ArrayList<>(Arrays.asList(
            new Kaup(1, "Elektrikilp", 396.15, 35.5, true),
            new Kaup(2, "Tööstusvalgusti", 76.48, 11.2, false),
            new Kaup(3, "Redel", 58.75, 23.2, true),
            new Kaup(4, "Betoonjaland", 66.16, 412.43, true),
            new Kaup(5,"Kaablitrummel",746.42,512.8,false)
    ));

    @GetMapping("kataloog")
    public List<Kaup> kataloog() {
        return kaubad;
    }

    @GetMapping("lisa-kaup/{id}/{nimi}/{hind}/{kaal}/{olemas}")
    public List<Kaup> lisaKaup(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable double kaal,
            @PathVariable boolean olemas) {
        kaubad.add(new Kaup(id, nimi, hind, kaal, olemas));
        return kaubad;
    }

    @GetMapping("kustuta-kaup/{index}")
    public String kustutaKaup(@PathVariable int index) {
        String deletedItemName = kaubad.get(index).getNimi();
        kaubad.remove(index);
        return deletedItemName + ", see kaup on nüüd kustutatud!";
    }

    @GetMapping("hinda-juurde")
    public List<Kaup> juurdeHindlus() {
        for (Kaup kaup : kaubad) {
            double vanahind = kaup.getHind();
            double uushind = vanahind + 100;
            kaup.setHind(uushind);
        }
        return kaubad;
    }

    @GetMapping("aktiivsus")
    public List<Kaup> muudaAktiivsust() {
        for (Kaup kaup : kaubad) {
            kaup.setOlemas( !kaup.isOlemas());
        }
        return kaubad;
    }

    @GetMapping("muuda-kaalu/{id}/{kaal}")
    public List<Kaup> muudaKaalu(@PathVariable int id,
                                 @PathVariable double kaal) {
        for (Kaup kaup : kaubad) {
            if (kaup.getId() == id) {
                kaup.setKaal(kaal);
                break;
            }
        }
        return kaubad;
    }
}