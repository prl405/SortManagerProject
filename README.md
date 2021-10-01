# Sort Manager Project

## Description

 A command terminal app that allows the user to select an sorting method to sort a random integer array of the user's specified length.

 ### User Instructions

 ### Project Components
 A brief description of the functionality currently available in the program.

 #### Sorting methods
 The sorting methods available in the program.

 ###### Bubble Sort
 Bubble sort is a comparison based algorithm that compares adjacent pairs of elements in an array, and swaps them if they are in the incorrect order. This process is repeated for multiple passes through the array until the array is completely sorted.

 Worst case performance: O(n^2)

 ###### Merge Sort
 Merge sort is a comparison based algorithm that follows the divide and conquer paradigm. This method of sorting isolates the array's single elements, and then reconstructs it by comparing adjacent elements, placing the elements in the correct order.

 Worst case performance: O(nlog(n))

 ###### Quick Sort
 Quick sort is an in-place sorting algorithm that follows the divide and conquer paradigm. This method selects a pivot element of the array to sort the rest of the elements around, placing elements less than the pivot to the left of it and visa-versa. Selecting a good pivot can increase the performance of the sort.

 Worst case performance: O(nlog(n))

 #### Logger
 The logger logs the program's events during runtime using log4j.

 #### Unit Tests
 The unit tests focus on testing the sorting methods by running random integer arrays with their known sorted array counter parts. This was done using junit.

 #### Exception Handling
 Used to check that the user inputted valid characters and array lengths. Many of the exceptions are picked up by the Java language.

 #### Algorithm Timer

 ### Design Components
 #### OOP
 #### SOLID
 #### Design Patterns
 ###### Factory Method
 ###### Model-View-Controller (MVC)
