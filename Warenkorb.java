
public class Warenkorb
{
    private Listenelement erster;

    public Warenkorb()
    {
        erster = new Abschluss();
    }

    public void einfuegen(Artikel a, int anzahl)
    {
        erster = erster.hintenEinfuegen(a,anzahl);        
    }

    public void listenDatenAusgeben()
    {
        System.out.println("________________________");
        System.out.println("Im Warenkorb: ");
        erster.listenDatenAusgeben();
        System.out.println("________________________");
    }

  


}
