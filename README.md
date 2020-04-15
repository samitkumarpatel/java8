All Java features for all version [click here](https://www.javatpoint.com/java-8-method-reference).

### Java 1.8

Referenced Documents I followed was [java 8](https://www.journaldev.com/2389/java-8-features-with-examples)
and [this](https://www.javatpoint.com/java-8-method-reference)

Java 8 new features:

	1. Lambda expressions
	2. Method references
	3. Functional interfaces
	4. Stream API
	5. Default methods
	6. Base64 Encode Decode
	7. Static methods in interface
	8. Optional class
	9. Collectors class
	10. ForEach() method
	11. Parallel array sorting
	12. Nashorn JavaScript Engine
	13. Parallel Array Sorting
	14. Type and Repating Annotations
	15. IO Enhancements
	16. Concurrency Enhancements
	17. JDBC Enhancements etc.

**Lambda expressions**

Lambda expression helps us to write our code in functional style. It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression. It is very useful in collection library in which it helps to iterate, filter and extract data

```
List<Integer> myList = new ArrayList<Integer>();
for(int i=0; i<10; i++) 
	myList.add(i);

myList.forEach(i -> System.out.println(i));
```

**Method references**

Java 8 Method reference is used to refer method of functional interface . It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

Example can be found on `org.samit.learning.example.Java8ForEach`

```
myList.forEach(System.out::println);
```



**Functional interfaces**


**Stream API**


**Default methods**


**Base64 Encode Decode**


**Static methods in interface**


**Optional class**


**Collectors class**



**forEach() method**

Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interfaces.

It is a default method defined in the java.lang.Iterable interface. Collection classes which extends Iterable interface can use forEach() method to iterate elements.

This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.


forEach method takes java.util.function.Consumer object as argument, so it helps in having our business logic at a separate location that we can reuse


an example can be found on this repo in class `org.samit.learning.example.Java8ForEach` 

```
List<Integer> myList = new ArrayList<Integer>();
for(int i=0; i<10; i++) 
	myList.add(i);

myList.forEach(i -> System.out.println(i));
	//OR//
myList.forEach(System.out::println);

```

**Parallel array sorting**

**Nashorn JavaScript Engine**

**Parallel Array Sorting**

**Type and Repating Annotations**

**IO Enhancements**

** Concurrency Enhancements**

**JDBC Enhancements etc**

**default and static methods in Interfaces**

If you read forEach method details carefully, you will notice that it’s defined in Iterable interface but we know that interfaces can’t have method body. From Java 8, interfaces are enhanced to have method with implementation. We can use default and static keyword to create interfaces with method implementation

