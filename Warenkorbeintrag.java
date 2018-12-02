
public class Warenkorbeintrag
{
    private Artikel a;
    private int anzahl;

    public Warenkorbeintrag(Artikel a_, int anzahl_)
    {
        anzahl = anzahl_;
        a = a_;
    }

    public void infosDrucken()
    {
        System.out.println("Artikel: " + a.getName() );
        System.out.println("Anzahl: " + anzahl);
    }
}
