package ee.kaspar.kodus.primitiividkodus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @GetMapping("tere-maailm")
    public String tereMaailm(){
        return "Tere maailm";
    }

    @GetMapping("liida/{nr1}/{nr2}")
    public Integer liida(@PathVariable Integer nr1, @PathVariable Integer nr2) {
        return nr1 + nr2;
    }

    @GetMapping("korruta/{nr1}/{nr2}")
    public Integer korruta(@PathVariable Integer nr1, @PathVariable Integer nr2) {
        return nr1 * nr2;
    }

    @GetMapping("astenda/{nr1}")
    public Integer astenda(@PathVariable Integer nr1) {
        return nr1 * nr1;
    }

    @GetMapping("p2ev/{hinnang}")
    public String t2naneHinnang(@PathVariable String hinnang) {
        return "Tänane päev on " + hinnang + "!";
    }

    @GetMapping("korrutustabel/{arv}")
    public String korrutusTabel(@PathVariable Integer arv) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += (arv + " * " + i + " = " + (arv * i) + "\n");
        }
        return result;
    }
}
