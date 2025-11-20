package com.polytech.tp;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    @SuppressWarnings("unused")
    private String date;
    @SuppressWarnings("unused")
    private String heureDebut;
    @SuppressWarnings("unused")
    private boolean estOptionnel;
    @SuppressWarnings("unused")
    private String niveau;
    @SuppressWarnings("unused")
    private boolean necessiteProjecteur;

    
    public Cours(String matiere, String enseignant, String salle, String date, 
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5; 
    }
    
    
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
}