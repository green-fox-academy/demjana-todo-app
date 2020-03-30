package todo;

import java.util.List;

public class RemoveTask {
  public void removeTask(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to remove: no index provided");
    } else {
      try {
        int deleteTask = Integer.parseInt(args[1]);
        List<String> tasks = new ReadFile().readFile();
        if (deleteTask > tasks.size()) {
          System.out.println("Unable to remove: index is out of bound");
        } else if (tasks.size() >= 2) {
          deleteTask--;
          for (int i = 0; i < tasks.size(); i++) {
            if (i == deleteTask) {
              tasks.remove(i);
            }
          }
          new WriteFile().writeFile(tasks);
        }
      } catch (Exception e) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
  }
}