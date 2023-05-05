package ee.kaspar.kodutoo.kodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1,"Marko","Tamm",new Date()),
            new Isik(2,"Laura","Maja",new Date()),
            new Isik(3,"Kris","Mahl",new Date())
    ));

    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikud;
    }

    @DeleteMapping("kustuta-isik/{index}")
    public String kustutaIsik(@PathVariable int index) {
        isikud.remove(index);
        return "Isik kustutatud!";
    }

    // POST localhost:8080/lisa-isik?id=1&eesnimi=Ees&perenimi=Pere
    @PostMapping("lisa-isik")
    public List<Isik> lisaIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        return isikud;
    }
}