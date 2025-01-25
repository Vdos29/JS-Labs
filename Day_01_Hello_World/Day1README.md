# JS-Labs
I developed this 30 step program to teach me Java. I'll be chronicling my experiences in here. 

### Day 1: Setting Up Your Environment

#### Overview
On Day 1, you will set up your development environment, write your first Java program, and understand the structure of a simple Java application.

---

#### Lecture Content

### What is Java?
Java is a versatile, object-oriented programming language widely used in web, mobile, and enterprise applications. It is known for its portability, meaning programs written in Java can run on any platform with a Java Virtual Machine (JVM).

### Key Terms:
1. **JDK (Java Development Kit):** A software development environment used to develop Java applications.
2. **JVM (Java Virtual Machine):** Runs Java bytecode, enabling platform independence.
3. **IDE (Integrated Development Environment):** Software used to write, debug, and compile programs. For this course, we will use IntelliJ IDEA.

---

#### Tasks:
1. **Download and Install the JDK**:
   - Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Choose the version for your operating system (Windows, macOS, or Linux).
   - Install the JDK by following the on-screen instructions.

2. **Install IntelliJ IDEA**:
   - Download the Community Edition from [JetBrains](https://www.jetbrains.com/idea/download/).
   - Install IntelliJ IDEA and open it after installation.

3. **Configure IntelliJ with the JDK**:
   - Open IntelliJ IDEA and select **New Project**.
   - In the project setup, ensure the JDK you installed is selected.

4. **Write Your First Program**:
   - Create a new Java project named `HelloWorldProject`.
   - Right-click the `src` folder, select **New > Java Class**, and name it `Main`.

---

#### Sample Code:
```java
// This is your first Java program
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

#### Explanation of Code:
1. **`public class Main`**:
   - Declares a class named `Main`. Classes are the building blocks of Java programs.
2. **`public static void main(String[] args)`**:
   - The entry point of a Java application. Execution starts here.
3. **`System.out.println("Hello, World!");`**:
   - Outputs the text "Hello, World!" to the console.

---

#### Practice Tasks:
1. Modify the program to print your name instead of "Hello, World!".
2. Add another line to print your favorite color.
3. Experiment with printing numbers and special characters, e.g., `System.out.println(42);`.

---

#### Outcome:
By the end of this lesson, you will:
1. Have a fully functional Java development environment.
2. Understand the structure of a simple Java program.
3. Be able to write and execute basic Java code in IntelliJ IDEA.
