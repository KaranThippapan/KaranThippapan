- š Hi, Iām @KaranThippapan
- š Iām interested in Fullstack Developer
- š± Iām currently learning Fullstack developer in KodNest

import java.util.Scanner;

class Calculator {
  double add(double a, double b) {
    return (a + b);
  }

  double mul(double a, double b) {
    return (a * b);
  }

  double Div(double a, double b) {
    return (a / b);
  }

  double sub(double a, double b) {
    return (a - b);
  }
}

class CalculatorApp {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Calculator c = new Calculator();
    System.out.println("Please Enter value for a :");
    double a = s.nextDouble();
    System.out.println("Please Enter value for b :");
    double b = s.nextDouble();
    System.out.println("Choose an operator: +, -, *, or /");
    char operator = s.next().charAt(0);
    if(operator=='+')
    {
        System.out.println(a + " + " + b + " = " + c.add(a, b));
    }
    else if(operator=='-')
    {
        System.out.println(a + " - " + b + " = " + c.sub(a, b));
    }
    else if(operator=='*')
    {
        System.out.println(a + " * " + b + " = " + c.mul(a, b));
    }
    else if(operator=='/')
    {
    System.out.println(a + " / " + b + " = " + c.sub(a, b));
    }
  }
}
