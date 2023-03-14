public class SuurimViiviseLeidja implements Kontrollija {
    private String suurimaViivisegaNimi;
    private String suurimaViivisegaTeoseKirjeldus;
    private double suurimViivitis;

    void SaadaHoiatus() {
        System.out.println("Suurima viivisega laenutaja: " + suurimaViivisegaNimi +
                " tema poolt laenutatud teos: " + suurimaViivisegaTeoseKirjeldus);
    }

    @Override
    public void SalvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > suurimViivitis) {
            suurimViivitis = viiviseSuurus;
            suurimaViivisegaNimi = laenutajaNimi;
            suurimaViivisegaTeoseKirjeldus = teoseKirjeldus;
        }
    }
}
