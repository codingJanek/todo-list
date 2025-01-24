import java.io.*;
import java.util.ArrayList;

public class ReadData {
    private ArrayList<Task> taskList;

    public ReadData() {
        this.taskList = new ArrayList<>();
    }

    public void dataFromFile(String filePath) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String zeile;
            String title = "", description = "", dueDate = "";
            boolean status = false;

            while ((zeile = fileReader.readLine()) != null) {

                if (zeile.trim().isEmpty() || zeile.equals("-----------------------")) {
                    continue;
                }

                if (zeile.startsWith("Überschrift:")) {
                    title = zeile.replace("Überschrift:", "").trim();
                } else if (zeile.startsWith("To Do:")) {
                    description = zeile.replace("To Do:", "").trim();
                } else if (zeile.startsWith("Fälligkeitsdatum:")) {
                    dueDate = zeile.replace("Fälligkeitsdatum:", "").trim();
                } else if (zeile.startsWith("Status:")) {

                    String statusString = zeile.replace("Status:", "").trim().toLowerCase();
                    status = statusString.equals("erledigt");  // "erledigt" = true, alles andere = false
                }

                if (!title.isEmpty() && !description.isEmpty() && !dueDate.isEmpty()) {

                    Task todo = new Task(title, description, dueDate, status);
                    taskList.add(todo);

                    title = description = dueDate = "";
                    status = false;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden: " + filePath);
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
    }
}

    public ArrayList<Task> getTaskList() {
        return taskList;
    }
}
