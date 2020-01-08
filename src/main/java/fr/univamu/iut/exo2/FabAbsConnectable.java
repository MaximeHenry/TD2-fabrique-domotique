package fr.univamu.iut.exo2;

public abstract class FabAbsConnectable {
    public abstract Connectable creer (String s) throws ClassNotFoundException, ClassCastException;

    public abstract void equiper(Connectable c);

    public Connectable fabriquer(String s) throws ClassNotFoundException, ClassCastException{
        Connectable c = creer(s);
        equiper(c);
        return c;
    }
}
