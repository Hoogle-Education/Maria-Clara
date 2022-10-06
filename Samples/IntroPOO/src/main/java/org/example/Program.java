package org.example;

class Person {
    String name;
    int age;
    double height;

    double f(double x) {
        return x + 2;
    }

    int somar(int a, int b) {
        return a  + b;
    }

    void fazerAniversario() {
        age++;
    }

    void dizerOi(String nomeDaOutraPessoa) {

        if(nomeDaOutraPessoa == null){
            System.out.println("Olá!");
            return;
        }

        System.out.println("Olá, " + nomeDaOutraPessoa + "!");
    }

}


public class Program {

    public static void main(String[] args) {

        // criando o objeto
        Person person = new Person();

        // instanciando o objeto
        person.name = "Pedro da Silva";
        person.age = 20;
        person.height = 1.8;

        System.out.println("F(3.2) = " + person.f(3.2));

        System.out.println("SOMA = " + person.somar(2, 3));

        person.dizerOi("Maria");

        person.dizerOi(null);

        person.fazerAniversario();

        System.out.println(person.name + " || " + person.age + " || " + person.height);
    }

}