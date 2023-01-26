package problema5;

public class Algoritm2 {

    private Pslg p = new Pslg();

    public Algoritm2(Varf m)
    {
        //pasul1 sortare varfuri de sus in jos terminat

        int c=0;
        for (int i = 1; i < p.getVarf().length; i++) {
            if(m.getX()==p.getVarf()[i].getX() && m.getY()==p.getVarf()[i].getY())
            {
                c=1;
                JOptionPane.showMessageDialog(null, "Ati selectat Varful " + p.getVarf()[i].getNume());
                break;
            }
        }

        Arrays.sort(p.getVarf());
        for (int i = 0; i < p.getVarf().length; i++) {
            p.getVarf()[i].setNume(Integer.toString(i));
        }
        // pasul2 sortare muchii Terminat
        for (int i = 0; i < p.getLaturi().length; i++) {
            if(p.getLaturi()[i].getInceput().getY()>p.getLaturi()[i].getSfarsit().getY())
            {
                Varf xv = p.getLaturi()[i].getInceput();
                p.getLaturi()[i].setInceput(p.getLaturi()[i].getSfarsit());
                p.getLaturi()[i].setSfarsit(xv);
            }
            
        }

        for (int i = 1; i < p.getDcel().length; i++) {
            if(p.getDcel()[i].getInceput().getY()>p.getDcel()[i].getSfarsit().getY())
            {
                Varf x = p.getDcel()[i].getInceput();
                p.getDcel()[i].setInceput(p.getDcel()[i].getSfarsit());
                p.getDcel()[i].setSfarsit(x);

                Fata xf = p.getDcel()[i].getFDr();
                p.getDcel()[i].setDr(p.getDcel()[i].getFSt());
                p.getDcel()[i].setSt(xf);

                Latura xl = p.getDcel()[i].getP1();
                p.getDcel()[i].setP1(p.getDcel()[i].getP2());
                p.getDcel()[i].setP2(xl);
                
            }
        }

        //pasul3 terminat
        for (int i = 1; i < p.getDcel().length; i++) {
            p.getVarf()[Integer.parseInt(p.getDcel()[i].getInceput().getNume())].addBi(p.getDcel()[i]);
            p.getVarf()[Integer.parseInt(p.getDcel()[i].getSfarsit().getNume())].addAi(p.getDcel()[i]);  
        }

        for (int i = 1; i < p.getVarf().length; i++) {
            p.getVarf()[i].ordoneazaAi(p.getVarf()[i].getAi()); 
            p.getVarf()[i].ordoneazaBi(p.getVarf()[i].getBi()); 
        }
        
    }

    
    
    
}
