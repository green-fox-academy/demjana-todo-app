package todo;

import java.util.List;

public class Todo {

  public static void main(String[] args) {
    String[] acceptedArguments = {"-l", "-a", "-r", "-c"};
    boolean isTheInputArgOk = false;
    if (args.length == 0) {
      new PrintUsage();
      return;
    }

    for (String acceptedArgument : acceptedArguments) {
      if (args[0].equals(acceptedArgument)) {
        isTheInputArgOk = true;
      }
    }
    if (!isTheInputArgOk) {
      System.out.println("Unsupported argument");
      return;
    }

    List<String> tasks;
    ReadFile readFile = new ReadFile();
    tasks = readFile.readFile();

    if (args[0].equals("-l")){
      if (tasks.size() == 0){
        System.out.println("No todos for today! :)"); //ok!
        return;
      }
      new ListTasks(tasks);
      return;
    }


  }
}
