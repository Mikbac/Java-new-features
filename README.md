# List of new Java functions with examples

# Table of contents

* [Java 8 (LTS)](#java-8-LTS)
* [Java 9 (non-LTS)](#java-9-non-LTS)
* [Java 10 (non-LTS)](#java-10-non-LTS)
* [Java 11 (LTS)](#java-11-LTS)
* [Java 12 (non-LTS)](#java-12-non-LTS)
* [Java 13 (non-LTS)](#java-13-non-LTS)
* [Java 14 (non-LTS)](#java-14-non-LTS)
* [Java 15 (non-LTS)](#java-15-non-LTS)
* [Java 16 (non-LTS)](#java-16-non-LTS)
* [Java 17 (LTS)](#java-17-LTS)
* [Java 18 (LTS)](#java-18-non-LTS)
* [Java 19 (LTS)](#java-19-non-LTS)
* [Java 21 (LTS)](#java-21-LTS)

-------------------------------------------------------------

## Java 8 (LTS)

https://openjdk.java.net/projects/jdk8/

#### GA Date -> March 2014

#### Premier Support Until ->March 2022

#### Extended Support Until -> December 2030

* Files.lines() - Read all lines from a file as a Stream. Bytes from the file are decoded into characters using the
  UTF-8 charset. (https://openjdk.java.net/jeps/179) //todo

TO-DO

-------------------------------------------------------------

## Java 9 (non-LTS)

https://openjdk.java.net/projects/jdk9/

#### GA Date -> September 2017

#### Premier Support Until -> March 2018

#### Extended Support Until -> Not Available

TO-DO

-------------------------------------------------------------

## Java 10 (non-LTS)

https://openjdk.java.net/projects/jdk/10/

#### GA Date -> March 2018

#### Premier Support Until -> September 2018

#### Extended Support Until -> Not Available

TO-DO

-------------------------------------------------------------

## Java 11 (LTS)

https://openjdk.java.net/projects/jdk/11/

#### GA Date -> September 2018

#### Premier Support Until -> September 2023

#### Extended Support Until -> September 2026

* Local-Variable Syntax for Lambda Parameters - "Allow var to be used when declaring the formal parameters of implicitly
  typed lambda expressions." (https://openjdk.java.net/jeps/323)
* HTTP Client - "Standardize the incubated HTTP Client API introduced in JDK 9, via JEP 110, and updated in JDK
  10." (https://openjdk.java.net/jeps/321)

-------------------------------------------------------------

## Java 12 (non-LTS)

https://openjdk.java.net/projects/jdk/12/

#### GA Date -> March 2019

#### Premier Support Until -> September 2019

#### Extended Support Until -> Not Available

* Switch Expressions (Preview) - "Extend switch so it can be used as either a statement or an expression, and so that
  both forms can use either traditional case ... : labels (with fall through) or new case ... -> labels (with no fall
  through), with a further new statement for yielding a value from a switch
  expression." (https://openjdk.java.net/jeps/325)

-------------------------------------------------------------

## Java 13 (non-LTS)

https://openjdk.java.net/projects/jdk/13/

#### GA Date -> September 2019

#### Premier Support Until -> March 2020

#### Extended Support Until -> Not Available

* Switch Expressions (Second Preview) - "Extend switch so it can be used as either a statement or an expression, and so
  that both forms can use either traditional case ... : labels (with fall through) or new case ... -> labels (with no
  fall through), with a further new statement for yielding a value from a switch
  expression." (https://openjdk.java.net/jeps/354)
* Text Blocks (Preview) - "A text block is a multi-line string literal that avoids the need for most escape sequences,
  automatically formats the string in a predictable way, and gives the developer control over format when
  desired." (https://openjdk.java.net/jeps/355)

-------------------------------------------------------------

## Java 14 (non-LTS)

https://openjdk.java.net/projects/jdk/14/

#### GA Date -> March 2020

#### Premier Support Until -> September 2020

#### Extended Support Until -> Not Available

* Records (Preview) - "Records provide a compact syntax for declaring classes which are transparent holders for
  shallowly immutable data." (https://openjdk.java.net/jeps/359)
* Text Blocks (Second Preview) - "A text block is a multi-line string literal that avoids the need for most escape
  sequences, automatically formats the string in a predictable way, and gives the developer control over the format when
  desired." (https://openjdk.java.net/jeps/368)
* Switch Expressions (Standard) - "Extend switch so it can be used as either a statement or an expression, and so that
  both forms can use either traditional case ... : labels (with fall through) or new case ... -> labels (with no fall
  through), with a further new statement for yielding a value from a switch
  expression." (https://openjdk.java.net/jeps/361)
* Pattern Matching for instanceof (Preview) - "Pattern matching allows common logic in a program, namely the conditional
  extraction of components from objects, to be expressed more concisely and safely." (https://openjdk.java.net/jeps/305)

-------------------------------------------------------------

## Java 15 (non-LTS)

https://openjdk.java.net/projects/jdk/15/

#### GA Date -> September 2020

#### Premier Support Until -> March 2021

#### Extended Support Until -> Not Available

* Text Blocks - "A text block is a multi-line string literal that avoids the need for most escape sequences,
  automatically formats the string in a predictable way, and gives the developer control over format when
  desired." (https://openjdk.java.net/jeps/378)
* Records (Second Preview) - "Records provide a compact syntax for declaring classes which are transparent holders for
  shallowly immutable data." (https://openjdk.java.net/jeps/384)
* Sealed Classes (Preview) - "Sealed classes and interfaces restrict which other classes or interfaces may extend or
  implement them." (https://openjdk.java.net/jeps/360)

-------------------------------------------------------------

## Java 16 (non-LTS)

https://openjdk.java.net/projects/jdk/16/

#### GA Date -> March 2021

#### Premier Support Until -> September 2021

#### Extended Support Until -> Not Available

* Pattern Matching For instanceof - "Pattern matching allows common logic in a program, namely the conditional
  extraction of components from objects, to be expressed more concisely and safely." (https://openjdk.java.net/jeps/394)
* Records - "Records provide a compact syntax for declaring classes which are transparent holders for shallowly
  immutable data." (https://openjdk.java.net/jeps/395)

-------------------------------------------------------------

## Java 17 (LTS)

https://openjdk.java.net/projects/jdk/17/

#### GA Date -> September 2021

#### Premier Support Until -> September 2026

#### Extended Support Until -> September 2029

* Pattern Matching for switch (Preview) - "Extending pattern matching to switch allows an expression to be tested
  against a number of patterns, each with a specific action, so that complex data-oriented queries can be expressed
  concisely and safely." (https://openjdk.java.net/jeps/406)
* Sealed Classes - "Sealed classes and interfaces restrict which other classes or interfaces may extend or implement
  them (https://openjdk.java.net/jeps/409)

-------------------------------------------------------------

## Java 18 (non-LTS)

https://openjdk.java.net/projects/jdk/18/

#### GA Date -> March 2022

#### Premier Support Until -> September 2022

#### Extended Support Until -> Not Available

* Simple Web Server (https://openjdk.org/jeps/408)
* Introduce an @snippet tag for JavaDoc's Standard Doclet, to simplify the inclusion of example source code in API
  documentation.(https://openjdk.org/jeps/413)
* Internet-Address Resolution SPI - "Define a service-provider interface (SPI) for host name and address resolution, so
  that java.net.InetAddress can make use of resolvers other than the platform's built-in
  resolver." (https://openjdk.org/jeps/418)
* Deprecate Finalization for Removal (https://openjdk.org/jeps/421)

-------------------------------------------------------------

## Java 19 (non-LTS)

https://openjdk.java.net/projects/jdk/19/

#### GA Date -> September 2022

#### Premier Support Until -> March 2023

#### Extended Support Until -> Not Available

* Port the JDK to Linux/RISC-V - (https://openjdk.org/jeps/422)

-------------------------------------------------------------

## Java 21 (LTS)

#### GA Date -> September 2023

#### Premier Support Until -> September 2028

#### Extended Support Until -> September 2031

* Pattern Matching for switch - "Enhance the Java programming language with pattern matching for switch expressions and
  statements. Extending pattern matching to switch allows an expression to be tested against a number of patterns, each
  with a specific action, so that complex data-oriented queries can be expressed concisely and
  safely." (https://openjdk.org/jeps/441)
* Virtual Threads - "Introduce virtual threads to the Java Platform. Virtual threads are lightweight threads that
  dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent
  applications." (https://openjdk.org/jeps/444)
* String Templates (Preview) = "Enhance the Java programming language with string templates. String templates complement
  Java's existing string literals and text blocks by coupling literal text with embedded expressions and template
  processors to produce specialized results" (https://openjdk.org/jeps/430)

-------------------------------------------------------------
