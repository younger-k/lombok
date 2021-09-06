package superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Parent {
  protected final String parent1;
  protected final String parent2;
}
