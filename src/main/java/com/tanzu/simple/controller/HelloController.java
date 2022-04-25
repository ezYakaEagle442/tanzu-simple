package com.tanzu.simple.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

  @GetMapping("/hello")
  public String hello(@RequestHeader Map<String, String> headers) {
    headers.forEach((key, value) -> {
      LOG.info(String.format("Header '%s' = %s", key, value));
    });
    return "Hello";
  }

}
