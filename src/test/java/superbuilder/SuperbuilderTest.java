package superbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuperbuilderTest {
  @Test
  void builder_child() {
    Child child = Child.builder()
      .parent1("hello")
      .parent2("lombok")
      .child1("hello")
      .child2("superbuilder!")
      .build();

    StringBuilder sb = new StringBuilder();
    sb.append(child.getParent1())
      .append(" ")
      .append(child.getParent2())
      .append(" ")
      .append(child.getChild1())
      .append(" ")
      .append(child.getChild2());

    assertEquals("hello lombok hello superbuilder!", sb.toString());
  }
}
