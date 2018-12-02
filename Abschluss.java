
public class Abschluss extends Listenelement
{
    public void listenDatenAusgeben()
    {
    }

    public Listenelement hintenEinfuegen(Artikel a, int anzahl)
    {
        Knoten k = new Knoten(a,anzahl);
        k.setNaechster(this);
        return k;
    }
}
