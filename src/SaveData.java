import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveData {

    public void dataToFile(ArrayList<Task> taskList, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Task task : taskList) {
                writer.write("Überschrift: " + task.getTitle());
                writer.newLine();
                writer.write("To Do: " + task.getDescription());
                writer.newLine();
                writer.write("Fälligkeitsdatum: " + task.getDueDate());
                writer.newLine();
                writer.write("Status: " + task.getStatusText());
                writer.newLine();
                writer.write("-----------------------");
                writer.newLine();
            }
            writer.close();
            System.out.println("Daten erfolgreich gespeichert");
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern der Daten: " + e.getMessage());
        }
    }
}


