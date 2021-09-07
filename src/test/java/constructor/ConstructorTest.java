package constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructorTest {
  @Test
  void no_args_constructor() {
    Person emptyPerson = new Person();
    PersonWithLombok emptyPersonWithLombok = new PersonWithLombok();
  }

  @Test
  void all_args_constructor() {
    Person person = new Person(1, "죠르디", 3, 20, 100);
    PersonWithLombok personWithLombok = new PersonWithLombok(1, "죠르디", 3, 20, 100);
  }

  @Test
  void required_args_constructor() {
    PersonWithRequired person = new PersonWithRequired(1, "죠르디", 3);

    // 불가능. @RequiredArgsConstructor는 final이 선언된 필드의 생성자를 만든다.
    // PersonWithRequired personAll = new PersonWithRequired(1, "죠르디", 3, 20, 100);

    // 불가능. final이 선언된 필드는 객체 생성 시에 반드시 초기화 되어있어야 하므로 기본 생성자로 초기화를 하지 못함
    // 미리 값을 할당하면 기본 생성자 사용 가능하긴 함.
    // PersonWithRequired emptyPerson = new PersonWithRequired();
  }

}
