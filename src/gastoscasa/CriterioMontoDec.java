package gastoscasa;

import java.util.Comparator;

public class CriterioMontoDec implements Comparator<Gasto>{
    public int compare(Gasto g1, Gasto g2){
        return g2.getMonto()-g1.getMonto();
    }
}
