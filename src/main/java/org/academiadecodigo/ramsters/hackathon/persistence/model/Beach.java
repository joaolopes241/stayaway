package org.academiadecodigo.ramsters.hackathon.persistence.model;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "beach")
public class Beach extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String address;
    private String img;
    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


/*    @ManyToMany(
            mappedBy = "favorites",
            fetch = FetchType.LAZY
    )
    private List<User> users;

    public void addUser(User user) {
        users.add(user);
    }*/

    public String getUrlImg() {
        return img;
    }

    public void setUrlImg(String urlImg) {
        this.img = urlImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

/*    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
