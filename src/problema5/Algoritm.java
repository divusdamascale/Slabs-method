package problema5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Algoritm {
    Pslg p = new Pslg();

    private int calcDetPL(Varf m, Dcel x)
    {
       return p.getVarf()[0].calcDet(m.getX(), m.getY(), x.getInceput().getX(), x.getInceput().getY(), x.getSfarsit().getX(), x.getSfarsit().getY());

    }

    



    public Algoritm(Varf m) {
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
        
        //Pt fiecare varf vi formez 2 multimi 
        //TO DO: Creeaza multimile ai si bi dupa care le ordonez
        // ai  = laturile care intra in vi => in dcel ce latura are ca v2 vi
        // bi = laturile care ies din vi => in dcel ce latura are ca v1 vi
        //TO DO: override la clasa DCEL dupa x al punctelor de sfarsit pt ai si bi
        //creeaza lespezile gandeste-te cum cu ArrayList
        
        //pasul3 terminat
        for (int i = 1; i < p.getDcel().length; i++) {
            p.getVarf()[Integer.parseInt(p.getDcel()[i].getInceput().getNume())].addBi(p.getDcel()[i]);
            p.getVarf()[Integer.parseInt(p.getDcel()[i].getSfarsit().getNume())].addAi(p.getDcel()[i]);  
        }

        for (int i = 1; i < p.getVarf().length; i++) {
            p.getVarf()[i].ordoneazaAi(p.getVarf()[i].getAi()); 
            p.getVarf()[i].ordoneazaBi(p.getVarf()[i].getBi()); 
        }
        //sunt create ai si bi ordonate cum se cuvine

        // for (int i = 1; i < p.getVarf().length; i++) {
        //     System.out.print("A"+i+":");
        //     p.getVarf()[i].afiseazaArr(p.getVarf()[i].getAi());
        //     System.out.println();
        //     System.out.print("B"+i+":");
        //     p.getVarf()[i].afiseazaArr(p.getVarf()[i].getBi());
        //     System.out.println();
        //     System.out.println();

            
        // }

            
        //pasul4
        //to do: creeaza lespezile
        //adauga le y pt fiecare varf si trebuie sa fie nrv-1 lespezi
        //poti sa folosesti in arraylist .remove(index) .addAll(colectie{ai to bi},index de unde incepe)

        for (int i = 1; i < p.getVarf().length-1 ; i++) {
            p.getLespezi()[i]=new Lespede(p.getVarf()[i].getY(), p.getVarf()[i+1].getY());
        }

        
        p.getLespezi()[1].setLaturi(p.getVarf()[1].getBi());
        ArrayList <Dcel> x =(ArrayList <Dcel>) p.getLespezi()[1].getLaturi().clone();

        for (int i = 2; i < p.getLespezi().length; i++) {
            p.getLespezi()[i].setLaturi(p.getVarf()[i].laturiLesp(x));
            x=(ArrayList <Dcel>) p.getLespezi()[i].getLaturi().clone();
        }

       

        for (int i = 1; i < p.getLespezi().length; i++) {
            System.out.print("Lesp"+i+":");
            for (int j = 0; j < p.getLespezi()[i].getLaturi().size(); j++) {
                System.out.print(p.getLespezi()[i].getLaturi().get(j).getNume()+ " ");
            }
            System.out.println(p.getVarf()[i].getNume()+"-"+p.getVarf()[i+1].getNume());
            System.out.println();
        }

        //cautam punctul M pe inaltime
            int lesp=0;
        for (int i = 1; i < p.getLespezi().length; i++) {
            if(m.getY()>=p.getLespezi()[i].getY1() && m.getY()<p.getLespezi()[i].getY2())
            {
            // JOptionPane.showMessageDialog(null,"Lespedea" + i);
            lesp = i;
            break;
            }

        }

        if (lesp==0)
        {
            JOptionPane.showMessageDialog(null, "Exterior, Fata 1");
        }

        
            
        
        //cautam m pe latime
        
        for (int i = 0; i < p.getLespezi()[lesp].getLaturi().size()-1; i++) {
            {
                for (int j = 1; j < p.getLespezi()[lesp].getLaturi().size(); j++) {
                    if(calcDetPL(m, p.getLespezi()[lesp].getLaturi().get(i))<0 && calcDetPL(m, p.getLespezi()[lesp].getLaturi().get(j))>0)
                    {
                        if(p.getLespezi()[lesp].getLaturi().get(i).getFDr().equals(p.getLespezi()[lesp].getLaturi().get(j).getFSt()))
                        {
                            c=1;
                            JOptionPane.showMessageDialog(null, "Punctul m se afla in lespedea "+ lesp + " Intre laturile " + p.getLespezi()[lesp].getLaturi().get(i).getNume() + " si " + p.getLespezi()[lesp].getLaturi().get(j).getNume() + " In fata " + p.getLespezi()[lesp].getLaturi().get(i).getFDr().getNume());
                            break;
                        }
                    }else if(calcDetPL(m, p.getLespezi()[lesp].getLaturi().get(j))==0)
                    {
                        c=1;
                        JOptionPane.showMessageDialog(null, "Punctul m se afla in lespedea "+ lesp + " pe latura " + p.getLespezi()[lesp].getLaturi().get(j).getNume() );
                        break;
                    }
                    
                }
            }
             
        }

        
        
            if(c==0)
            {
                JOptionPane.showMessageDialog(null, "Punctul m se afla in lespedea "+ lesp + " in Fata1 ,in afara PSLG-ului " );

            }
        

        
        
      
       
    
        


    }
   
}

    


