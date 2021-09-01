package delegate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Delegate;

@Getter
@AllArgsConstructor
public class DelegationExample {
  private interface Age {
    int getAge();
  }

  @Delegate(types = Member.class, excludes = Age.class)
  private final Member member;
}

@Builder
@Getter
class Member {
  private String name;
  private int age;
}
