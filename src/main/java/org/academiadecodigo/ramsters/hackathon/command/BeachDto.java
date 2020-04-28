package org.academiadecodigo.ramsters.hackathon.command;

public class BeachDto {

    private String name;
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

    public String getUrlImg() {
        return img;
    }

    public void setUrlImg(String urlImg) {
        this.img = urlImg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
