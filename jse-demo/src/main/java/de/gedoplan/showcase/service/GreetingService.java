package de.gedoplan.showcase.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
  public String greet() {
    return "Hello from Rest";
  }
}
