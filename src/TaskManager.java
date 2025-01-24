import java.util.Scanner;
import java.io.IOException;

public class TaskManager {
    private TaskList taskList;
    private UserInput userInput;
    private SaveData saveData;
    private Scanner scanner;
    private ReadData readData;

    public TaskManager() {
        this.taskList = new TaskList();
        this.userInput = new UserInput();
        this.saveData = new SaveData();
        this.readData = new ReadData();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean weiter = true;

        while (weiter) {
            System.out.println("--To-Do Liste--");
            System.out.println("1. Neues To-Do hinzufügen");
            System.out.println("2. Einzelnes To-Do anzeigen");
            System.out.println("3. Alle To-Dos anezigen");
            System.out.println("4. To-Do Löschen");
            System.out.println("5. Status ändern");
            System.out.println("6. Programm beenden");
            System.out.println("7. Daten aus Datei laden");
            System.out.println("Auswahl: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    neuesTodoHinzufügen();
                    break;
                case 2:
                    showTodo();
                    break;
                case 3:
                    alleTodosAnzeigen();
                    break;
                case 4:
                    todoLöschen();
                    break;
                case 5:
                    todoStatusÄndern();
                    break;
                case 6:
                    weiter = false;
                    System.out.println("To-Do Liste beendet");
                    break;
                case 7:
                    readData();
                    break;
                default:
                    System.out.println("Fehler: Ungültige Eingabe!");
            }
        }
    }
    private void neuesTodoHinzufügen() {
        Task todo = userInput.createTask();
        taskList.addTask(todo);
        saveData.dataToFile(taskList.getTaskList(), "To-Do List.txt");
    }

    private void alleTodosAnzeigen() {
        taskList.showAllTasks();
    }
    private void todoLöschen() {
        System.out.println("Gebe den Namen des To-Do's ein, das du löschen möchtest: ");
        String title = scanner.nextLine();
        Task todo = taskList.deleteTodo(title);
        if (todo != null) {
            System.out.println("To-Do " + title + " wurde gelöscht!");
            saveData.dataToFile(taskList.getTaskList(), "To-Do List.txt");
        } else {
            System.out.println("Fehler: To-Do " + title + " wurde nicht gefunden");
        }

    }
    public void todoStatusÄndern() {
        System.out.println("Welches To-Do möchtest du auf erledigt setzen?: ");
        String title = scanner.nextLine();
        Task todo = taskList.findTaskByName(title);
        if (todo != null) {
            todo.changeStatus();
            saveData.dataToFile(taskList.getTaskList(), "To-Do List.txt");
        } else {
            System.out.println("Fehler: Kein To-Do mit dem Namen " + title + " gefunden!");
        }
    }
    public void showTodo() {
        System.out.println("Welches To-Do möchtest du genauer anzeigen?: ");
        String title = scanner.nextLine();
        Task todo = taskList.findTaskByName(title);
        if (todo != null) {
            todo.showTask();
        } else {
            System.out.println("Fehler: Kein To-Do mit dem Namen " + title + " gefunden!");
        }
    }

    public void readData() {
        readData = new ReadData();
        readData.dataFromFile("To-Do List.txt");

        for (Task todo : readData.getTaskList()) {
            taskList.addTask(todo);
        }
        System.out.println("Daten wurden erfolgreich geladen");
    }
}
