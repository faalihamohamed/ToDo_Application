package Com.todoList;

import java.util.Scanner;

public class MarkTaskCompleted {
    private Scanner scanner;

    public MarkTaskCompleted(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getTaskIndex() {
        System.out.print("Enter task index to mark as completed: ");
        return scanner.nextInt();
    }
}
