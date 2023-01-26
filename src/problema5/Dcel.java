package problema5;
public class Dcel{
    private Varf inceput;
    private Varf sfarsit;
    private Fata dr;
    private Fata st;
    private Latura p1;
    private Latura p2;
    private String nume;

    public Dcel(Varf in,Varf sf,Fata dr,Fata st,Latura p1,Latura p2,String nume)
    {
        inceput=in;
        sfarsit=sf;
        this.dr=dr;
        this.st=st;
        this.p1=p1;
        this.p2=p2;
        this.nume = nume;
    }
    
    public void setInceput(Varf in)
    {
        inceput=in;
    }
    public void setSfarsit(Varf sf)
    {
        sfarsit=sf;
    }

    public Varf getInceput()
    {
        return inceput;
    }

    public Varf getSfarsit()
    {
        return sfarsit;
    }

    public Fata getFDr()
    {
        return dr;
    }

    public Fata getFSt()
    {
        return st;
    }

    public Latura getP1()
    {
        return p1;
    }

    public Latura getP2()
    {
        return p2;
    }

    public String toString()
    {
        StringBuffer x= new StringBuffer();
        x.append("   ");
        x.append(nume);
        x.append("   ");
        x.append(inceput.getNume());
        x.append("  ");
        x.append(sfarsit.getNume());
        x.append("  ");
        x.append(dr.getNume());
        x.append("  ");
        x.append(st.getNume());
        x.append("  ");
        x.append(p1.getNume());
        x.append("  ");
        x.append(p2.getNume());

        return x.toString();
    }

    public String getNume() {
        return nume;
    }

    public void setDr(Fata dr) {
        this.dr = dr;
    }

    public void setSt(Fata st) {
        this.st = st;
    }

    public void setP1(Latura p1) {
        this.p1 = p1;
    }

    public void setP2(Latura p2) {
        this.p2 = p2;
    }
}
