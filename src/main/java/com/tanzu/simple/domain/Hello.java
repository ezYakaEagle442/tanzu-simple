package com.tanzu.simple.domain;

public class Hello {

  private Choice a;

  private Choice b;

  public Hello(Choice a, Choice b) {
    super();
    this.a = a;
    this.b = b;
  }

  public Choice getA() {
    return a;
  }

  public Choice getB() {
    return b;
  }
}
