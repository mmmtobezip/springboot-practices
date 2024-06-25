package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Spring Boot Test Integration
 * 
 * src/test/java/ex01/MyApplicationTest02 Error 해결 클래스 
 * src/main/java/ex02/MyApplication @Configuration -> @SpringBootConfiguration 
 */

@SpringBootTest
public class MyApplicationTest {

  @Autowired
  private MyComponent myComponent;

  @Test
  public void testMyComponentNotNull() {
    assertNotNull(myComponent);
  }

}
