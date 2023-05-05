package ee.kaspar.kodutoo.kodutoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TellimusController {
    @Autowired
    IsikController isikController;
    @Autowired
    KaupController kaupController;
    List<Kaup> tellitudKaubad = new ArrayList<>(Arrays.asList(
            new Kaup(1,"Elektrikilp",396.15,35.5,true),
            new Kaup(6,"Arvesti",746.42,5.56,true)
    ));

    Isik isik = new Isik(4, "Anna", "Hiir", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(10, isik, tellitudKaubad)
    ));

    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }

    // POST localhost:8080/lisa-tellimus?id=100&isikuIndex=2&kaubaIndex=2
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaKaup(
            @RequestParam int id, // (määrad suvaliselt tellimuse id)
            @RequestParam int isikuIndex,  // (0-2)
            @RequestParam int kaubaIndex) { // (0-5)
        Isik isik = isikController.isikud.get(isikuIndex);

        Kaup tellitudKaup = kaupController.kaubad.get(kaubaIndex);
        List<Kaup> tellitudKaubad = new ArrayList<>(Arrays.asList(tellitudKaup));

        tellimused.add(new Tellimus(id, isik, tellitudKaubad));
        return tellimused;
    }

    // POST localhost:8080/lisa-suur-tellimus?id=200&isikuIndex=3&kaubaIndexid=2,2,3
    @PostMapping("lisa-suur-tellimus")
    public List<Tellimus> lisaMituKaupa(
            @RequestParam int id, // (määrad suvaliselt tellimuse id)
            @RequestParam int isikuIndex, // (0-2)
            @RequestParam int[] kaubaIndexid) { // (0-5)
        Isik isik = isikController.isikud.get(isikuIndex);
        List<Kaup> tellitudKaubad = new ArrayList<>();
        for (int i : kaubaIndexid) {
            Kaup kaup = kaupController.kaubad.get(i);
            tellitudKaubad.add(kaup);
        }
        tellimused.add(new Tellimus(id, isik, tellitudKaubad));
        return tellimused;
    }
}