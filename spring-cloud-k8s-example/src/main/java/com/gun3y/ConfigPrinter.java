package com.gun3y;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ConfigPrinter {

  @Value("${app.config1:}")
  private String config1;

  @Value("${app.config2:}")
  private String config2;

  @Value("${app.secret1:}")
  private String secret1;

  @Value("${app.secret2:}")
  private String secret2;

  @Scheduled(fixedDelay = 1000)
  public void configPrinter() {
    System.out.println("Config1: " + config1);
    System.out.println("Config2: " + config2);
    System.out.println("Secret1: " + secret1);
    System.out.println("Secret2: " + secret2);
  }
}
