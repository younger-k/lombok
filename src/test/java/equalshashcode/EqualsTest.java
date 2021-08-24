package equalshashcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EqualsTest {
  @Test
  void equals_method_true() {
    Employee employee1 = new Employee(1, "죠르디", 3, "DEV");
    Employee employee2 = new Employee(1, "앙몬드", 2, "HR");

    assertTrue(employee1.equals(employee2));
  }

  @Test
  void equals_method_false() {
    Employee employee1 = new Employee(1, "죠르디", 3, "DEV");
    Employee employee2 = new Employee(2, "죠르디", 3, "DEV");

    assertFalse(employee1.equals(employee2));
  }

  @Test
  void hash_set_size_1() {
    Set<Employee> set = new HashSet<>();
    Employee employee1 = new Employee(1, "죠르디", 3, "DEV");
    Employee employee2 = new Employee(1, "앙몬드", 2, "HR");

    set.add(employee1);
    set.add(employee2);

    assertEquals(1, set.size());
  }

  @Test
  void same_hash_code() {
    Employee employee1 = new Employee(1, "죠르디", 3, "DEV");
    Employee employee2 = new Employee(1, "죠르디", 3, "DEV");

    assertEquals(employee1.hashCode(), employee2.hashCode());
  }
}
