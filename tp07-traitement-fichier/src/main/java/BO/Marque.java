package BO;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Marque {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer ID;
    @Column
    private String nom;


    @OneToMany()
    private List<Produit> produit;

    public Marque() {
    }

    public Marque(String nom) {
        this.nom = nom;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Marque{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
