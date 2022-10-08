public class Dog extends Pet {

  private String breed;

  public Dog(String n, String b) {
    super(n, "dog");
    breed = b;
  }
  
  public void printPetInfo() {
    System.out.println(this.getName() + " is a dog of breed " + breed);
  }

}
