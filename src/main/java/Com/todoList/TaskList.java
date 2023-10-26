package Com.todoList;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<TaskItem> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(TaskItem task) {
        tasks.add(task);
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        }
    }

    public ArrayList<TaskItem> getTasks() {
        return tasks;
    }
}
