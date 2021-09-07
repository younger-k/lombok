package constructor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PersonWithRequired {
  private final int id;
  private final String name;
  private final int age;
  private int weight;
  private int height;
}
