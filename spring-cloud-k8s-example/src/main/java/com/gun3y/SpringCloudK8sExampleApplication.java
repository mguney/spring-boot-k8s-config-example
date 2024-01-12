package com.gun3y;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCloudK8sExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudK8sExampleApplication.class, args);
  }
}
