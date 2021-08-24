package equalshashcode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@AllArgsConstructor
public class EmployeeWithLombok {
  @EqualsAndHashCode.Include
  private int id;

  private String name;

  private int age;

  private String department;
}
