package de.gedoplan.showcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
  @Test
  public void testConcat() {
    var part1 = "Hello";
    var part2 = "World";
    var result = String.join(" ", part1, part2);
    assertEquals(result, "Hello World");
  }
}
