package todo;

import java.util.List;

public class CheckTask {
  public void checkTask(String[] args) {
    if (args.length == 1) {
      System.out.println("Unable to check: no index provided");
    } else {
      try {
        int completedTask = Integer.parseInt(args[1]);
        List<String> tasks = new ReadFile().readFile();
        if (completedTask > tasks.size()) {
          System.out.println("Unable to check: index is out of bound");
        } else if (tasks.size() >= 2) {
          completedTask--;
          for (int i = 0; i < tasks.size(); i++) {
            if (i == completedTask) {
              tasks.set(completedTask, "[x] " + tasks.get(completedTask));
            }
          }
          new WriteFile().writeFile(tasks);
        }
      } catch (Exception e) {
        System.out.println("Unable to check: index is not a number");
      }
    }
  }
}