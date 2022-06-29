package BO;

import java.util.List;

public class Produit {

    private Categorie categorie;
    private Marque marque;
    private String nom;
    private String score;
    private List<Ingredient> ingredients;
    private String energie100g;
    private String graisse100g;
    private String sucres100g;
    private String fibres100g;
    private String proteines100g;
    private String sel100g;
    private String vitA100g;
    private String vitD100g;
    private String vitE100g;
    private String vitK100g;
    private String vitC100g;
    private String vitB1100g;
    private String vitB2100g;
    private String vitPP100g;
    private String vitB6100g;
    private String vitB9100g;
    private String vitB12100g;
    private String calcium100g;
    private String magnesium100g;
    private String iron100g;
    private String fer100g;
    private String betaCarotene100g;
    private String presenceHuilePalme;
    private List<Allergene> allergenes;
    private List<Additif> additifs;

    public Produit() {
    }

    public Produit(Categorie categorie, Marque marque, String nom, String score, List<Ingredient> ingredients, String energie100g, String graisse100g, String sucres100g, String fibres100g, String proteines100g, String sel100g, String vitA100g, String vitD100g, String vitE100g, String vitK100g, String vitC100g, String vitB1100g, String vitB2100g, String vitPP100g, String vitB6100g, String vitB9100g, String vitB12100g, String calcium100g, String magnesium100g, String iron100g, String fer100g, String betaCarotene100g, String presenceHuilePalme, List<Allergene> allergenes, List<Additif> additifs) {
        this.categorie = categorie;
        this.marque = marque;
        this.nom = nom;
        this.score = score;
        this.ingredients = ingredients;
        this.energie100g = energie100g;
        this.graisse100g = graisse100g;
        this.sucres100g = sucres100g;
        this.fibres100g = fibres100g;
        this.proteines100g = proteines100g;
        this.sel100g = sel100g;
        this.vitA100g = vitA100g;
        this.vitD100g = vitD100g;
        this.vitE100g = vitE100g;
        this.vitK100g = vitK100g;
        this.vitC100g = vitC100g;
        this.vitB1100g = vitB1100g;
        this.vitB2100g = vitB2100g;
        this.vitPP100g = vitPP100g;
        this.vitB6100g = vitB6100g;
        this.vitB9100g = vitB9100g;
        this.vitB12100g = vitB12100g;
        this.calcium100g = calcium100g;
        this.magnesium100g = magnesium100g;
        this.iron100g = iron100g;
        this.fer100g = fer100g;
        this.betaCarotene100g = betaCarotene100g;
        this.presenceHuilePalme = presenceHuilePalme;
        this.allergenes = allergenes;
        this.additifs = additifs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produit{");
        sb.append("categorie=").append(categorie);
        sb.append(", marque=").append(marque);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", score='").append(score).append('\'');
        sb.append(", ingredients=").append(ingredients);
        sb.append(", energie100g='").append(energie100g).append('\'');
        sb.append(", graisse100g='").append(graisse100g).append('\'');
        sb.append(", sucres100g='").append(sucres100g).append('\'');
        sb.append(", fibres100g='").append(fibres100g).append('\'');
        sb.append(", proteines100g='").append(proteines100g).append('\'');
        sb.append(", sel100g='").append(sel100g).append('\'');
        sb.append(", vitA100g='").append(vitA100g).append('\'');
        sb.append(", vitD100g='").append(vitD100g).append('\'');
        sb.append(", vitE100g='").append(vitE100g).append('\'');
        sb.append(", vitK100g='").append(vitK100g).append('\'');
        sb.append(", vitC100g='").append(vitC100g).append('\'');
        sb.append(", vitB1100g='").append(vitB1100g).append('\'');
        sb.append(", vitB2100g='").append(vitB2100g).append('\'');
        sb.append(", vitPP100g='").append(vitPP100g).append('\'');
        sb.append(", vitB6100g='").append(vitB6100g).append('\'');
        sb.append(", vitB9100g='").append(vitB9100g).append('\'');
        sb.append(", vitB12100g='").append(vitB12100g).append('\'');
        sb.append(", calcium100g='").append(calcium100g).append('\'');
        sb.append(", magnesium100g='").append(magnesium100g).append('\'');
        sb.append(", iron100g='").append(iron100g).append('\'');
        sb.append(", fer100g='").append(fer100g).append('\'');
        sb.append(", betaCarotene100g='").append(betaCarotene100g).append('\'');
        sb.append(", presenceHuilePalme='").append(presenceHuilePalme).append('\'');
        sb.append(", allergenes=").append(allergenes);
        sb.append(", additifs=").append(additifs);
        sb.append('}');
        return sb.toString();
    }
}
