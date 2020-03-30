package todo;

import java.util.Arrays;
import java.util.List;

public class AddNewTask {
  public void addNewTask(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      String task = Arrays.toString(args);
      List<String> tasks = new ReadFile().readFile();
      tasks.add(task.substring(5, task.length() - 1));
      new WriteFile().writeFile(tasks);
    }
  }
}