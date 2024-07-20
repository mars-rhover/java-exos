package org.example.parcAutomobile;

import java.util.List;

public class parc {
}
abstract class Vehicule{
    String marque;
    String modele;
    int annee;
    int kilometrage;

    Vehicule(String marque, String modele, int annee, int kilometrage){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
        this.kilometrage=kilometrage;
    }
    abstract void afficherDetails();
    public void rouler(int km){
        kilometrage+=km;
    }
}

class Voiture extends Vehicule{
    private int nombreDePortes;
    Voiture(String marque, String modele, int annee, int kilometrage, int nombreDePortes) {
        super(marque, modele, annee, kilometrage);
        this.nombreDePortes=nombreDePortes;

    }

    @Override
    void afficherDetails() {
        System.out.println("Voiture - Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee + ", Kilométrage: " + kilometrage + ", Portes: " + nombreDePortes);
    }
}
class Camion extends Vehicule{
    private int capaciteDeChargement; //tonnes
    Camion(String marque, String modele, int annee, int kilometrage, int capaciteDeChargement) {
        super(marque, modele, annee, kilometrage);
        this.capaciteDeChargement=capaciteDeChargement;

    }

    @Override
    void afficherDetails() {
        System.out.println("Camion - Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee + ", Kilométrage: " + kilometrage + ", Capacité de chargement: " + capaciteDeChargement);
    }
}
class Moto extends Vehicule{
    private String typeDeMoto; //tonnes
    Moto(String marque, String modele, int annee, int kilometrage, String typeDeMoto) {
        super(marque, modele, annee, kilometrage);
        this.typeDeMoto=typeDeMoto;

    }

    @Override
    void afficherDetails() {
        System.out.println("Moto - Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee + ", Kilométrage: " + kilometrage + ", Type de Moto: " + typeDeMoto);
    }
}
class GestionParc{
    private List<Vehicule> vehicules; //tonnes
    public void ajouterVehicule(Vehicule v){
        vehicules.add(v);
    }
    public void afficherParc(){
        vehicules.forEach(System.out::println);
    }

}