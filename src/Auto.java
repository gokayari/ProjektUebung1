public class Auto {

    private String bauform;
    private String erstzulassung;
    private int kmZustand;
    private double preis;
    private int anzahlDerTüren;

    public Auto(String bauform,String erstzulassung, int kmZustand,
                double preis, int anzahlDerTüren){
        this.bauform = bauform;
        this.erstzulassung = erstzulassung;
        this.kmZustand = kmZustand;
        this.preis = preis;
        this.anzahlDerTüren = anzahlDerTüren;

    }

    public void autoFahren(int gefahrenerKm){
        this.kmZustand += gefahrenerKm;
        System.out.println("Aktueller Kilometerstand des Fahrzeugs " + this.kmZustand);
    }

    public double derPreis(double neuerPreis){
        return this.preis = neuerPreis;
    }

}
