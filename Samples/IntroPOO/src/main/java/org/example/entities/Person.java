package org.example.entities;

public class Person {
  
  // atributos
  private String name;
  private int age;
  private double height;
  private String phoneNumber; // opcional

  //construtor
  public Person() {
  }

  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public Person(String name, int age, double height, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public double getHeight() {
    return height;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // métodos
  public double f(double x) {
      return x + 2;
  }


  public int somar(int a, int b) {
      return a + b;
  }

  public void fazerAniversario() {
      this.age++;
  }

  public void dizerOi() {
      System.out.println("Olá!");
  }

  public void dizerOi(String nomeDaOutraPessoa) {
      System.out.println("Olá, " + nomeDaOutraPessoa + "!");
  }

}
