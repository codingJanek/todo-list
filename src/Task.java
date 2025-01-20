public class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean status;

    public Task(String title, String description, String dueDate, boolean status) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }
    //GETTER
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getDueDate() {
        return dueDate;
    }
    public boolean getStatus() {
        return status;
    }
    //SETTER
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusText() {
        return status ? "Erledigt" : "Nicht erledigt";
    }

    public String toString() {
        return "Überschrift: " + title + "\n" + " To-Do: " + description + "\n" + " Datum: " + dueDate + "\n" + " Status: " + getStatusText();
    }

    public void changeStatus() {
        if (!status) {
            setStatus(true);
            System.out.println(title + " Erledigt!");
        } else {
            setStatus(false);
            System.out.println(title + " nicht erledigt");
        }
    }

    public void showTask() {
        System.out.println("Titel: " + title);
        System.out.println("To-Do: " + description);
        System.out.println("Datum: " + dueDate);
        System.out.println("Status: " + getStatusText());
    }
}
