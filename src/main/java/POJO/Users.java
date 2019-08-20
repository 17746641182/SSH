package POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "USERS")
public class Users {
    @Id
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "telePhone")
    private String telePhone;

    @Column(name = "isAdmin")
    private String isAdmin;


    public Users() {
    }


    public Users(int id, String userName, String password, String name, String telePhone, String isAdmin) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.telePhone = telePhone;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telePhone='" + telePhone + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                '}';
    }
}
