package problema5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fata {

    private Latura [] fata ;
    private int [] laturi;
    String nume;

    public Fata()
    {
        nume="1";
    }

    public Fata(int nrLat,Latura[] laturi,int[] lat,String nume)
    {
        this.nume=nume;
        int c=1;
        this.laturi = lat;
        fata = new Latura[nrLat+1];
        for (int i = 1; i < lat.length ; i++) {
            fata[c]=laturi[lat[i]];
            c++;

            
        }
        

    }

    public String getNume()
    {
        return nume;
    }


    
}
