package fr.univamu.iut.exo2;

public class Radiateur implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe le radiateur avec " + gadget);
    }
}
