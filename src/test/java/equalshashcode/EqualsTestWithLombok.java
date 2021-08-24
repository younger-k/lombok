package equalshashcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class EqualsTestWithLombok {
  @Test
  void equals_method_true() {
    EmployeeWithLombok employee1 = new EmployeeWithLombok(1, "죠르디", 3, "DEV");
    EmployeeWithLombok employee2 = new EmployeeWithLombok(1, "앙몬드", 2, "HR");

    assertTrue(employee1.equals(employee2));
  }

  @Test
  void equals_method_false() {
    EmployeeWithLombok employee1 = new EmployeeWithLombok(1, "죠르디", 3, "DEV");
    EmployeeWithLombok employee2 = new EmployeeWithLombok(2, "앙몬드", 2, "HR");

    assertFalse(employee1.equals(employee2));
  }

  @Test
  void hash_set_size_1() {
    Set<EmployeeWithLombok> set = new HashSet<>();
    EmployeeWithLombok employee1 = new EmployeeWithLombok(1, "죠르디", 3, "DEV");
    EmployeeWithLombok employee2 = new EmployeeWithLombok(1, "앙몬드", 3, "DEV");

    set.add(employee1);
    set.add(employee2);

    assertEquals(1, set.size());
  }

  @Test
  void same_hash_code() {
    EmployeeWithLombok employee1 = new EmployeeWithLombok(1, "죠르디", 3, "DEV");
    EmployeeWithLombok employee2 = new EmployeeWithLombok(1, "죠르디", 3, "DEV");

    assertEquals(employee1.hashCode(), employee2.hashCode());
  }
}
