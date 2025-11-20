package com.polytech.tp;

public class Cours {
    private String nom;
    private int duree;

    public Cours(String nom, int duree) {
        this.nom = nom;
        this.duree = duree;
    }

    public Cours(String matiere, String enseignant, String salle, String date, String heureDebut, boolean estOptionnel,
            String niveau, boolean necessiteProjecteur) {
        //TODO Auto-generated constructor stub
    }

    public String getNom() {
        return nom;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return nom + " (" + duree + "h)";
    }

    public Object getEnseignant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEnseignant'");
    }

    public Object getMatiere() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMatiere'");
    }
}
