package todo;

import java.util.Arrays;
import java.util.List;

public class RemoveTask {
  public void removeTask(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      int deleteTask = Integer.parseInt(args[1]);
      deleteTask--;
      List<String> tasks = new ReadFile().readFile();
      for (int i = 0; i < tasks.size(); i++) {
        if (i == deleteTask) {
          tasks.remove(i);
        }
      }
      new WriteFile().writeFile(tasks);
    }
  }
}
