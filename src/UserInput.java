import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }
    public Task createTask() {
        System.out.println("--Überschrift--");
        String title = scanner.nextLine();

        System.out.println("--To-Do--");
        String description = scanner.nextLine();

        System.out.println("--Fälligkeitsdatum--");
        String dueDate = scanner.nextLine();

        Task todo = new Task(title, description, dueDate, false);

        System.out.println("--Status--");
        System.out.println(todo.getStatusText());
        System.out.println();

        System.out.println("To-Do " + todo.getTitle() + " hinzugefügt");
        System.out.println();
        return todo;
    }
}
