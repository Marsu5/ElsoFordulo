package hu.tokingame.elso;

import java.util.Vector;

public class Generator {
    
    enum Muvelet
    {
       szorzas, kivonas, osszeadas
    }

    private int vel(int a, int b) {return (int)(Math.random()*(b-a+1)+a);}

    private Vector<Integer> szamok = new Vector<Integer>();
    private Vector<Muvelet> muveletek = new Vector<Muvelet>();
    private int kezdoertek=0;

    
    private void generalas(){
        int mdb=vel(1,3);
        kezdoertek = vel(1,9);
        szamok.add(0);
        for (int i = 0; i < mdb; i++) {
            /*int b=vel(1,3);
            if (muveletek.get(i) == Muvelet.kivonas){
                int a=szamok.get(i)-szamok.get(1);
                szamok.set(0, a);
            }*/
            szamok.add(vel(1,9));
            switch (vel(1,3))
            {
                case 1: muveletek.add(Muvelet.szorzas); break;
                case 2: muveletek.add(Muvelet.kivonas); break;
                case 3: muveletek.add(Muvelet.osszeadas); break;
            }
        }
    }
    
    
    private int szamit(int kezdoertek)
    {
        Vector<Muvelet> ujmuveletek = (Vector<Muvelet>)muveletek.clone();
        Vector<Integer> ujszamok = (Vector<Integer>)szamok.clone();
        ujszamok.set(0,kezdoertek);
        teszt(ujmuveletek, ujszamok);
        int i = 0;
        while (i<ujmuveletek.size())
        {
            if (ujmuveletek.get(i)==Muvelet.szorzas)
            {
                ujszamok.set(i, ujszamok.get(i)*ujszamok.get(i+1));
                ujszamok.remove(i+1);
                ujmuveletek.remove(i);
            }
            else
            {
                i++;
            }
        }
        i = 0;
        while (i<ujmuveletek.size())
        {
            if (ujmuveletek.get(i)==Muvelet.osszeadas)
            {
                ujszamok.set(i, ujszamok.get(i) + ujszamok.get(i+1));
            }
            if (ujmuveletek.get(i)==Muvelet.kivonas)
            {
                ujszamok.set(i, ujszamok.get(i) - ujszamok.get(i+1));
            }
            ujszamok.remove(i+1);
            ujmuveletek.remove(i);
        }
        return ujszamok.get(0);
    }
    
    private void teszt(Vector<Muvelet> ujmuvelet, Vector<Integer> ujszam )
    {
        System.out.print(ujszam.get(0));
        for(int i=1; i<ujszam.size(); i++)
        {
            System.out.print(" " + ujmuvelet.get(i-1) + " " + ujszam.get(i));
        }
        System.out.println("");
    }
    
    Generator(){
        generalas();
        int elso = szamit(kezdoertek);
        int masodik = szamit(elso);
        int harmadik = szamit(masodik);
        System.out.println(elso);
        System.out.println(masodik);
        System.out.println(harmadik);

       //szamit(szamit(szamit(66)));
    }
    
    public int getSorozatElem(int elemszam)
    {
        return 0;
    }
    
    public static void main(String[] args) {
        new Generator();
    }

}
