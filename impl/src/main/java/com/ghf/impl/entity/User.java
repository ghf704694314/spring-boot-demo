package ghf.impl.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ghf.demo.entity
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/14
 */
@Entity
@Table(name = "user")
public class User{

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
