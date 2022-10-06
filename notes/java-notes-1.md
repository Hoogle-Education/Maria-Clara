# Antes da POO

## Trocando duas variáveis

```java
int a = 2, b = 3;

int aux = a; // aux = 2
a = b; // a = 3
b = aux; // b = 2
```

## Array

É um bloco contíguo de memória acessado por referência

```java
int[] array = new int[100];
array[0] = 1;
array[1] = 2;
```

```java
String[] nomes = new String[10];
int[] idades = new int[10];
double[] alturas = new double[10];
```

Teríamos um grande problema para trocar dois alunos desta "Turma" que definimos no código acima, e este problema escalaria bastante.

# Usando a POO

**Classe**: é um molde que pode fabricar objetos com caracteristicas proprias e funcionalidades proprias.

O que contém uma classe?

1. Atributos: O que a classe "tem".
2. Métodos: O que a classe "faz".

```java
class Person {

  String name;
  int age;
  double height;

}
```

## Solução do problema anterior

```java
  Person[] classroom = new Person[10];

  for (int i=0; i<10; i++) {
      classroom[i] = new Person();
  }

  Person aux = classroom[0];
  classroom[0] = classroom[4];
  classroom[4] = aux;
```

