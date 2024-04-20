## Basic library system in Java

### Problem statement

Write a Java program that accomplishes the following tasks:

1.     Implement the following options:

Add Books,
Borrow Books,
Return Books,
Exit

2.     For "Add Books":

Prompt the user to enter the book title, author, and quantity.
If the book already exists in the library, update the quantity.
If the book is new, add it to the library.

3.     For "Borrow Books":

Prompt the user to enter the book title and the number of books to borrow.
Check if the requested number of books is available in the library.
If the books are available, update the quantity and display a success message.
If not, display an error message.

4.     For "Return Books":

Prompt the user to enter the book title and the number of books to return.
Check if the books being returned belong to the library system.
If they do, update the quantity and display a success message.
If not, display an error message.

5.     Handle invalid input and display appropriate error messages.

6.     Implement an exit option to allow the user to exit the program.


Remember to use appropriate variable names and follow coding best practices.


### Solution explantion

1. **Main Method** (`public static void main(String[] args)`) - This is the entry point of the program. It initializes a scanner for user input and starts an infinite loop presenting a menu of options to the user. Based on the user's choice, it calls corresponding methods (`addBooks`, `borrowBooks`, `returnBooks`) or exits the program.

2. **Return Books Method** (`private static void returnBooks(Scanner scanner)`) - This method handles the process of returning books to the library. It prompts the user to enter the title of the book they want to return and the quantity. If the book is found in the library (`books` map), it updates the quantity of the book by adding the returned quantity to the existing quantity. Otherwise, it notifies the user that the book is not part of the library.

3. **Borrow Books Method** (`private static void borrowBooks(Scanner scanner)`) - This method handles the process of borrowing books from the library. It prompts the user to enter the title of the book they want to borrow and the quantity. If the requested quantity is available in the library (`books` map), it updates the quantity of the book by subtracting the borrowed quantity from the existing quantity. Otherwise, it notifies the user that the requested quantity is not available.

4. **Add Books Method** (`private static void addBooks(Scanner scanner)`) - This method handles the process of adding books to the library. It prompts the user to enter the title, author, and quantity of the book. It then adds the book to the library by updating the quantity if the book already exists or adding a new entry if it's a new book.


These functions together implement a simple library system where users can add, borrow, and return books. The `books` map serves as a representation of the library's inventory, with book titles as keys and quantities as values.
