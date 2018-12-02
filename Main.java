
public class Main
{
    public static void main(String[] args)
    {
        Warenkorb warenkorb = new Warenkorb();
        
        Artikel b1 = new Artikel(1,"Max und Moritz", 7.99);
        Artikel b2 = new Artikel(2, "Die fromme Helene", 3.99);
        
        warenkorb.einfuegen(b1,2);
        warenkorb.einfuegen(b2,4);
       
        warenkorb.listenDatenAusgeben();

        
    }    
}
