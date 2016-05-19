package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Animal("herbivore", "lamb", 4));
    add(new Animal("herbivore", "cow", 4));
    add(new Animal("herbivore", "giraffe", 4));
    add(new Animal("carnivore", "lion", 4));
    add(new Animal("carnivore", "bear", 4));
    add(new Animal("carnivore", "leopard", 4));
    add(new Animal("carnivore", "panther", 4));
    add(new Animal("omnivore", "human", 2));
  }};

  ArrayList<Animal> herbivores = new ArrayList<>();
  ArrayList<Animal> carnivores = new ArrayList<>();
  ArrayList<Animal> omnivores = new ArrayList<>();

  public Main() {
    // Write your code here

    for (int i = 0; i < originalList.size(); i++) {
      if (originalList.get(i).getType() == "herbivore")
        herbivores.add(originalList.get(i));
      else if (originalList.get(i).getType() == "carnivore")
        carnivores.add(originalList.get(i));
      else
        omnivores.add(originalList.get(i));
    }
  }







  public static void main(String[] args) {
    new Main();
  }
}
