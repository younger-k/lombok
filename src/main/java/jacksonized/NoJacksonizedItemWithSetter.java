package jacksonized;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoJacksonizedItemWithSetter {
  private String name;
}
