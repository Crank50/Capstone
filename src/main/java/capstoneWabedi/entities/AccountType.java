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
    public static enum TYPE {SYSTEM_ADMIN,ACCOUNT_ADMIN}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String password;

   private boolean accountType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
