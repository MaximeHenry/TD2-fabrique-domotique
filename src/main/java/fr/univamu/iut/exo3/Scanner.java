package fr.univamu.iut.exo3;

public class Scanner extends Décorateur {

    public Scanner(Imprimante imprimante) {
        decorateur = imprimante;
    }

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Scanner est activée\n");
    }
}