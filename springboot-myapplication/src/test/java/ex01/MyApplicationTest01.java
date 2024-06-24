package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
 * Spring Test Integraton
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MyApplication.class}) // 테스트 환경에서 생성하는 컨테이너 = 부트스트랩 run()에서 실행되는 것과 동일 
                                                    
public class MyApplicationTest01 {

  @Autowired
  private MyComponent myComponent;
  
  @Test
  public void testMyComponentNotNull() {
    assertNotNull(myComponent);
  }

}
