package capstoneWabedi.entities;

import javax.persistence.*;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "stats")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
