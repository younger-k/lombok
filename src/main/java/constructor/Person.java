package constructor;

public class Person {
  private int id;
  private String name;
  private int age;
  private int weight;
  private int height;

  /**
   * @NoArgsConstructor
   */
  public Person() {}

  /**
   * @AllArgsConstructor
   */
  public Person(int id, String name, int age, int weight, int height) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public int getHeight() {
    return height;
  }

}
