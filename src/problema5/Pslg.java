package problema5;

import java.util.Arrays;

public class Pslg {
    private Varf[] varfuri;
    private Latura[] laturi;
    private Fata[] fete;
    private Dcel[] dcel;
    private Lant[] lanturi;

    public Lant[] getLanturi() {
        return lanturi;
    }

    private Lespede[] lespezi;

    public Pslg()
    {
        //initializare
        lanturi = new Lant[11];
        lespezi = new Lespede[12];
        varfuri = new Varf[13];
        laturi = new Latura[20];
        fete = new Fata[10];
        dcel = new Dcel[20];
        //introducere varfuri ex.propriu
        varfuri[0]=new Varf(-10,-10,"null");
        varfuri[1]=new Varf(1, 3,"1");
        varfuri[2]=new Varf(5, 8,"2");
        varfuri[3]=new Varf(4, 2,"3");
        varfuri[4]=new Varf(6, -2,"4");
        varfuri[5]=new Varf(6, 10,"5");
        varfuri[6]=new Varf(10, 5,"6");
        varfuri[7]=new Varf(11, 11,"7");
        varfuri[8]=new Varf(12, -3,"8");
        varfuri[9]=new Varf(13, 4,"9");
        varfuri[10]=new Varf(17, 6,"10");
        varfuri[11]=new Varf(13, 7,"11");
        varfuri[12]=new Varf(16, 12,"12");
        
        //introducere laturi ex.propriu
        laturi[0]=new Latura(varfuri[0],varfuri[0],"null");
        laturi[1]=new Latura(varfuri[1],varfuri[2],"1");
        laturi[2]=new Latura(varfuri[1],varfuri[3],"2");
        laturi[3]=new Latura(varfuri[3],varfuri[2],"3");
        laturi[4]=new Latura(varfuri[3],varfuri[4],"4");
        laturi[5]=new Latura(varfuri[5],varfuri[4],"5");
        laturi[6]=new Latura(varfuri[5],varfuri[6],"6");
        laturi[7]=new Latura(varfuri[5],varfuri[7],"7");
        laturi[8]=new Latura(varfuri[6],varfuri[4],"8");
        laturi[9]=new Latura(varfuri[6],varfuri[8],"9");
        laturi[10]=new Latura(varfuri[6],varfuri[7],"10");
        laturi[11]=new Latura(varfuri[7],varfuri[11],"11");
        laturi[12]=new Latura(varfuri[7],varfuri[12],"12");
        laturi[13]=new Latura(varfuri[12],varfuri[11],"13");
        laturi[14]=new Latura(varfuri[12],varfuri[10],"14");
        laturi[15]=new Latura(varfuri[10],varfuri[11],"15");
        laturi[16]=new Latura(varfuri[10],varfuri[9],"16");
        laturi[17]=new Latura(varfuri[11],varfuri[9],"17");
        laturi[18]=new Latura(varfuri[8],varfuri[11],"18");
        laturi[19]=new Latura(varfuri[2],varfuri[5],"19");
        //introducere fete din ex.propriu
        fete[1] = new Fata();
        int[] x = {0,1,2,3};
        fete[2] = new Fata(3, laturi, x,"2");
        x=new int[]{0,3,4,5,19};
        fete[3] = new Fata(4,laturi,x,"3");
        x=new int[]{0,5,6,8};
        fete[4] = new Fata(3,laturi,x,"4");
        x=new int[]{0,6,10,7};
        fete[5] = new Fata(3,laturi,x,"5");
        x=new int[]{0,9,10,11,18};
        fete[6] = new Fata(4,laturi,x,"6");
        x=new int[]{0,11,13,12};
        fete[7] = new Fata(3,laturi,x,"7");
        x=new int[]{0,13,14,15};
        fete[8] = new Fata(3,laturi,x,"8");
        x=new int[]{0,15,16,17};
        fete[9] = new Fata(4,laturi,x,"9");
        //Introducere DCEL
        dcel[0] = new Dcel(varfuri[0],varfuri[0],fete[0],fete[0],laturi[0],laturi[0],"0");
        dcel[1] = new Dcel(varfuri[1],varfuri[2],fete[2],fete[1],laturi[2],laturi[3],"1");
        dcel[2] = new Dcel(varfuri[1],varfuri[3],fete[1],fete[2],laturi[1],laturi[4],"2");
        dcel[3] = new Dcel(varfuri[3],varfuri[2],fete[3],fete[2],laturi[2],laturi[19],"3");
        dcel[4] = new Dcel(varfuri[3],varfuri[4],fete[3],fete[2],laturi[3],laturi[8],"4");
        dcel[5] = new Dcel(varfuri[5],varfuri[4],fete[3],fete[4],laturi[6],laturi[4],"5");
        dcel[6] = new Dcel(varfuri[5],varfuri[6],fete[4],fete[5],laturi[7],laturi[8],"6");
        dcel[7] = new Dcel(varfuri[5],varfuri[7],fete[5],fete[1],laturi[19],laturi[10],"7");
        dcel[8] = new Dcel(varfuri[6],varfuri[4],fete[4],fete[1],laturi[9],laturi[5],"8");
        dcel[9] = new Dcel(varfuri[6],varfuri[8],fete[1],fete[6],laturi[10],laturi[18],"9");
        dcel[10] = new Dcel(varfuri[6],varfuri[7],fete[6],fete[5],laturi[6],laturi[11],"10");
        dcel[11] = new Dcel(varfuri[7],varfuri[11],fete[6],fete[7],laturi[12],laturi[18],"11");
        dcel[12] = new Dcel(varfuri[7],varfuri[12],fete[7],fete[7],laturi[1],laturi[13],"12");
        dcel[13] = new Dcel(varfuri[12],varfuri[11],fete[7],fete[8],laturi[14],laturi[11],"13");
        dcel[14] = new Dcel(varfuri[12],varfuri[10],fete[8],fete[1],laturi[12],laturi[15],"14");
        dcel[15] = new Dcel(varfuri[10],varfuri[11],fete[8],fete[9],laturi[16],laturi[13],"15");
        dcel[16] = new Dcel(varfuri[10],varfuri[9],fete[9],fete[1],laturi[14],laturi[17],"16");
        dcel[17] = new Dcel(varfuri[11],varfuri[9],fete[1],fete[9],laturi[15],laturi[16],"17");
        dcel[18] = new Dcel(varfuri[8],varfuri[11],fete[1],fete[6],laturi[9],laturi[17],"18");
        dcel[19] = new Dcel(varfuri[2],varfuri[5],fete[3],fete[1],laturi[1],laturi[5],"19");

        //introducere lanturi
        lanturi[0].addVarf(new Varf(-10,-10,"null"));
        lanturi[1].addVarf(varfuri[1]);
        lanturi[1].addVarf(varfuri[2]);
        lanturi[1].addVarf(varfuri[5]);
        lanturi[1].addVarf(varfuri[7]);
        lanturi[1].addVarf(varfuri[12]);
        lanturi[2].addVarf(varfuri[1]);
        lanturi[2].addVarf(varfuri[3]);
        lanturi[2].addVarf(varfuri[2]);
        lanturi[2].addVarf(varfuri[5]);
        lanturi[2].addVarf(varfuri[7]);
        lanturi[2].addVarf(varfuri[12]);
        lanturi[3].addVarf(varfuri[3]);
        lanturi[3].addVarf(varfuri[4]);
        lanturi[3].addVarf(varfuri[5]);
        lanturi[3].addVarf(varfuri[7]);
        lanturi[3].addVarf(varfuri[12]);
        lanturi[4].addVarf(varfuri[4]);
        lanturi[4].addVarf(varfuri[6]);
        lanturi[4].addVarf(varfuri[5]);
        lanturi[4].addVarf(varfuri[7]);
        lanturi[4].addVarf(varfuri[12]);
        lanturi[5].addVarf(varfuri[8]);
        lanturi[5].addVarf(varfuri[6]);
        lanturi[5].addVarf(varfuri[7]);
        lanturi[5].addVarf(varfuri[12]);
        lanturi[6].addVarf(varfuri[8]);
        lanturi[6].addVarf(varfuri[9]);
        lanturi[6].addVarf(varfuri[11]);
        lanturi[6].addVarf(varfuri[7]);
        lanturi[6].addVarf(varfuri[12]);
        lanturi[7].addVarf(varfuri[9]);
        lanturi[7].addVarf(varfuri[10]);
        lanturi[7].addVarf(varfuri[12]);
        lanturi[8].addVarf(varfuri[9]);
        lanturi[8].addVarf(varfuri[10]);
        lanturi[8].addVarf(varfuri[11]);
        lanturi[8].addVarf(varfuri[12]);
        lanturi[9].addVarf(varfuri[10]);
        lanturi[9].addVarf(varfuri[12]);

    }

    public Lespede[] getLespezi() {     
        return lespezi;
    }

    public Latura[] getLaturi()
    {
        return laturi;
    }

    public int[] getVx()
    {
        int [] x = new int[12];
        for (int i = 0; i < x.length; i++) {
            {
                x[i]=varfuri[i].getX();
            }
        }
        return x;
    }

    public int[] getVy()
    {
        int [] y = new int[12];
        for (int i = 0; i < y.length; i++) {
            {
                y[i]=varfuri[i].getY();
            }
        }
        return y;
    }

    public Varf[] getVarf()
    {
        return varfuri;
    }

    public Dcel[] getDcel() {
        return dcel;
    }
    public  void setLespezi(Lespede[] lespezi)
    {
        this.lespezi=lespezi;
    }

    public String toString()
    {
        StringBuffer x = new StringBuffer();
        x.append("PSLG\n\n");
        x.append("V={ ");
        for (int i = 1; i < varfuri.length; i++) {
            if(i==varfuri.length-1)
            {
                x.append(varfuri[i].getNume());
                x.append(" }");
                break;
            }
            x.append(varfuri[i].getNume());
            x.append(", ");
            
        }

        x.append("\n\n");
        x.append("E={ ");
        for (int i = 1; i < laturi.length; i++) {
            if(i==laturi.length-1)
            {
                x.append(laturi[i].getNume());
                x.append(" }");
                break;
            }
            x.append(laturi[i].getNume());
            x.append(", ");
            
        }

        x.append("\n\n");

        x.append("F={ ");
        for (int i = 1; i < fete.length; i++) {
            if(i==fete.length-1)
            {
                x.append(fete[i].getNume());
                x.append(" }");
                break;
            }
            x.append(fete[i].getNume());
            x.append(", ");
            
        }

        x.append("\n\n");

        x.append("DCEL\n\n");
        x.append("Latura V1 V2 F1 F2 P1 P2\n");
        
            for (int j = 1; j < dcel.length; j++) {
                    x.append(dcel[j].toString());
                    x.append("\n");
                
            }
        

        return x.toString();

    }


    
}
