package com.tanzu.simple.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("api")
public class ApiController {

  @GetMapping("/hello")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(String.format("Hello, %s!", name));
  }

  // 900003883
  @GetMapping("/prime/{num}")
  public String prime(@PathVariable long num) {

    for (long i = 2; i <= num / 2; ++i) {
      // condition for non prime number
      if (num % i == 0) {
        return String.format("%s is not a prime number", num);
      }
    }

    return String.format("%s is a prime number", num);
  }

  public record Greeting (String content) {}

}
