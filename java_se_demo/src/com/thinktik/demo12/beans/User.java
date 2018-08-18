package com.thinktik.demo12.beans;

public class User {
    private Long userId;
    private String userName;
    private Integer age;
    
    public User() {
    }
    
    public User(Long userId, String userName, Integer age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
