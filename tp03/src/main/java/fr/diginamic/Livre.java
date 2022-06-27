package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {


    @Id
    private Integer ID;

    @Column(name = "Titre", length = 30, nullable = false)
    private String titre;
    @Column(name = "AUTEUR", length = 30, nullable = false)
    private String auteur;

    public Livre() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livre{");
        sb.append("ID=").append(ID);
        sb.append(", titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
