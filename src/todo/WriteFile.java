package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {
  public void writeFile(List<String> content) {
    try {
      Path filePath = Paths.get("assets/myTodoList.txt");
      Files.write(filePath, content);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
