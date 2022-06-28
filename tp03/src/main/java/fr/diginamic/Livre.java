package fr.diginamic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

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
    @ManyToMany(mappedBy = "livres")
    private List<Emprunt> emprunts;

    public Livre() {
    }

    public Livre(Integer ID, String titre, String auteur, List<Emprunt> emprunts) {
        this.ID = ID;
        this.titre = titre;
        this.auteur = auteur;
        this.emprunts = emprunts;
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
