package com.bring.pictures.bean;

public class Picture {

  private int id;
  private String name;
  private String author;

  public Picture() {
  }

  public Picture(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public Picture(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
