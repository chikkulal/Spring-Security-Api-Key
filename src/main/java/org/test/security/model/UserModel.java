package org.test.security.model;

import javax.persistence.*;

@Entity
public class UserModel {

    @Id
    String testId;

    @Column(name="security_key")
    private String key;

    @Column(name="user_name")
    private String name;

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
