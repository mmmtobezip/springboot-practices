package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 1. 스프링 애플리케이션의 부트스트래핑 역할 : BootStrapin Class 
 * 2. 설정 클래스 : Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {
  public static void main(String[] args) {
    /*
     * SpringApplication.run(...)안에서 수행하는 동작 : BootStrap
     * 1. 애플리케이션 컨텍스트 생성(Application Context = Spring Container) 
     * 2. 만약, 웹애플리케이션이라면 웹애플리케이션 타입 결정(SpringMVC or Reactive 등) 
     * 3. Annotation Scanning + Configuration Class를 통해 빈 생성/등록 와이어링 작업 
     * 4. 만약, 웹애플리케이션이고 타입이 Spring MVC라면 
     *  4-1. 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성 -> new TomcatEmbededServiceServletContainer()로 자바 객체 생성된 것 
     *  4-2. 서버 인스턴스에 웹애플리케이션 배포 (jar를 web-inf/classes 밑에 생성하는 걸 배포라고 함) 
     *  4-3. 서버 인스턴스 실행 
     * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾은 후 실행 
     */
    try (ConfigurableApplicationContext ac =
        SpringApplication.run(HelloWorldApplication.class, args)) {

    }
  }
}
