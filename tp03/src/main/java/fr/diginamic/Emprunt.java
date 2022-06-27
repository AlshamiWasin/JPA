package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="emprunt")
public class Emprunt {

    @Id
    private Integer ID;

    @Column(name = "DATE8DEBUT", nullable = false)
    private Date dateDeubt;
    @Column(name = "DELAI", length = 10, nullable = false)
    private Integer delai;
    @Column(name = "DATE_FIN", nullable = false)
    private Date dateFin;
    @Column(name = "ID_CLIENT",length = 10, nullable = false)
    private Integer idClient;

    public Emprunt() {
    }


    public Emprunt(Integer ID, Date dateDeubt, Integer delai, Date dateFin, Integer idClient) {
        this.ID = ID;
        this.dateDeubt = dateDeubt;
        this.delai = delai;
        this.dateFin = dateFin;
        this.idClient = idClient;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getDateDeubt() {
        return dateDeubt;
    }

    public void setDateDeubt(Date dateDeubt) {
        this.dateDeubt = dateDeubt;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("ID=").append(ID);
        sb.append(", dateDeubt=").append(dateDeubt);
        sb.append(", delai=").append(delai);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", idClient=").append(idClient);
        sb.append('}');
        return sb.toString();
    }
}
