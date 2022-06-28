package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="assuranceVie")
public class AssuranceVie extends Compte{

    @Column(name = "DATE_FIN", nullable = false)
    private LocalDate dateFin;

    @Column(name = "TAUX_ASSURANCE", length = 30, nullable = false)
    private double taux;


    public AssuranceVie() {
    }

    public AssuranceVie(String numero, Double solde, List<Client> clients, List<Operation> operations, LocalDate dateFin, double taux) {
        super(numero, solde, clients, operations);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie(Double solde, List<Client> clients, List<Operation> operations, LocalDate dateFin, double taux) {
        super(solde, clients, operations);
        this.dateFin = dateFin;
        this.taux = taux;
    }




    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AssuranceVie{");
        sb.append("dateFin=").append(dateFin);
        sb.append(", taux=").append(taux);
        sb.append('}');
        return sb.toString();
    }
}
