package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer ID;

    @Column(name = "DATE_OPERATION", nullable = false)
    private LocalDate date;

    @Column(name = "MONTANT", length = 30, nullable = false)
    private Double montant;

    @Column(name = "MOTIF", length = 30, nullable = false)
    private String motif;

    @ManyToOne()
    @JoinColumn(name = "numero")
    private Compte compte;

    public Operation() {
    }

    public Operation(LocalDate date, Double montant, String motif) {
        this.ID = ID;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operation{");
        sb.append("ID=").append(ID);
        sb.append(", date=").append(date);
        sb.append(", montant=").append(montant);
        sb.append(", motif='").append(motif).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
