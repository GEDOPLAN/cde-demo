package de.gedoplan.showcase.rest;

import de.gedoplan.showcase.base.rest.HelloResource;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.Set;

@ApplicationPath("rest")
public class RestApplication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    return Set.of(HelloResource.class);
  }
}
