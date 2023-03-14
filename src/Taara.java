public class Taara {
    private String joogiNimi;
    private char pakendiTähis;
    private String jooja;

    public Taara(String joogiNimi, char pakendiTähis, String jooja) {
        this.joogiNimi = joogiNimi;
        this.pakendiTähis = pakendiTähis;
        this.jooja = jooja;
    }

    public String getJoogiNimi() {
        return joogiNimi;
    }

    public char getPakendiTähis() {
        return pakendiTähis;
    }

    public String getJooja() {
        return jooja;
    }
    double tagatisraha(char tähis){
        if (tähis=='A'){
            return 0.004;
        }
        if (tähis=='B'||tähis=='C'||tähis=='D'){
            return 0.08;
        }
        else {
            return 0;
        }
    }
    double taaraMaksumus(){
        return tagatisraha(getPakendiTähis());
    }

    @Override
    public String toString() {
        return "Taara{" +
                "joogiNimi='" + joogiNimi + '\'' +
                ", pakendiTähis=" + pakendiTähis +
                ", jooja='" + jooja + '\'' + ", maksumus='"+(taaraMaksumus()*100)+" senti"+
                '}';
    }
}
