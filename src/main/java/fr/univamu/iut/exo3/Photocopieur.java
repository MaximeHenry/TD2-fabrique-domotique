package fr.univamu.iut.exo3;

public class Photocopieur extends Décorateur {

    public Photocopieur(Imprimante imprimante){decorateur = imprimante;}

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Photocopieur est activée\n");
    }
}
