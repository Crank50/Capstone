package capstoneWabedi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "admin")
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

   private boolean accountType;
}
