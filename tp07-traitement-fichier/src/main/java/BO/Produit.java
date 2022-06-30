package BO;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer ID;
    @ManyToOne()
    private Categorie categorie;
    @ManyToOne()
    private Marque marque;

    @Column
    private String nom;
    @Column
    private String score;

    @ManyToMany()
    @JoinTable( name="Produit_Ingre",  joinColumns= @JoinColumn(name="id_Ingre", referencedColumnName= "ID"), inverseJoinColumns= @JoinColumn(name="id_Produit", referencedColumnName=  "ID"))
    private List<Ingredient> ingredients;
    @Column
    private String energie100g;
    @Column
    private String graisse100g;
    @Column
    private String sucres100g;
    @Column
    private String fibres100g;
    @Column
    private String proteines100g;
    @Column
    private String sel100g;
    @Column
    private String vitA100g;
    @Column
    private String vitD100g;
    @Column
    private String vitE100g;
    @Column
    private String vitK100g;
    @Column
    private String vitC100g;
    @Column
    private String vitB1100g;
    @Column
    private String vitB2100g;
    @Column
    private String vitPP100g;
    @Column
    private String vitB6100g;
    @Column
    private String vitB9100g;
    @Column
    private String vitB12100g;
    @Column
    private String calcium100g;
    @Column
    private String magnesium100g;
    @Column
    private String iron100g;
    @Column
    private String fer100g;
    @Column
    private String betaCarotene100g;
    @Column
    private String presenceHuilePalme;

    @ManyToMany()
    @JoinTable( name="produit_allergene",  joinColumns= @JoinColumn(name="PRODUIT_ID", referencedColumnName= "ID"), inverseJoinColumns= @JoinColumn(name="ALLERGENE_ID", referencedColumnName=  "ID"))
    private List<Allergene> allergenes;
    @ManyToMany()
    @JoinTable( name="produit_additifs",  joinColumns= @JoinColumn(name="PRODUIT_ID", referencedColumnName= "ID"), inverseJoinColumns= @JoinColumn(name="ADDITIF_ID", referencedColumnName=  "code"))
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


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getEnergie100g() {
        return energie100g;
    }

    public void setEnergie100g(String energie100g) {
        this.energie100g = energie100g;
    }

    public String getGraisse100g() {
        return graisse100g;
    }

    public void setGraisse100g(String graisse100g) {
        this.graisse100g = graisse100g;
    }

    public String getSucres100g() {
        return sucres100g;
    }

    public void setSucres100g(String sucres100g) {
        this.sucres100g = sucres100g;
    }

    public String getFibres100g() {
        return fibres100g;
    }

    public void setFibres100g(String fibres100g) {
        this.fibres100g = fibres100g;
    }

    public String getProteines100g() {
        return proteines100g;
    }

    public void setProteines100g(String proteines100g) {
        this.proteines100g = proteines100g;
    }

    public String getSel100g() {
        return sel100g;
    }

    public void setSel100g(String sel100g) {
        this.sel100g = sel100g;
    }

    public String getVitA100g() {
        return vitA100g;
    }

    public void setVitA100g(String vitA100g) {
        this.vitA100g = vitA100g;
    }

    public String getVitD100g() {
        return vitD100g;
    }

    public void setVitD100g(String vitD100g) {
        this.vitD100g = vitD100g;
    }

    public String getVitE100g() {
        return vitE100g;
    }

    public void setVitE100g(String vitE100g) {
        this.vitE100g = vitE100g;
    }

    public String getVitK100g() {
        return vitK100g;
    }

    public void setVitK100g(String vitK100g) {
        this.vitK100g = vitK100g;
    }

    public String getVitC100g() {
        return vitC100g;
    }

    public void setVitC100g(String vitC100g) {
        this.vitC100g = vitC100g;
    }

    public String getVitB1100g() {
        return vitB1100g;
    }

    public void setVitB1100g(String vitB1100g) {
        this.vitB1100g = vitB1100g;
    }

    public String getVitB2100g() {
        return vitB2100g;
    }

    public void setVitB2100g(String vitB2100g) {
        this.vitB2100g = vitB2100g;
    }

    public String getVitPP100g() {
        return vitPP100g;
    }

    public void setVitPP100g(String vitPP100g) {
        this.vitPP100g = vitPP100g;
    }

    public String getVitB6100g() {
        return vitB6100g;
    }

    public void setVitB6100g(String vitB6100g) {
        this.vitB6100g = vitB6100g;
    }

    public String getVitB9100g() {
        return vitB9100g;
    }

    public void setVitB9100g(String vitB9100g) {
        this.vitB9100g = vitB9100g;
    }

    public String getVitB12100g() {
        return vitB12100g;
    }

    public void setVitB12100g(String vitB12100g) {
        this.vitB12100g = vitB12100g;
    }

    public String getCalcium100g() {
        return calcium100g;
    }

    public void setCalcium100g(String calcium100g) {
        this.calcium100g = calcium100g;
    }

    public String getMagnesium100g() {
        return magnesium100g;
    }

    public void setMagnesium100g(String magnesium100g) {
        this.magnesium100g = magnesium100g;
    }

    public String getIron100g() {
        return iron100g;
    }

    public void setIron100g(String iron100g) {
        this.iron100g = iron100g;
    }

    public String getFer100g() {
        return fer100g;
    }

    public void setFer100g(String fer100g) {
        this.fer100g = fer100g;
    }

    public String getBetaCarotene100g() {
        return betaCarotene100g;
    }

    public void setBetaCarotene100g(String betaCarotene100g) {
        this.betaCarotene100g = betaCarotene100g;
    }

    public String getPresenceHuilePalme() {
        return presenceHuilePalme;
    }

    public void setPresenceHuilePalme(String presenceHuilePalme) {
        this.presenceHuilePalme = presenceHuilePalme;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
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
