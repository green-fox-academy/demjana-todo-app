package todo;

import java.util.List;

public class Todo {

  public static void main(String[] args) {
    List<String> tasks;
    if (args.length == 0) {
      new PrintUsage();

    } else if (args[0].equals("-l")) {
      tasks= new ReadFile().readFile();
      if (tasks.size() == 0) {
        System.out.println("No todos for today! :)");
      } else {
        new ListTasks(tasks);
      }

    } else if (args[0].equals("-a")) {
      new AddNewTask().addNewTask(args);

    } else if (args[0].equals("-r")) {
      new RemoveTask().removeTask(args);



    } else if (args[0].equals("-c")) {


    } else {
      System.out.println("Unsupported argument");
    }
  }
}
