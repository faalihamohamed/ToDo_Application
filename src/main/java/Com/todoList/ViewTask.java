package Com.todoList;

import java.util.ArrayList;

public class ViewTask {
    public void displayTasks(ArrayList<TaskItem> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                TaskItem task = tasks.get(i);
                System.out.println((i + 1) + ". " + (task.isCompleted() ? "[Completed] " : "") + task.getDescription());
            }
        }
    }
}
