package org.academiadecodigo.ramsters.hackathon.persistence.model;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "beach")
public class Beach extends AbstractModel {

    private String name;

    @Id
    private String address;

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


    @ManyToMany(
            mappedBy = "favorites",
            fetch = FetchType.LAZY
    )
    private List<User> users;

    public void addUser(User user) {
        users.add(user);
    }
}
