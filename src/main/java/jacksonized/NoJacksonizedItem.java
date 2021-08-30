package jacksonized;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NoJacksonizedItem {
  private String name;
}
