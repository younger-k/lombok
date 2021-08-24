package equalshashcode;

public class Employee {
  private int id;
  private String name;
  private int age;
  private String department;

  /**
   * equals 오버라이딩
   * id가 같으면 같은 직원이다.
   */
  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (o == this) return true;
    if (getClass() != o.getClass()) return false;

    Employee e = (Employee) o;
    return (this.getId() == e.getId());
  }

  /**
   * hashCode 오버라이딩
   * id가 같으면 같은 직원으로 인식하기 위하여 해시코드 값도 동일하게 반환한다.
   */
  @Override
  public int hashCode() {
    final int PRIME = 31;
    int result = 1;

    return PRIME * result + getId();
  }

  public Employee(int id, String name, int age, String department) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.department = department;
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

  public String getDepartment() {
    return department;
  }
}
