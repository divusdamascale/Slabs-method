package problema5;

import java.util.ArrayList;

public class Lespede {

    private int y1;
    private int y2;
    private ArrayList <Dcel> laturi;




    public void setLaturi(ArrayList<Dcel> laturi) {
        this.laturi = laturi;
    }





    public Lespede(int y1,int y2)
    {
        this.y1=y1;
        this.y2=y2;
        laturi = new ArrayList<Dcel>();

    }

    

    

    public ArrayList<Dcel> getLaturi() {
        return laturi;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    
}
