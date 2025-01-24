import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public TaskList(Task todo) {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task todo) {
        taskList.add(todo);
    }

    public Task deleteTodo(String title) {
        for (Task todo : taskList) {
            if (todo.getTitle().equalsIgnoreCase(title)) {
                taskList.remove(todo);
                return todo;
            }
        }
        return null;
    }

    public Task findTaskByName(String title) {
        for (Task todo : taskList) {
            if (todo.getTitle().equalsIgnoreCase(title)) {
                return todo;
            }
        }
        return null;
    }

    public void showAllTasks() {
        System.out.println("Alle To-Do's: ");
        for (Task todo : taskList) {
            System.out.println(todo);
        }
    }
}
