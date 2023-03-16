import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija {
    private double lubatudViivis;
    private List<String> üleAjaNimed = new ArrayList<>();

    public ViiviseHoiataja(double lubatudViivis) {
        this.lubatudViivis = lubatudViivis;
    }

    @Override
    public void SalvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > lubatudViivis && !üleAjaNimed.contains(laenutajaNimi)) {
            üleAjaNimed.add(laenutajaNimi);
        }
    }

    List<String> getHoiatatavadLaenutajad() {
        return üleAjaNimed;
    }
}
