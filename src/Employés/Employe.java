package Employés;

public class Employe {

    //Attributs
    private String nom;
    private String prenom;
    private float salaire;

    //constructeur
    public Employe(String nom, String prenom, float salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    //getters & setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    //Méthodes
}
