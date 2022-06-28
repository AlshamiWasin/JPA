package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="livretA")
public class LivretA extends Compte{

    @Column(name = "TAUX", length = 30, nullable = false)
    private Double taux;

}
