package problema5;

import java.util.*;

public class Ordonare2 {


    public void ordLaturi(Dcel[] laturi)
    {
        for (int i = 1; i < laturi.length; i++) {
            if(laturi[i].getInceput().getY()>laturi[i].getSfarsit().getY())
            {
                Varf x = laturi[i].getInceput();
                laturi[i].setInceput(laturi[i].getSfarsit());
                laturi[i].setSfarsit(x);

                Fata x1= laturi[i].getFDr();
                laturi[i].setDr(laturi[i].getFSt());
                laturi[i].setSt(x1);

                Latura x2= laturi[i].getP1();
                laturi[i].setP1(laturi[i].getP2());
                laturi[i].setP2(x2);

            }


        }
    }

}
