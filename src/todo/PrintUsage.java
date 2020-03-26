package todo;

public class PrintUsage {
  public PrintUsage() {
    System.out.println("Command Line Todo application");
    System.out.println("=============================\n");
    System.out.println("Command line arguments:");
    System.out.println("\t -l\tLists all the tasks");
    System.out.println("\t -a\tAdds a new task");
    System.out.println("\t -r\tRemoves an task");
    System.out.println("\t -c\tCompletes an task");
  }
}
