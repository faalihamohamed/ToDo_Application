# ToDo_Application

ToDo_Application

Description:

This is a Java program about to-do lists to keep track of tasks that need to be completed. This consists of multiple methods and classes that build towards the output. The program provides a basic interactive interface for users to manage a to-do list, allowing them to add tasks, delete tasks, mark tasks as completed, and view the list of tasks. The program continues running until the user chooses to exit.

How to access the application program:
- Click on the following names to access the files
  - src
  - main
  - java
  - Com
  - todoList

Description for each class:
- TaskItem Class:
  - TaskItem represents an individual task with a description and a completion status.
  - It has two private instance variables: description (String) and completed (boolean).
  - The class provides a constructor to initialize the task with a description and sets the completion status to false.
  - It includes getter methods to retrieve the task description and completion status and a method to mark the task as completed.

- TaskList Class:
  - TaskList manages a list of TaskItem objects using an ArrayList.
  - It has methods to add tasks, delete tasks by index, mark tasks as completed by index, and retrieve the list of tasks.
  - The TaskList class ensures that index-based operations are performed within the valid range of the task list.

- AddTask Class:
  - AddTask handles the creation of new tasks.
  - It prompts the user for a task description and returns a new TaskItem object.

- DeleteTask Class and MarkTaskCompleted Class:
  - DeleteTask and MarkTaskCompleted classes handle user input for deleting tasks and marking tasks as completed, respectively.
  - They prompt the user for the task index to be deleted or marked as completed.

- ViewTask Class:
  - ViewTask is responsible for displaying the list of tasks to the user.
  - It takes an ArrayList<TaskItem> as input and displays the tasks and their completion status.

- Main Class:
  - The Main class contains the main method and serves as the entry point for the program.
  - It creates instances of the Scanner class for user input and other necessary classes.
  - The program runs in a loop, displaying a menu of options (add task, delete task, mark task as completed, view tasks, and exit).
  - Based on user input, it performs the corresponding task operations using the other classes.




