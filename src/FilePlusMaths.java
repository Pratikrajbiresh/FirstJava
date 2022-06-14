import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class FilePlusMaths {
	
	public static void main(String[] args) {
		
		String source = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\MathSeries.java";
		String destination = "D:\\Java Training\\src";
		
		
		try {
			Files.copy(Path.of(source), Path.of(destination));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("File Copied!!");
		
		int n = 30;
		MathSeries mathSeries = new MathSeries(new Random());
		System.out.println(mathSeries.fibo(n));
		System.out.println("Fibo Series");
	}
	

}
