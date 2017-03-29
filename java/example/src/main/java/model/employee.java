package model;

import org.springframework.context.annotation.Scope;

import java.io.Serializable;

/**
 * Created by pmtu on 3/29/2017.
 */
@Scope("prototype")
public class employee implements Serializable {
    private String name;
    private String address;

    public employee() {
    }

    public employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

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
}
