package org.example;

import org.example.entities.Person;

public class Program {

    public static void main(String[] args) {

        // criando o objeto
        Person person = new Person("Pedro da Silva", 20, 1.8);

        System.out.println("F(3.2) = " + person.f(3.2));
        System.out.println("SOMA = " + person.somar(2, 3));

        person.dizerOi("Maria");
        person.dizerOi();

        person.fazerAniversario();

        System.out.println( person.getName() 
                            + " || " + person.getAge() 
                            + " || " + person.getHeight() );
    }

}