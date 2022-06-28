package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="virement")
public class Virement extends Operation{

    @Column(name = "BENEFICIARE", length = 50,nullable = false)
    private String beneficiare;

    public Virement() {
    }

    public String getBeneficiare() {
        return beneficiare;
    }

    public void setBeneficiare(String beneficiare) {
        this.beneficiare = beneficiare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Virement{");

        sb.append(", ID=").append(getID());
        sb.append(", date=").append(getDate());
        sb.append(", montant=").append(getMontant());
        sb.append(", motif='").append(getMotif()).append('\'');
        sb.append("beneficiare='").append(beneficiare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
