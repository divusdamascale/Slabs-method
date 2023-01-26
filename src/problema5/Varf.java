
package problema5;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dutud
 */
public class Varf implements Comparable<Varf> {
    private int x;
    private int y;
    private String nume;
    private int pondere;
    private ArrayList <Dcel> ai;
    private ArrayList <Dcel> bi;

    


    public Varf(int x,int y,String nume)
    {
        this.x=x;
        this.y=y;
        this.nume = nume;
        this.pondere=1;
        ai = new ArrayList<Dcel>();
        bi = new ArrayList<Dcel>();  
    }

   
    public void addAi(Dcel x)
    {
        ai.add(x);
    }

    public void addBi(Dcel x)
    {
        bi.add(x);
    }

    public void afiseazaArr(ArrayList<Dcel> x)
    {
        Dcel y;
        for (int i = 0; i <x.size() ; i++) {
            y=x.get(i);
            System.out.print(y.getNume()+" "); 
        }
    }

    public ArrayList<Dcel> getAi() {
        return ai;
    }


    public ArrayList<Dcel> getBi() {
        return bi;
    }

    public ArrayList <Dcel> laturiLesp(ArrayList <Dcel> lesp)
    {
        ArrayList <Dcel> rez;
        int i;
        if(ai.isEmpty()&&y<3)
        {
            
            rez =(ArrayList <Dcel>) bi.clone();
            rez.removeAll(ai);
            rez.addAll(lesp);
            lesp=(ArrayList <Dcel>) rez.clone();
            // lesp.addAll(bi);
        }else if(ai.isEmpty()&&y>3)
        {
            lesp.addAll(bi);
        }
        else
        {
            i=lesp.indexOf(ai.get(0));
            if(i==-1)
            {
            rez =(ArrayList <Dcel>) bi.clone();
            rez.removeAll(ai);
            rez.addAll(lesp);
            lesp=(ArrayList <Dcel>) rez.clone();
            rez.clear();
            
            }else if(i > lesp.size()-2)
            {
            lesp.removeAll(ai);
            lesp.addAll(bi);
            }else 
            {
                lesp.removeAll(ai);
                lesp.addAll(i,bi); 
            }
            
            
        }
        return lesp;
        

    }

    

    public void ordoneazaAi(ArrayList <Dcel> x)
    {
        if(x.size()<=1)
        {
            return;
        }
        for (int i = 0; i < x.size()-1; i++) {
            for (int j = 1; j < x.size(); j++) {
                if(calcDet(x.get(i).getInceput().getX(), x.get(i).getInceput().getY(), this.x, this.y, x.get(j).getInceput().getX(), x.get(j).getInceput().getY())>0)
                {
                    Collections.swap(x, i, j);;
                }
                
            }
            
        }
    }

    public void ordoneazaBi(ArrayList <Dcel> x)
    {
        if(x.size()<=1)
        {
            return;
        }
        for (int i = 0; i < x.size()-1; i++) {
            for (int j = 1; j < x.size(); j++) {
                if(calcDet(x.get(i).getSfarsit().getX(), x.get(i).getSfarsit().getY(), this.x, this.y, x.get(j).getSfarsit().getX(), x.get(j).getSfarsit().getY())<0)
                {
                    Collections.swap(x, i, j);
                    
                }
                
            }
            
        }
    }



    public int calcDet(int x1, int y1, int x2, int y2, int x3, int y3){
		return x1*y2+x2*y3+x3*y1-y2*x3-y3*x1-y1*x2;
	}


    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String getNume()
    {
        return nume;
    }
     public int getPondere()
     {
        return pondere;
     }

     public void setPondere(int x)
     {
        this.pondere = x;
     }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override

    public int compareTo(Varf y)
    {
        if(this.getY()<y.getY())
        {
            return -1;
        }
        return 1;
    }


}
