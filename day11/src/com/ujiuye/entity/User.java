package com.ujiuye.entity;


public class User {

  private long id;
  private String username;
  private String password;
  private String sex;
  private String hobby;
  private String work;
  private String sdesc;

  public User(String username, String password, String sex, String hobby, String work, String sdesc) {
    this.username = username;
    this.password = password;
    this.sex = sex;
    this.hobby = hobby;
    this.work = work;
    this.sdesc = sdesc;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }


  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }


  public String getSdesc() {
    return sdesc;
  }

  public void setSdesc(String sdesc) {
    this.sdesc = sdesc;
  }

}
