# Task Management System

This is a simple Java console application that allows you to manage tasks in a to-do list. The program allows you to add new tasks, view a list of tasks, modify task statuses, delete tasks, and save/load task data to/from a file.

## Features

- **Add a new task**: Enter task details such as title, description, due date, and status.
- **View all tasks**: Display a list of all tasks.
- **Modify task status**: Mark tasks as "completed" or "not completed".
- **Delete a task**: Remove a task from the list based on its title.
- **Save and load tasks**: Save tasks to a file and load tasks from a file.

## How to Run the Program

### Prerequisites

Make sure you have Java installed on your machine (minimum version 8).

You can use any text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) to run the program.

### Steps to Run

1. Copy the provided code into files with appropriate names:

    - `Task.java` (for storing task details)
    - `UserInput.java` (for input and creation of new tasks)
    - `TaskList.java` (for managing the list of tasks)
    - `TaskManager.java` (for the main task management logic)
    - `SaveData.java` (for saving tasks to a file)
    - `ReadData.java` (for loading tasks from a file)

2. Open a terminal or command prompt.
3. Navigate to the directory containing the Java files.
4. Compile the program using:

    ```bash
    javac *.java
    ```

5. Run the program with:

    ```bash
    java TaskManager
    ```

## Example Usage

---Task Management---

1. Add a new task  
2. View a single task  
3. View all tasks  
4. Delete a task  
5. Change task status  
6. Exit the program  
7. Load data from file

Selection: 1

Enter task details:  
Title: Complete Homework  
Description: Math homework due tomorrow  
Due Date: 2025-01-25

Task "Complete Homework" added!

---Task Management---

1. Add a new task  
2. View a single task  
3. View all tasks  
4. Delete a task  
5. Change task status  
6. Exit the program  
7. Load data from file

Selection: 3

All Tasks:  
- Title: Complete Homework  
  Description: Math homework due tomorrow  
  Due Date: 2025-01-25  
  Status: Not completed

## Notes

- The program allows you to interactively manage tasks in a simple way.
- Task data is saved to a file named `To-Do List.txt` and can be loaded back on program start.
- Input validation is not fully implemented, so make sure to enter correct data when prompted.

## Possible Improvements

- Add input validation to ensure the correctness of user input.
- Implement an option to edit task details (e.g., title or description).
- Improve the task data storage format for better scalability.
- Add functionality to mark tasks as "in-progress" or other statuses.

Enjoy using the Task Management System!
