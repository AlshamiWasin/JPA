package fr.diginamic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer ID;

    @Column(name = "NOM", length = 30, nullable = false)
    private String nom;
    @Column(name = "PRENOM", length = 30, nullable = false)
    private String prenom;

    @Column
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST} , fetch = FetchType.EAGER)
    private Set<Emprunt> emprunts;



    public Client() {
    }

    public Client(Integer ID, String nom, String prenom) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("ID=").append(ID);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
