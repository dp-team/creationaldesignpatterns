# Creational Design Patterns Demo
This repo contains demo codes for creational design patterns using, as 
an example a fictitious virtual cafe named "the design-pattern
cafe".

We came up with this example to better illustrate the design patterns.
For each pattern, we have devised a problem-scenario 
that could potentially be solved with the pattern.

## Factory Method Pattern
**Scenario:** The design-pattern cafe is growing popular 
and the owners decided to open a new branch in France. 
But there is a problem, all the menus are in English and 
the French could not understand it. There is also a 
confusion in the currency. The French use the Euro but the 
system displays price in Ethiopian Birr.

**Solution:** We can solve this problem by first creating 
an abstract Menu class, and then creating concrete classes that
extend this abstract class to make a French and other 
language versions of the menu. We then create a 
GetMenuFactory class to generate object of the different 
language versions based on the information passed.

## Abstract Factory Method Pattern 
**Scenario:** There are now several new branches of the cafe
and we have managed to change the language of the menu for 
each branch. But the owners now want each branch to have 
unique interior design. Each branch will have a different look,
the pictures on the wall and the staff uniform should be 
different.

**Solution:** To solve this problem, we create interfaces 
for WallPicture and StaffUniform. Then we create concrete 
classes that implement these interfaces. After that, we create 
an abstract BranchFactory class that will return WallPicture and
StaffUniform objects. Lastly we will create a static class 
FactoryCreator to generate BranchFactory object based on 
the information passed.

## Object Pool Pattern
**Scenario:**

**Solution:**

## Builder Pattern
**Scenario:**

**Solution:**

## Prototype Pattern
**Scenario:**

**Solution:**

## Singleton Pattern
**Scenario:**

**Solution:**