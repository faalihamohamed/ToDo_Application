package Com.todoList;

import java.util.Scanner;

public class DeleteTask {
    private Scanner scanner;

    public DeleteTask(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getTaskIndex() {
        System.out.print("Enter task index to delete: ");
        return scanner.nextInt();
    }
}
