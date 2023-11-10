package Produit;

public class Produit {
    //Attributs
    private String nom;
    private float prix;

    //constructeur
    Produit(String nom, float prix){
        this.nom = nom;
        this.prix = prix;
    }

    //getters & setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    //Méthodes
    //....
}
