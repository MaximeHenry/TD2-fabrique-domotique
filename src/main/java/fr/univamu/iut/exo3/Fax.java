package fr.univamu.iut.exo3;

public class Fax extends Décorateur {

    public Fax(Imprimante imprimante){decorateur = imprimante;}

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Fax est activée\n");
    }
}
