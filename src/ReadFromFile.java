import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;



public class ReadFromFile {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\PlayArrays.java";
		
		// Read from above file
		
		try (
			Stream<String> lines = Files.lines(Path.of(filePath))){
			lines.forEach(System.out::println);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		// read from above file 
		// ideal for smaller file
		
		
		try {
			List<String> lines = Files.readAllLines(Path.of(filePath));
			System.out.println(lines);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
		String targetSource = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\Dummyclass.java";
		try {
			Files.copy(Path.of(filePath), Path.of(targetSource) );
			System.out.println();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
		
	}

}
