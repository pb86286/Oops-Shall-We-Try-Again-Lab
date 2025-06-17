package org.example;

import java.util.Scanner;

public class App {

  public static int getValidatedInput(String prompt, String errorMessage, int lowerBound, int upperBound) {
    Scanner scanner = new Scanner(System.in);
    int userInput;

    while (true) {
      System.out.println(prompt);
      if (scanner.hasNextInt()) {
        userInput = scanner.nextInt();
        if (userInput >= lowerBound && userInput <= upperBound) {
          return userInput;
        } else {
          System.out.println(errorMessage);
        }
      } else {
        System.out.println(errorMessage);
        scanner.next(); // clear invalid input
      }
    }
  }

  public static void main(String[] args) {
    int result = getValidatedInput(
      "Please enter a value between 1 and 100:",
      "Your value is invalid",
      1,
      100
    );
    System.out.println("The value chosen by the user is " + result);
  }
}