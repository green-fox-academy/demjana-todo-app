package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
  public List<String> readFile() {
    try {
      Path filePath = Paths.get("assets/myTodoList.txt"); //ok!
      return Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!"); //ok!
    }
    return null;
  }
}
