package fr.univamu.iut.exo2;

public class Cafetiere implements Connectable{
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la cafetière avec " + gadget);
    }
}
