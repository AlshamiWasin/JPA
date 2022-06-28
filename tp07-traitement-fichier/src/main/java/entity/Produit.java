package entity;

import java.util.List;

public class Produit {

    private Categorie categorie;
    private Marque marque;
    private scoreNutritionnel score;
    private List<String> donneesNutritionnel;
    private List<Ingredient> ingredients;
    private List<Additif> additifs;
    private List<Allergene> allergenes;


    public Produit() {
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public scoreNutritionnel getScore() {
        return score;
    }

    public void setScore(scoreNutritionnel score) {
        this.score = score;
    }

    public List<String> getDonneesNutritionnel() {
        return donneesNutritionnel;
    }

    public void setDonneesNutritionnel(List<String> donneesNutritionnel) {
        this.donneesNutritionnel = donneesNutritionnel;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }



}
