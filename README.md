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
