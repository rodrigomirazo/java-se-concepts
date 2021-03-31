# java-se-concepts
Encapsulation, packages, Static and Dynamic Binding, Abstract Class and methods in detail

## Topics
<ol>
    <li>Encapsulation</li>
    <li>Packages</li>
    <li>Static and Dynamic Binding</li>
    <li>Abstract Class and methods in detail</li>
</ol>

## 1. Encapsulation
`Encapsulation refers to the bundling (wrapping) of fields and methods inside a single class.`

It prevents outer classes from accessing and changing fields and methods of a class.
This also helps to achieve data hiding.

#### Question:

`When we buy a car, Do we get an Encapsulated Car? `

**Answer:**
`Most of the times, Encapsulated`

## 2. Packages

A package in Java is used to group related classes.
Think of it as a folder in a file directory.
We use packages to avoid name conflicts, and to write a better maintainable code.

### Adavantages of Packaging

<ol>
    <li>Categorize the classes and interfaces so that they can be easily maintained.</li>
    <li>Provides access protection.</li>
    <li>Avoids naming collision.</li>
</ol>

#### Ways to access the package
    
<ol>
    <li>import package.*;</li>
    <li>import package.classname;</li>
    <li>fully qualified name.</li>
</ol>

##### 1) Using packagename.*

A.java

    package pack;
    public class A {
      public void msg() {
        System.out.println("Hello");
      }
    }

Consume Class A from B

B.java

    package mypack;
    import pack.*;
    
    class B {
      public static void main(String args[]) {
       A obj = new A();
       obj.msg();
      }
    }

##### 2) Using packagename.classname

A.java

    package pack;
    public class A{
      public void msg(){System.out.println("Hello");}
    }

B.java

    package mypack;
    import pack.A;
    
    class B {
      public static void main(String args[]) {
       A obj = new A();
       obj.msg();
      }
    }

##### 3) Using fully qualified name

A.java

    package pack;
    public class A {
      public void msg() { System.out.println("Hello"); }
    }

B.java

    package mypack;
    
    //No Import for this case
    
    class B {
      public static void main(String args[]) {
       pack.A obj = new pack.A();//using fully qualified name
       obj.msg();
      }
    }

##### Access Modifiers

<table class="alt">
<tbody><tr><th>Access Modifier</th><th>within class</th><th>within package</th><th>outside package by subclass only</th><th>outside package</th></tr>
<tr><td><b>Private</b></td><td>Y</td><td>N</td><td>N</td><td>N</td></tr>
<tr><td><b>Default</b></td><td>Y</td><td>Y</td><td>N</td><td>N</td></tr>
<tr><td><b>Protected</b></td><td>Y</td><td>Y</td><td>Y</td><td>N</td></tr>
<tr><td><b>Public</b></td><td>Y</td><td>Y</td><td>Y</td><td>Y</td></tr>
</tbody></table>


## 3. Static and Dynamic Binding

Synonyms

    link, connect, assign

#### What is it?

Connecting a method call to the method body is known as binding.

Example:

    Integer age = new Integer(1); // binding the value 0 to number
    A a = new A();  // binding the value of A() to a
    B b = new A();  // binding the value of A() to a

##### Types of Binding

<table>
    <tr>
        <td> <strong>Static</strong> </td>
        <td> <strong>Dynamic</strong> </td>
    </tr>
    <tr>
        <td> Where TYPE is determined at compile time. </td>
        <td> Where TYPE is determined at Runtime. </td>
    </tr>
        <tr>
            <td> Method Overloading is an example of Static Binding  </td>
            <td> Method overriding is the example of Dynamic Binding </td>
        </tr>
</table>

## 4. Abstract Class and methods in detail

    A class which is declared with the abstract keyword is known as an abstract class in Java.
    It can have abstract and non-abstract methods (method with the body).

#### Abstract methods

    abstract class A {
        abstract void printStatus(String status);
        abstract void printStatus();
    }

<ul>
    <li>Abstract Methods DOES NOT have implementation body </li>
    <li>Abstract Methods needs to have implementation in subclasses.</li>
    <li>Abstract Methods behaves similarly like, methods in interfaces</li>
</ul>

#### Concrete methods

    abstract class B {
        abstract void printStatus(String status) {  }
        abstract void printStatus() {  }
    }

<ul>
    <li>Concrete Methods HAVE implementation body </li>
    <li>Concrete Methods can OPTIONALLY have implementation in subclasses.</li>
    <li>Concrete Methods behaves similarly like, methods in generic classes.</li>
</ul>

<br>

#### Differents between Abstract Classes & Interfaces

<table class="alt">
<tbody><tr><th>Abstract class</th><th>Interface</th></tr>
<tr><td>1) Abstract class <strong>doesn't support multiple inheritance</strong>.</td><td>Interface <strong>supports multiple inheritance</strong>.</td></tr>
<tr><td>2) Abstract class <strong>can have final, non-final, static and non-static variables</strong>.</td><td>Interface has <strong>only static and final variables</strong>.</td></tr>
<tr><td>3) An <strong>abstract class</strong> can extend another Java class and implement multiple Java interfaces.</td><td>An <strong>interface</strong> can extend another Java interface only.</td></tr>
<tr><td>4) An <strong>abstract class</strong> can be extended using keyword "extends".</td><td> An <strong>interface</strong> can be implemented using keyword "implements".</td></tr>
<tr><td>5) A Java <strong>abstract class</strong> can have class members like private, protected, etc.</td><td>Members of a Java interface are public by default. </td></tr>
</tbody></table>
