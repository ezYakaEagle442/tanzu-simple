package com.tanzu.simple.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.tanzu.simple.domain.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuiController {

  private final AtomicInteger counter = new AtomicInteger();

  private final List<Hello> helloes;

  public GuiController(List<Hello> helloes) {
    this.helloes = helloes;
  }

  @GetMapping("/")
  public String greeting(Model model) {
    model.addAttribute("hello", helloes.get(counter.getAndIncrement() % helloes.size()));
    model.addAttribute("color", "#669999");
    return "hello";
  }

}
