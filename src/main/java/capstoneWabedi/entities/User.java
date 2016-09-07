package capstoneWabedi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public static enum STATES { ALABAMA,ALASKA,AMERICAN_SAMOA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,FLORIDA,GEORGIA,GUAM,HAWAII,IDAHO,ILLINOIS,INDIANA,IOWA,KANSAS,KENTUCKY,LOUSIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,NEBRASKA,NEVADA,NEW_HAMPSHIRE,NEW_JERSEY,NEW_MEXICO,NEW_YORK,NORTH_CAROLINA,NORTH_DAKOTA,OHIO,OKLAHOMA,OREGON,PENNSYLVANIA,PUERTO_RICO,RHODE_ISLAND,SOUTH_CAROLINA,_SOUTH_DAKOTA,TENNESSEE,TEXAS,US_VIRGIN_ISLANDS,UTAH,VERMONT,VIRGINA,WASHINGTON,WEST_VIRGINA,WISCONSIN,WYOMOING,}

    private STATES states;

    String name;
    String email;
    String city;
    String zip;
    long phone;
    long ssn;
    Calendar userSince;
    boolean admin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public STATES getStates() {
        return states;
    }

    public void setStates(STATES states) {
        this.states = states;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Calendar getUserSince() {
        return userSince;
    }

    public void setUserSince(Calendar userSince) {
        this.userSince = userSince;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
