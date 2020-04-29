package org.academiadecodigo.ramsters.hackathon.persistence.model;


import javax.persistence.*;

@Entity
@Table(name = "beach")
public class Beach extends AbstractModel {

    private String name;

    @Id
    private String address;
    private String img;
    private String status;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
