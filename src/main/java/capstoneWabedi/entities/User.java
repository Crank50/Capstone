package capstoneWabedi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.Calendar;

/**
 * Created by Justin on 9/1/16.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long userId;

    public static enum STATES { ALABAMA,ALASKA,AMERICAN_SAMOA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,FLORIDA,GEORGIA,GUAM,HAWAII,IDAHO,ILLINOIS,INDIANA,IOWA,KANSAS,KENTUCKY,LOUSIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,NEBRASKA,NEVADA,NEW_HAMPSHIRE,NEW_JERSEY,NEW_MEXICO,NEW_YORK,NORTH_CAROLINA,NORTH_DAKOTA,OHIO,OKLAHOMA,OREGON,PENNSYLVANIA,PUERTO_RICO,RHODE_ISLAND,SOUTH_CAROLINA,SOUTH_DAKOTA,TENNESSEE,TEXAS,US_VIRGIN_ISLANDS,UTAH,VERMONT,VIRGINA,WASHINGTON,WEST_VIRGINA,WISCONSIN,WYOMOING,}

    private STATES states;
    private  String name;

        @Column(name="userName")
    private String userName;
    private String password;
    private String matchingPassword;

    private int enabled;
    private String email;
    private boolean emailVerified;
    private String city;
    private String zip;
    private String phone;
    private String ssn;
    private Calendar userSince;
    private String admin;

    @NotNull
    @Column(nullable = false)
    private long accountId;

    @NotNull
    @Column(nullable = false)
    private Timestamp created;

    private Timestamp deactivated;

    public User() {
    }

    public User(User user) {
        this.userId = user.userId;
        this.userName = user.userName;
        this.email = user.email;
        this.password = user.password;
        this.enabled = user.enabled;
        this.emailVerified = user.emailVerified;
        this.accountId = user.accountId;
        this.created = user.created;
        this.deactivated = user.deactivated;

    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(Timestamp deactivated) {
        this.deactivated = deactivated;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
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

