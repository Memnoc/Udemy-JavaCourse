## Final

Fields declared as **final** are not actually _constants_ because they **can** be modified.
However, they can be modified **only once** and nay modification **must be performed before the class constructor finishes**.

What that means is that we can assign a final field its value, either when we first declared it, or in the constructor.

**_A variable should be marked as final when you know that the value should not be changed once the initial value's been set._**

This is complementary to the speech on **CONSTANTS**, variables that never change their value.
A constant is often declared as _static final_. Why?
Because if it's true that their value really never changes, it makes no sense to store a copy of the variable in every single class instance.
They (instances of the class) they all store the same value, so it makes sense to define it only once at a class level.
This is why values that are constants are usually declared as _static final_.

A good example of CONSTANT  is in the Math package.
For example:

`System.out.println(Math.PI);`

In the source code, PI is declared as:

`public static final double PI = 3.14159265358979323846;`
 - upper case
 - static final
 - initialized once at class level cause every instance of that class would use the same value for PI anyway
 
 You can mark a class as final, like in the Math class case, declared as:
 
 `private final class Math () {
 }`
 
 Which practically means that the class cannot be instantiated:
 
 `Math m = new Math(); // error`
 
Marking a method as final would prevent that method to be overridden.

**Static initialization blocks**:

These are the static versions of the standard constructors (aka **instance constructors**, 
known with this name because they get executed every time we create an instance of a class.)

The static equivalent of that, as said is the **static initialization block**. 
 - The difference from a instance constructor is that the block is executed only once when the class is first loaded into the project.
 - We can assign the value of a static final variable in the static initialization block.
 - You can have as many static initialization blocks as you like.
 - They are called in the order they are declared in the class.
