package fr.univamu.iut.exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
    static Fabrique fab;
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static String menu() {
        String choix = new String();
        System.out.println("Taper 0 pour finir, 1 pour connecter une cafetière et 2 pour une radio");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = in.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return choix;
    }

    public static void connecter(String type) {
        try{
            Connectable c = fab.fabriquer(type);
            objets.add(c);
        }
        catch(ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch (ClassCastException e){
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String type = "";
        while ((type = menu()) != "") {
            connecter(type);
        }
        System.out.println(objets);
    }
}
