package org.codoid;

import java.util.StringJoiner;

public class Example {
  public static void main(String[] args) {
    StringJoiner sj = new StringJoiner(", ");
    sj.add("apple");
    sj.add("banana");
    sj.add("orange");
    String joined = sj.toString();
    System.out.println(joined);
  }
}

	