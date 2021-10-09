package za.ac.nwu.domain.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "DISCOVERY_ACCOUNT")
public class Discovery_Account implements Serializable {

    @Id
    @Column(name = "USER_ID")
    private Number user_id;

    @Column(name = "ACCOUNT_TYPE")
    private String account_type;

    @Column(name = "USER_POINTS")
    private Number user_points;

    @Column(name = "USER_LEVEL")
    private String user_level;

    public Discovery_Account(Number user_id, String account_type, Number user_points, String user_level) {
        this.user_id = user_id;
        this.account_type = account_type;
        this.user_points = user_points;
        this.user_level = user_level;
    }

    public Discovery_Account() {

    }

    public Number getUser_id() {
        return user_id;
    }

    public void setUser_id(Number user_id) {
        this.user_id = user_id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Number getUser_points() {
        return user_points;
    }

    public void setUser_points(Number user_points) {
        this.user_points = user_points;
    }

    public String getUser_level() {
        return user_level;
    }

    public void setUser_level(String user_level) {
        this.user_level = user_level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discovery_Account that = (Discovery_Account) o;
        return Objects.equals(user_id, that.user_id) && Objects.equals(account_type, that.account_type) && Objects.equals(user_points, that.user_points) && Objects.equals(user_level, that.user_level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, account_type, user_points, user_level);
    }

    @Override
    public String toString() {
        return "Discovery_Account{" +
                "user_id=" + user_id +
                ", account_type='" + account_type + '\'' +
                ", user_points=" + user_points +
                ", user_level='" + user_level + '\'' +
                '}';
    }
}
