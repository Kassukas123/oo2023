package ee.kaspar.kodutoo.kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Kaup {
    private int id;
    private String nimi;
    private double hind;
    private double kaal;
    private boolean olemas;
}