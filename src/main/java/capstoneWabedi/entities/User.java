package capstoneWabedi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "userz")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public static enum STATES { ALABAMA,ALASKA,AMERICAN_SAMOA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,FLORIDA,GEORGIA,GUAM,HAWAII,IDAHO,ILLINOIS,INDIANA,IOWA,KANSAS,KENTUCKY,LOUSIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,NEBRASKA,NEVADA,NEW_HAMPSHIRE,NEW_JERSEY,NEW_MEXICO,NEW_YORK,NORTH_CAROLINA,NORTH_DAKOTA,OHIO,OKLAHOMA,OREGON,PENNSYLVANIA,PUERTO_RICO,RHODE_ISLAND,SOUTH_CAROLINA,SOUTH_DAKOTA,TENNESSEE,TEXAS,US_VIRGIN_ISLANDS,UTAH,VERMONT,VIRGINA,WASHINGTON,WEST_VIRGINA,WISCONSIN,WYOMOING,}

    private STATES states;
    private  String name;

        @Column(name="username")
    private String userName;
    private String password;
    private String matchingPassword;

    private int enabled;
    private String email;
    private String city;
    private String zip;
    private String phone;
    private String ssn;
    private Calendar userSince;
    private String admin;

    public User() {
    }

    public User(User user) {
        this.id = user.id;
        this.userName = user.userName;
        this.email = user.email;
        this.password = user.password;
        this.enabled=user.enabled;
    }


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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Calendar getUserSince() {
        return userSince;
    }

    public void setUserSince(Calendar userSince) {
        this.userSince = userSince;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }



}

