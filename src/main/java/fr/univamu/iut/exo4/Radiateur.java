package fr.univamu.iut.exo4;

public class Radiateur implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe le radiateur avec " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("On allume le radiateur");
    }
}
