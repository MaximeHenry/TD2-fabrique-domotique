package fr.univamu.iut.exo3;

public class AppliDomotique {
    public static void main(String[] args) {
        ImprimanteLocale imprimanteLocale = new ImprimanteLocale();
        imprimanteLocale.imprimer();

        ImprimanteReseau imprimanteReseau = new ImprimanteReseau();
        imprimanteReseau.imprimer();

        Scanner scannerLocal = new Scanner(imprimanteLocale);
        scannerLocal.imprimer();

        Scanner scannerReseau = new Scanner(imprimanteReseau);
        scannerReseau.imprimer();

        Fax faxLocal = new Fax(imprimanteLocale);
        faxLocal.imprimer();

        Fax faxReseau = new Fax(imprimanteReseau);
        faxReseau.imprimer();

        Photocopieur photocopieurLocal = new Photocopieur(imprimanteLocale);
        photocopieurLocal.imprimer();

        Photocopieur photocopieurReseau = new Photocopieur(imprimanteReseau);
        photocopieurReseau.imprimer();

    }
}
