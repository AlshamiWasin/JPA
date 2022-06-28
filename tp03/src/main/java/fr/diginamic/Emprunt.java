package fr.diginamic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer ID;
    @Column(name = "DATE_DEBUT", nullable = false)
    private LocalDate dateDeubt;
    @Column(name = "DELAI", length = 10, nullable = false)
    private Integer delai;
    @Column(name = "DATE_FIN", nullable = false)
    private LocalDate dateFin;
    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name = "COMPO",joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName="ID"),inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName = "ID"))
    private List<Livre> livres;


    public Emprunt() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public Emprunt(Integer ID, LocalDate dateDeubt, Integer delai, LocalDate dateFin, Client idClient) {
        this.ID = ID;
        this.dateDeubt = dateDeubt;
        this.delai = delai;
        this.dateFin = dateFin;
        this.client = idClient;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDate getDateDeubt() {
        return dateDeubt;
    }

    public void setDateDeubt(LocalDate dateDeubt) {
        this.dateDeubt = dateDeubt;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Client getIdClient() {
        return client;
    }

    public void setIdClient(Client client) {
        this.client = client;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("ID=").append(ID);
        sb.append(", dateDeubt=").append(dateDeubt);
        sb.append(", delai=").append(delai);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", idClient=").append(client);
        sb.append('}');
        return sb.toString();
    }
}
