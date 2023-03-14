public class Kodanik {
    private String eesnimi;
    private String perenimi;
    private String isikukood;
    private boolean olemasolu;

    public Kodanik(String eesnimi, String perenimi, String isikukood, boolean olemasolu) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.isikukood = isikukood;
        this.olemasolu = olemasolu;
    }

    public String getIsikukood() {
        return isikukood;
    }
    boolean kasJuhilubaOnOlemas(){
        if (olemasolu){
            return true;
        }
        else {
            return false;
        }
    }
    boolean kasOnTäiskasvanuAastal2018(){
        StringBuilder sünniaastasb = new StringBuilder();
        String aasta = String.valueOf(getIsikukood().charAt(0));
        if (aasta.equals("6")){
            sünniaastasb.append("20");
            sünniaastasb.append(getIsikukood().charAt(1));
            sünniaastasb.append(getIsikukood().charAt(2));
        }
        if (aasta.equals("5")){
            sünniaastasb.append("20");
            sünniaastasb.append(getIsikukood().charAt(1));
            sünniaastasb.append(getIsikukood().charAt(2));
        }
        if (aasta.equals("4")){
            sünniaastasb.append("19");
            sünniaastasb.append(getIsikukood().charAt(1));
            sünniaastasb.append(getIsikukood().charAt(2));
        }
        if (aasta.equals("3")){
            sünniaastasb.append("19");
            sünniaastasb.append(getIsikukood().charAt(1));
            sünniaastasb.append(getIsikukood().charAt(2));
        }
        int sünniaasta = Integer.parseInt(sünniaastasb.toString());
        if (2018-sünniaasta>=18){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return eesnimi + " " + perenimi;
    }
}
