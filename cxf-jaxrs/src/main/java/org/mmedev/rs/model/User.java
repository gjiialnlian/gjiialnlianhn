package org.mmedev.rs.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1098765421L;
	private String id;
    private String name;
    
    public User() {
	}
    
    public User(String id, String name) {
		this.id=id;
		this.name=name;
	}

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
