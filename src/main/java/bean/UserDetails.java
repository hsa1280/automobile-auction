package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by shian_mac on 7/27/15.
 */
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int ID;
    private String userName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
