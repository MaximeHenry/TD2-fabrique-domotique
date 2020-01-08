package fr.univamu.iut.exo4;

import java.util.ArrayList;

public class Demarreur {
    ArrayList<Connectable> actives;
    public void demarrerLesActives(){
        for (Connectable c: actives
             ) {
            System.out.println("Je démarre " + actives.toString());
        }
    }
    public void attacher(Connectable connectable){
        actives.add(connectable);
    }
    public void detacher(){

    }
}
