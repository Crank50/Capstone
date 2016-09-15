package capstoneWabedi.entities;

import javax.persistence.*;

/**
 * Created by Justin on 9/13/16.
 */

@Entity
@Table(name="user_roles")
public class UserRole {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_role_id")
    private Long userRoleId;

    @Column(name="userId")
    private Long userId;

    @Column(name="role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
