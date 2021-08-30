package jacksonized;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.junit.jupiter.api.Test;

public class JacksonizedTest {
  @Test
  void jacksonized_item_object_mapping() throws JsonProcessingException {
    String jsonStr = "{\"name\":\"죠르디\"}";
    ObjectMapper mapper = new ObjectMapper();

    JacksonizedItem item = mapper.readValue(jsonStr, JacksonizedItem.class);
    assertEquals("죠르디", item.getName());
  }

  @Test
  void no_jacksonized_item_object_mapping() {
    String jsonStr = "{\"name\":\"죠르디\"}";
    ObjectMapper mapper = new ObjectMapper();

    assertThrows(MismatchedInputException.class, () -> {
      mapper.readValue(jsonStr, NoJacksonizedItem.class);
    });
  }

  @Test
  void no_jacksonized_item_with_setter_object_mapping() throws JsonProcessingException {
    String jsonStr = "{\"name\":\"죠르디\"}";
    ObjectMapper mapper = new ObjectMapper();

    NoJacksonizedItemWithSetter item = mapper.readValue(jsonStr, NoJacksonizedItemWithSetter.class);
    assertEquals("죠르디", item.getName());
  }
}
