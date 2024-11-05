public class Wohnung
{
    private String ort;
    private String strasse;
    private boolean balkon;
    private boolean gefordert;
    private int preis;
    private int anzZimmer;
    
public Wohnung(String ort, String strasse,boolean balkon, boolean gefordert, int preis, int anzZimmer)
{
    setOrt(ort);
    setStrasse(strasse);
    setBalkon(balkon);
    setGefordert(gefordert);
    setPreis(preis);
    setAnzZimmer(anzZimmer);
}

public Wohnung(String ort, boolean balkon, boolean gefordert, int preis, int anzZimmer)
{
    setOrt(ort);
    setBalkon(balkon);
    setGefordert(gefordert);
    setPreis(preis);
    setAnzZimmer(anzZimmer);
}

public Wohnung(String ort, boolean balkon, int preis)
{
    setOrt(ort);
    setBalkon(balkon);
    setGefordert(true);
    setPreis(preis);
    setAnzZimmer(4);
}

public Wohnung(String ort, boolean balkon)
{
    setOrt(ort);
    setBalkon(balkon);
    setGefordert(true);
    setPreis(200000);
    setAnzZimmer(4);
}

public Wohnung(String ort, int preis, boolean gefordert)
{
    setOrt(ort);
    setBalkon(true);
    setGefordert(gefordert);
    setPreis(preis);
    setAnzZimmer(4);
}

public Wohnung(String ort)
{
    setOrt(ort);
    setBalkon(true);
    setGefordert(false);
    setPreis(200000);
    setAnzZimmer(4);
}

public Wohnung()
{
    setOrt("Wien");
    setStrasse("Spengergasse 10/5/3A");
    setBalkon(true);
    setGefordert(false);
    setPreis(200000);
    setAnzZimmer(4);
}
    
public void setOrt(String ort)
{
    this.ort = ort;
}

public void setStrasse(String strasse)
{
    this.strasse = strasse;
}

public void setBalkon(boolean balkon)
{
    this.balkon = balkon;
}

public void setGefordert(boolean gefordert)
{
    this.gefordert = gefordert;
}

public void setPreis(int preis)
{
    this.preis = preis;
}

public void setAnzZimmer(int anzZimmer)
{
    if ((anzZimmer >=1) && (anzZimmer <=7))
    {
        this.anzZimmer = anzZimmer;
    }
    else
    {
        System.out.println("Error!1&7");
        this.anzZimmer = 4;
    }
}
    
public String getOrt()
{
    return ort;
}

public String getStrasse()
{
    return strasse;
}

public boolean getBalkon()
{
    return balkon;
}

public boolean getGefordert()
{
    return gefordert;
}

public int getPreis()
{
    return preis;
}

public int getAnzZimmer()
{
    return anzZimmer;
}

public String getHausnummer()
{
    int pos1;
    int pos2;
    String hausnummer;
    
    pos1 = strasse.indexOf(" ");
    pos2 = strasse.indexOf("/");
    hausnummer = strasse.substring(pos1,pos2);
    
    return hausnummer;
}

public String getStock()
{
    int pos1;
    int pos2;
    String stock;
    
    pos1 = strasse.indexOf("/")+1;
    pos2 = strasse.indexOf("/",pos1);
    stock = strasse.substring(pos1,pos2);
    
    return stock;
}

public void printWohnung()
{
    if (balkon == true)
    {
        System.out.println(ort + " - " + anzZimmer + " Zimmer " + " - " + preis + " Euro " + "(Balkon)");
    }
    else 
    {
        System.out.println(ort + " - " + anzZimmer + " Zimmer " + " - " + preis + " Euro " + "(kein Balkon)");
    }
}

}
