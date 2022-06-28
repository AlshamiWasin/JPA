package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

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

}
