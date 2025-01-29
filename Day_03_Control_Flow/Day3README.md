
### Day 3: Control Flow Statements

#### Overview
On Day 3, you will learn how to control the flow of your program using conditional statements (`if`, `else`, and `switch`). These are essential tools for making decisions in your code based on conditions.

---

#### Lecture Content

### What are Control Flow Statements?
Control flow statements allow a program to execute different code paths based on conditions. Java provides several types of control flow statements, including:

1. **`if` Statement**:
   - Executes a block of code if a specified condition is true.
2. **`else` Statement**:
   - Executes a block of code if the `if` condition is false.
3. **`else if` Statement**:
   - Adds additional conditions to an `if`-`else` structure.
4. **`switch` Statement**:
   - Selects a block of code to execute based on the value of a variable.

---

#### Tasks:
1. Write a program that assigns a grade based on a numerical score.
2. Extend the program to include bonus messages using a `switch` statement.

---

#### Sample Code:
```java
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        switch (score / 10) {
            case 10: case 9:
                System.out.println("Excellent work!");
                break;
            case 8:
                System.out.println("Great job!");
                break;
            case 7:
                System.out.println("Good effort!");
                break;
            default:
                System.out.println("Keep trying!");
        }
    }
}
```

---

#### Explanation of Code:
1. **`if (score >= 90)`**:
   - Checks if the score is 90 or higher and prints "Grade: A" if true.
2. **`else if (score >= 80)`**:
   - Checks if the score is between 80 and 89.
3. **`else`**:
   - Handles all scores below 70 and prints "Grade: F".
4. **`switch (score / 10)`**:
   - Divides the score by 10 to determine the grade category.
   - Executes specific messages based on the grade range.

---

#### Practice Tasks:
1. Modify the program to include grades for scores below 60 (e.g., "Grade: E").
2. Add additional bonus messages for scores of 95 and above.
3. Test the program with edge cases, such as scores of 0, 59, 60, and 100.

---

#### Outcome:
By the end of this lesson, you will:
1. Understand how to use `if`, `else`, and `switch` statements.
2. Be able to make decisions in your code based on conditions.
3. Write a program that provides feedback based on numerical input.
