package constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PersonWithLombok {
  private int id;
  private String name;
  private int age;
  private int weight;
  private int height;
}
