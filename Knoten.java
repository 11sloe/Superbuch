
public class Knoten extends Listenelement
{
    private Warenkorbeintrag inhalt;
    private Listenelement naechster;

    public Knoten(Artikel a, int anzahl)
    {
        inhalt = new Warenkorbeintrag(a,anzahl);
    }

    public Listenelement hintenEinfuegen(Artikel a, int anzahl)
    {
        naechster = naechster.hintenEinfuegen(a,anzahl);
        return this;
    }

    public void listenDatenAusgeben()
    {
        inhalt.infosDrucken();
        naechster.listenDatenAusgeben();
    }

    public Listenelement getNaechster()
    {
        return naechster;
    }

    public void setNaechster(Listenelement k)
    {
        naechster = k;
    }
}
