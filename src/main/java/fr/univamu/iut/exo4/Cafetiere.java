package fr.univamu.iut.exo4;

public class Cafetiere implements Connectable{
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la cafetière avec " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("On allume la cafetiere");
    }
}
