package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * @SpringBootApplication 메타 애노테이션 
 * 
 * + @SpringBootConfiguration e.g. ex01/ex02 패키지 
 * + @ComponentScan e.g. ex04 패키지 하부 패키지를 스캔 -> 빈 생성 
 * + @EnableAutoConfiguration 
 *      - MVC, AOP, Security, JPA 등 자동 설정
 *      - 발견된 Starter Dependency(Library) 기반으로 설정(관례를 따르는 default 설정)
 *      - application.properties or application.yml 을 통한 미세 설정 가능(필수) 
 *      - SpringBoot의 Auto Configuration이나 미세 설정 이외의 설정은 Java 설정을 통해 
 */

@SpringBootApplication
public class MyApplication {
  public static void main(String[] args) {
    try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {
    }
  }

}
