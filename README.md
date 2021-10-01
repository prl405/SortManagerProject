# Sort Manager Project

## Description

 A command terminal app that allows the user to select an sorting method to sort a random integer array of the user's specified length.

 ### User Instructions
 1.Enter a character from the shown prompt in the terminal to select a sorting algorithm or exit the program, then press enter.

 2.Select an integer array length, then press enter.

 3.After the results show of the completed sort, select the appropriate option to either sort another array or exit the program.

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
 The logger logs the program's events during runtime using log4j and stores them in the app.log file.

 #### Unit Tests
 The unit tests focus on testing the sorting methods by running random integer arrays with their known sorted array counter parts. This was done using junit.

 #### Exception Handling
 Used to check that the user inputted valid characters and array lengths. Many of the exceptions are picked up by the Java language.

 #### Algorithm Timer
 Measures the running time of the called sort method and displays the time taken to sort. The time is measured in nano-seconds.

 (Currently the first call of a particular sort takes significantly longer when compared to subsequent calls.)

 ### Design Components
 A brief mention of the design principles that were followed.
 #### OOP
 #### SOLID
 #### Design Patterns
 ###### Factory Method
 An interface was implemented, called 'Sortable', that instantiated the sorting classes into the 'SortFactory'.

 ###### Model-View-Controller (MVC)
 The program is separated into three main packages which contain their respective classes that correspond to the MVC design pattern.
