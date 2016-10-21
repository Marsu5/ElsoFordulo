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
    private int maxsz = 1;
    private int minsz = 1;
    private int maxm = 3;
    private int minm = 1;
    private Vector<Integer> SorozatElemek = new Vector<Integer>();
    private Vector Fuggveny = new Vector();
    
    private void generalas(){
        int mdb=vel(minm,maxm);
        kezdoertek = vel(1,9);
        Fuggveny.add(kezdoertek);
        szamok.add(0);
        for (int i = 0; i < mdb; i++) {
            /*int b=vel(1,3);
            if (muveletek.get(i) == Muvelet.kivonas){
                int a=szamok.get(i)-szamok.get(1);
                szamok.set(0, a);
            }*/
            int szdb = vel(minsz, maxsz);
            int sz = 0;
            for (int j = 0; j<szdb; j++){
                sz += vel(1*(int)Math.pow(10, j), 9*(int)Math.pow(10, j));
            }
            szamok.add(sz);


            switch (vel(1,3))
            {
                case 1: muveletek.add(Muvelet.szorzas); Fuggveny.add("*"); break;
                case 2: muveletek.add(Muvelet.kivonas); Fuggveny.add("-");break;
                case 3: muveletek.add(Muvelet.osszeadas); Fuggveny.add("+"); break;
            }
            Fuggveny.add(sz);
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
        /*int elso = szamit(kezdoertek);
        int masodik = szamit(elso);
        int harmadik = szamit(masodik);
        System.out.println(elso);
        System.out.println(masodik);
        System.out.println(harmadik);
*/
       //szamit(szamit(szamit(66)));
        for(int i = 0; i<5; i++)
        {
            System.out.println(getSorozatElem(i));
            SorozatElemek.add(getSorozatElem(i));

        }
        System.out.println(Fuggveny);
    }
    
    public int getSorozatElem(int elemszam)
    {

        if (elemszam == 0)
        {
            return kezdoertek;
        }
        else
        {
            int k = kezdoertek;
            for(int i = 0; i<elemszam; i++)
            {
                k = szamit(k);
            }
            return k;
        }
    }
    public void setMaxsz(int n){
        this.maxsz= n;
    }
    public void setMaxm(int n){
        this.maxm = n;
    }
    public Vector getSorozatElemek(){
        return SorozatElemek;
    }
    public Vector getFuggveny(){
        return Fuggveny;
    }
    public void setMinsz(int n){
        this.minsz = n;
    }
    public void setMinm(int n){
        this.minm = n;
    }
    
    public static void main(String[] args) {
        new Generator();

    }

}
