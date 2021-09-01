package delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DelegationTest {
  @Test
  void test() {
    Member member = Member.builder()
      .name("죠르디")
      .age(10)
      .build();

    DelegationExample delegationExample = new DelegationExample(member);

    assertEquals("죠르디", delegationExample.getName());
    // delegationExample.getAge() 불가능.
  }
}
