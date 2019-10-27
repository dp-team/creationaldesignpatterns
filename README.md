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
**Scenario:** The menus in the cafe are printed out for every
new customer, and are thrown out when the customer leaves. 
The owners have now realized this is very cost inefficient.
They now want to reuse the menus and only print new ones 
when necessary.  

**Solution:** To solve this problem, we first create a generic
object pool class with an abstract create method.Then we use
this class to make a concrete EnglishMenuPool. Now we can use
checkOut and checkIn methods to reuse menu object and create new
ones when all objects are in in use. 

## Builder Pattern
**Scenario:** There are different variates of cakes served 
at the cafe. Even though all of them are cakes, they all 
have different ingredients. The owners want an optimized way
of making the cakes, that will save the chef's time and also
easily add new cake types to the menu in the future.

**Solution:** To solve this problem, we create a Cake class
with all the required attributes. Then we create an abstract 
CakeBuilder class, which has abstract methods for building
each component of the cake. We then extend this class to make
concrete classes for the different variety of cakes. 
Lastly, we create a Chef class that will use one of this 
concrete classes to make the cake and return the created object.

## Prototype Pattern
**Scenario:** The waiters that serve at the cafe all have the
same uniform but different tables. The owners of the cafe want an easy way of getting
new waiters, without going through the trouble of starting
from scratch.

**Solution:** To solve this problem, we first create an abstract Prototype class with
a copy method to enable cloning the object. We then create a
Waiter class extending the Prototype class, implementing the
cloning method. After that we create a WaiterFactory class
that will use a Waiter object as a preset and clone it with 
different table numbers.  

## Singleton Pattern
**Scenario:** The money received by customers of the cafe is
stored in a cash register. It is important that there is only
one cash register per cafe, so that the income of the cafe is
accurately known. 

**Solution:** To solve this problem, we implement CashRegister
as a singleton. we make the constructor private so nobody
can instantiate the class. And we implement a method getInstance
to be called by user to obtain instance of the class.