package BO;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq1")
    @GenericGenerator(name = "seq1", strategy = "increment")
    private int ID;
    @Column(length = 1000)
    private String nom;

    public Ingredient() {
    }

    public Ingredient( String nom) {
        this.nom = nom;
    }

    @ManyToMany(mappedBy="ingredients")
    private List<Produit> produits = new ArrayList<>();


    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduit() {
        return produits;
    }

    public void setProduit(List<Produit> produit) {
        this.produits = produit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
