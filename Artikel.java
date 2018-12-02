
public class Artikel
{
   private int artikelnummer;
   private String name;
   private double preis; // nettopreis
   
   public Artikel(int nummer, String name_, double preis_)
   {
       artikelnummer = nummer;
       name = name_;
       preis = preis_;
    }
   
   public String getName()
   {
       return name;
    }
    
    public double bruttopreisGeben()
    {
        return preis * 1.19;    // 19% Mehrwertsteuer
    }
}
