public class Main {
    public static void main(String[] args) {

        Limousine limousine = new Limousine("BMW","2016", 35000,
                20000, 4);
        System.out.println("Dieses "+limousine.getAnzahlDerTüren()+"-türige Fahrzeug der Marke "
                +limousine.getMarke()+" ist ein/e "+limousine.getBauform()+
                " und wurde "+limousine.getErstzulassung()+
                " erstmals zugelassen, der aktuelle Kilometerstand beträgt "
                +limousine.getKmZustand()+ " km und der Preis beträgt "
                        +limousine.getPreis()+" Euro.");

        limousine.autoFahren(5000);
        limousine.derPreis(18000);

        System.out.println("Dieses "+limousine.getAnzahlDerTüren()+"-türige Fahrzeug der Marke "
                +limousine.getMarke()+" ist ein/e "+limousine.getBauform()+
                " und wurde "+limousine.getErstzulassung()+
                " erstmals zugelassen, der aktuelle Kilometerstand beträgt "
                +limousine.getKmZustand()+ " km und der Preis beträgt "
                +limousine.getPreis()+" Euro.");

        System.out.println("-------------");

        Kombi kombi = new Kombi("Audi", "2019", 45000,
                24000, 5);
        System.out.println("Dieses "+kombi.getAnzahlDerTüren()+"-türige Fahrzeug der Marke "
                +kombi.getMarke()+" ist ein/e "+kombi.getBauform()+
                " und wurde "+kombi.getErstzulassung()+
                " erstmals zugelassen, der aktuelle Kilometerstand beträgt "
                +kombi.getKmZustand()+ " km und der Preis beträgt "
                +kombi.getPreis()+" Euro.");

        kombi.autoFahren(15000);
        kombi.derPreis(22000);

        System.out.println("Dieses "+kombi.getAnzahlDerTüren()+"-türige Fahrzeug der Marke "
                +kombi.getMarke()+" ist ein/e "+kombi.getBauform()+
                " und wurde "+kombi.getErstzulassung()+
                " erstmals zugelassen, der aktuelle Kilometerstand beträgt "
                +kombi.getKmZustand()+ " km und der Preis beträgt "
                +kombi.getPreis()+" Euro.");
    }
}
