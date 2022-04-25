package com.tanzu.simple.domain;

public class Choice {

  private String name;

  private String url;

  public Choice(String name, String url) {
    super();
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

}
