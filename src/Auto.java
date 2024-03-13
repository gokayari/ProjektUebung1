public class Auto {

    private String marke;
    private String bauform;
    private String erstzulassung;
    private int kmZustand;
    private double preis;
    private int anzahlDerTüren;

    public Auto(String marke, String bauform,String erstzulassung, int kmZustand,
                double preis, int anzahlDerTüren){
        this.marke = marke;
        this.bauform = bauform;
        this.erstzulassung = erstzulassung;
        this.kmZustand = kmZustand;
        this.preis = preis;
        this.anzahlDerTüren = anzahlDerTüren;
    }

    public String getMarke() {
        return marke;
    }

    public String getBauform() {
        return bauform;
    }

    public String getErstzulassung() {
        return erstzulassung;
    }

    public int getKmZustand() {
        return kmZustand;
    }

    public double getPreis() {
        return preis;
    }

    public int getAnzahlDerTüren() {
        return anzahlDerTüren;
    }

    public void autoFahren(int gefahrenerKm){
        this.kmZustand += gefahrenerKm;
        System.out.println("Aktueller Kilometerstand des Fahrzeugs " + this.kmZustand);
    }

    public double derPreis(double neuerPreis){
        return this.preis = neuerPreis;
    }

}
