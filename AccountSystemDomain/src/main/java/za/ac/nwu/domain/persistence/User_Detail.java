package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "USER_DETAIL")
public class User_Detail implements Serializable {


    @Id
    @Column(name = "NUMBER")
    private Number number;

    @Column(name = "USER_ID_NUMBER")
    private String user_id_number;

    @Column(name = "USER_LAST_NAME")
    private String user_last_name;

    @Column(name = "USER_FIRST_NAME")
    private String user_first_name;

    @Column(name = "USER_MOBILE")
    private Number user_mobile;

    @Column(name = "USER_AGE")
    private Number user_age;

    @Column(name = "USER_GENDER")
    private String user_gender;

    @Column(name = "USER_STATUS")
    private String user_status;

    public User_Detail(Number number, String user_id_number, String user_last_name, String user_first_name, Number user_mobile, Number user_age, String user_gender, String user_status) {
        this.number = number;
        this.user_id_number = user_id_number;
        this.user_last_name = user_last_name;
        this.user_first_name = user_first_name;
        this.user_mobile = user_mobile;
        this.user_age = user_age;
        this.user_gender = user_gender;
        this.user_status = user_status;
    }

    public User_Detail() {

    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public String getUser_id_number() {
        return user_id_number;
    }

    public void setUser_id_number(String user_id_number) {
        this.user_id_number = user_id_number;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public Number getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(Number user_mobile) {
        this.user_mobile = user_mobile;
    }

    public Number getUser_age() {
        return user_age;
    }

    public void setUser_age(Number user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_Detail that = (User_Detail) o;
        return Objects.equals(number, that.number) && Objects.equals(user_id_number, that.user_id_number) && Objects.equals(user_last_name, that.user_last_name) && Objects.equals(user_first_name, that.user_first_name) && Objects.equals(user_mobile, that.user_mobile) && Objects.equals(user_age, that.user_age) && Objects.equals(user_gender, that.user_gender) && Objects.equals(user_status, that.user_status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, user_id_number, user_last_name, user_first_name, user_mobile, user_age, user_gender, user_status);
    }

    @Override
    public String toString() {
        return "User_Detail{" +
                "number=" + number +
                ", user_id_number='" + user_id_number + '\'' +
                ", user_last_name='" + user_last_name + '\'' +
                ", user_first_name='" + user_first_name + '\'' +
                ", user_mobile=" + user_mobile +
                ", user_age=" + user_age +
                ", user_gender='" + user_gender + '\'' +
                ", user_status='" + user_status + '\'' +
                '}';
    }
}
