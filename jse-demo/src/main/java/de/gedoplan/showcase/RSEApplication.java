package de.gedoplan.showcase;

import de.gedoplan.showcase.rest.RestApplication;
import jakarta.ws.rs.SeBootstrap;

public class RSEApplication {
  public static void main(String[] args) throws InterruptedException {
    SeBootstrap.Configuration configuration = SeBootstrap.Configuration.builder()
        .host("localhost")
        .port(8081)
        .protocol("http")
        .build();
    SeBootstrap
        .start(RestApplication.class, configuration)
        .thenAccept(instance -> {
          // Do something when shutdown is reached
        });
    Thread.currentThread().join();
  }
}
