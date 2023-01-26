package problema5;
public class Latura {
    private Varf inceput;
    private Varf sfarsit;
    private String nume;
    
    public void setInceput(Varf inceput) {
        this.inceput = inceput;
    }

    public void setSfarsit(Varf sfarsit) {
        this.sfarsit = sfarsit;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Latura(Varf i,Varf s,String nume)
    {
        inceput = i;
        sfarsit = s;
        this.nume = nume;
    }

    public Varf getInceput()
    {
        return inceput;
    }

    public Varf getSfarsit()
    {
        return sfarsit;
    }

    public String getNume()
    {
        return nume;
    }
    

    
}
