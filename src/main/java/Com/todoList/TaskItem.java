package Com.todoList;

public class TaskItem {
    private String description;
    private boolean completed;

    public TaskItem(String description) {
         if (!description.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Task description should only contain alphabets.");
        }
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }
}
