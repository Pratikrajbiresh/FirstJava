import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;



public class PlayFiles {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\PlayArrays.java";
		
		// check whether the file exist on the system or not
		
		System.out.println(Files.exists(Path.of(filePath)));
		
		String filePath1 = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\PlayArraysL.java";
		
		System.out.println(Files.exists(Path.of(filePath1)));
		
		// check if its a directory or a regular file
		System.out.println(Files.isRegularFile(Path.of(filePath)));
		String dirPath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src";
		System.out.println(Files.isDirectory(Path.of(dirPath)));
		
		// List all the files with src directory. Just lists till depth 1
		/*Stream<Path> paths = null;
		try {
			paths = Files.list(Path.of(dirPath));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		paths.forEach(path -> System.out.println(path.getFileName()));
		paths.close(); // because this stream is connected to the file system
		// to prevent memory leak, always close this stream*/
		
		try (
			Stream<Path> files = Files.list(Path.of(dirPath))){
				files.forEach(path -> System.out.println(path.getFileName()));
			// only resources implementing the autocloseable interface can be put in try-with-resources
			// once the try block is done, files stream will be auto closed!
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		// Listing all files/directories in src folder reccursively
		try (Stream<Path> recursiveStream = Files.walk(Path.of(dirPath))){
			recursiveStream.filter(path -> Files.isRegularFile(path)).forEach(path -> System.out.println(path.getFileName()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

}
