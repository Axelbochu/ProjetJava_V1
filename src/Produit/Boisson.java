package Produit;

public class Boisson extends Produit{
    //Attributs
    private boolean glacon;

    //Constructeur
    Boisson(String nom, float prix, boolean glacon){
        super(nom, prix);
        this.glacon = glacon;
    }

    //Getters & Setters
    public void setGlacon(boolean glacon) {
        this.glacon = glacon;
    }

    public boolean isGlacon() {
        return glacon;
    }
}
