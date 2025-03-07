 package com.example;

import java.util.ArrayList;
import java.util.List;

public class MySchoolProject {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }

    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

    System.out.println("Sum of the first 10 integers: " + sum);
  }
}