package todo;

import java.util.List;

public class ListTasks {
  public void listTasks(List<String> tasks) {
    if (tasks.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      String completed = "[x] ";
      for (int i = 0; i < tasks.size(); i++) {
        if (tasks.get(i).contains(completed)) {
          System.out.println((i + 1) + " - " + tasks.get(i));
        } else {
          System.out.println((i + 1) + " - " + "[ ] " + tasks.get(i));
        }
      }
    }
  }
}