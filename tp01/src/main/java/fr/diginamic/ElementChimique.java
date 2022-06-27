package fr.diginamic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="elements_Chimiques")
public class ElementChimique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
    private Integer elId;
    @Column(name = "elNom", length = 30, nullable = false, unique = true)
    private String elNom;
    @Column(name = "elSymbole", length = 30, nullable = false)
    private String elSymbole;
    @Column(name = "elNumAtomique", length = 30, nullable = false)
    private Integer elNumAtomique;
    @Column(name = "elMasseAtomique", length = 30, nullable = false)
    private double elMasseAtomique;


    public ElementChimique() {
    }

    public ElementChimique(String elNom, String elSymbole, Integer elNumAtomique, double elMasseAtomique) {
        this.elNom = elNom;
        this.elSymbole = elSymbole;
        this.elNumAtomique = elNumAtomique;
        this.elMasseAtomique = elMasseAtomique;
    }

    public ElementChimique(Integer elId, String elNom, String elSymbole, Integer elNumAtomique, double elMasseAtomique) {
        this.elId = elId;
        this.elNom = elNom;
        this.elSymbole = elSymbole;
        this.elNumAtomique = elNumAtomique;
        this.elMasseAtomique = elMasseAtomique;
    }

    public long getElId() {
        return elId;
    }

    public void setElId(Integer elId) {
        this.elId = elId;
    }

    public String getElNom() {
        return elNom;
    }

    public void setElNom(String elNom) {
        this.elNom = elNom;
    }

    public String getElSymbole() {
        return elSymbole;
    }

    public void setElSymbole(String elSymbole) {
        this.elSymbole = elSymbole;
    }

    public Integer getElNumAtomique() {
        return elNumAtomique;
    }

    public void setElNumAtomique(Integer elNumAtomique) {
        this.elNumAtomique = elNumAtomique;
    }

    public double getElMasseAtomique() {
        return elMasseAtomique;
    }

    public void setElMasseAtomique(double elMasseAtomique) {
        this.elMasseAtomique = elMasseAtomique;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ElementChimique{");
        sb.append("elId=").append(elId);
        sb.append(", elNom='").append(elNom).append('\'');
        sb.append(", elSymbole='").append(elSymbole).append('\'');
        sb.append(", elNumAtomique=").append(elNumAtomique);
        sb.append(", elMasseAtomique=").append(elMasseAtomique);
        sb.append('}');
        return sb.toString();
    }
}
