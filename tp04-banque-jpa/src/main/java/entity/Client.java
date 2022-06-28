package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @Column(name = "DATE_NAISSANCE", length = 30, nullable = false)
    private LocalDate dateNAissance;

    @Embedded
    private Adresse adresse;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="Banque_ID")
    private Banque banque;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable( name="client_compte",  joinColumns= @JoinColumn(name="Client_ID", referencedColumnName= "ID"), inverseJoinColumns= @JoinColumn(name="comptes_numero", referencedColumnName=  "numero"))
    private List<Compte> comptes;


    public Client() {
    }

    public Client(String nom, String prenom, LocalDate dateNAissance, Adresse adresse, List<Compte> comptes, Banque banque) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNAissance = dateNAissance;
        this.adresse = adresse;
        this.comptes = comptes;
        this.banque = banque;
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

    public LocalDate getDateNAissance() {
        return dateNAissance;
    }

    public void setDateNAissance(LocalDate dateNAissance) {
        this.dateNAissance = dateNAissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("ID=").append(ID);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", dateNAissance=").append(dateNAissance);
        sb.append(", adresse=").append(adresse);
        sb.append(", banque=").append(banque);
        sb.append('}');
        return sb.toString();
    }
}
