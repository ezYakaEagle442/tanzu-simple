package com.tanzu.simple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tanzu.simple.domain.Choice;
import com.tanzu.simple.domain.Hello;

@SpringBootApplication
public class TanzuSimpleApplication {

  @Bean
  public List<Hello> helloes() {
    List<Hello> helloes = new ArrayList<Hello>();
    helloes.add(new Hello(new Choice("Cat", "/images/cat.gif"), new Choice("Dog", "/images/dog.gif")));
    helloes.add(new Hello(new Choice("Ski", "/images/ski.gif"), new Choice("Snowboard", "/images/snowboard.gif")));
    helloes.add(new Hello(new Choice("Beach", "/images/beach.gif"), new Choice("Mountain", "/images/mountain.gif")));
    return helloes;
  }

  public static void main(String[] args) {
    SpringApplication.run(TanzuSimpleApplication.class, args);
  }

}
