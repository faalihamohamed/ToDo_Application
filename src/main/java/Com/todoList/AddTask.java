package Com.todoList;

import java.util.Scanner;

public class AddTask {
    private Scanner scanner;

    public AddTask(Scanner scanner) {
        this.scanner = scanner;
    }

    public TaskItem createTask() {
        System.out.print("\nEnter task description: ");
        String description = scanner.nextLine();
        return new TaskItem(description);
    }
}
