ArrayList in Java
------------------

ArrayList is a part of Java's Collection Framework and is present in the java.util package. 
It is a resizable array, which can grow or shrink in size dynamically as elements are added or removed.

Key Characteristics:
---------------------
1. Dynamic Resizing:
   - Unlike arrays, ArrayLists can grow or shrink automatically.

2. Ordered Collection:
   - Maintains the order of insertion. Elements can be accessed via index.

3. Allows Duplicates:
   - ArrayList permits duplicate elements. 

4. Not Synchronized:
   - ArrayList is not thread-safe by default. For thread safety, synchronization is required.

Commonly Used Methods:
-----------------------
1. add(E e): Adds an element to the end of the list.
2. add(int index, E element): Inserts an element at the specified position.
3. get(int index): Retrieves the element at the specified index.
4. set(int index, E element): Replaces the element at the specified index.
5. remove(Object o): Removes the first occurrence of the specified element.
6. remove(int index): Removes the element at the specified position.
7. size(): Returns the number of elements in the list.
8. isEmpty(): Checks if the list is empty.
9. contains(Object o): Checks if the list contains a specific element.
10. clear(): Removes all elements from the list.

Usage Example:
---------------
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list.get(0)); // Output: Apple

Advantages:
------------
- Dynamic size
- Easy to use
- Rich set of methods

Disadvantages:
---------------
- Slower than arrays for primitive data types
- Not thread-safe (requires synchronization)

Import Statement:
------------------
import java.util.ArrayList;

Conclusion:
------------
ArrayList is a flexible and commonly used data structure for storing elements 
when the number of elements can vary. It is ideal for general-purpose list operations.

