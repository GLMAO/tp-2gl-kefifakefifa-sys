package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps {
    private List<Cours> listeCours = new ArrayList<>();

    // Ajouter un cours
    public void ajouterCours(Cours c) {
        listeCours.add(c);
        System.out.println("Nouveau cours ajouté : " + c);
    }

    // Afficher l'emploi du temps
    public void afficherEmploiDuTemps() {
        System.out.println("=== Emploi du Temps ===");
        if (listeCours.isEmpty()) {
            System.out.println("Aucun cours pour l'instant.");
        } else {
            for (Cours c : listeCours) {
                System.out.println("- " + c);
            }
        }
    }

    // Supprimer un cours par nom (optionnel)
    public void supprimerCours(String nom) {
        listeCours.removeIf(c -> c.getNom().equalsIgnoreCase(nom));
        System.out.println("Cours supprimé : " + nom);
    }
}
