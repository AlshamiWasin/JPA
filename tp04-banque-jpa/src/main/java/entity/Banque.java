package entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="banque")
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer Banque_ID;

    @Column(name = "NOM", nullable = false)
    private String nom;

    @OneToMany
    private List<Client> clients;

    public Banque() {
    }

    public Banque(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    public Integer getID() {
        return Banque_ID;
    }

    public void setID(Integer ID) {
        this.Banque_ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getBanque_ID() {
        return Banque_ID;
    }

    public void setBanque_ID(Integer banque_ID) {
        Banque_ID = banque_ID;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banque{");
        sb.append("ID=").append(Banque_ID);
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
