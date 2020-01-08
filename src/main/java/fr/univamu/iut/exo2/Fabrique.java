package fr.univamu.iut.exo2;

public class Fabrique extends FabAbsConnectable{
    @Override
    public Connectable creer(String type) throws ClassNotFoundException {
        switch (type){
            case ("cafetiere"):
                return new Cafetiere();
            case ("radio"):
                return new Radio();
            case ("radiateur"):
                return new Radiateur();
            default:
                throw new ClassNotFoundException("");
        }

    }

    @Override
    public void equiper(Connectable c) {
        c.equiper("gadgets");
    }
}
