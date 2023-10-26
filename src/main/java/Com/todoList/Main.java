package Com.todoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        AddTask addTask = new AddTask(scanner);
        DeleteTask deleteTask = new DeleteTask(scanner);
        MarkTaskCompleted markTaskCompleted = new MarkTaskCompleted(scanner);
        ViewTask viewTask = new ViewTask();

        while (true) {
            System.out.println("\n\tTo-do List:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View All Tasks");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    TaskItem newTask = addTask.createTask();
                    taskList.addTask(newTask);
                    break;
                case 2:
                    int deleteIndex = deleteTask.getTaskIndex() - 1;
                    taskList.deleteTask(deleteIndex);
                    break;
                case 3:
                    int completeIndex = markTaskCompleted.getTaskIndex() - 1;
                    taskList.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    viewTask.displayTasks(taskList.getTasks());
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
