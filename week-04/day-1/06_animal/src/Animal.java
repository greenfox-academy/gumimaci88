public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat() {
    hunger += 1;
  }

  public void drink() {
    thirst += 1;
  }

  public void play() {
    hunger -= 1;
    thirst -= 1;
  }

  public void whatdoesthefoxsay() {
    System.out.println("The hunger is this much: " + hunger);
    System.out.println("The thirst is this much: " + thirst);
  }
}
