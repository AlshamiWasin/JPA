package fr.diginamic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="livre")
public class Livre {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
    @GenericGenerator(name = "seq", strategy = "increment")
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
