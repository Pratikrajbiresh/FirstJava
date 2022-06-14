import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FilePlusMathsMultiThreaded {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(() -> {
			String source = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\FirstJava\\src\\MathSeries.java";
			String destination = "D:\\Java Training\\src\\f.java";
			
			
			try {
				Files.copy(Path.of(source), Path.of(destination), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			System.out.println("File Copied!!");
		});

		int n = 30;
		MathSeries mathSeries = new MathSeries(new Random());
		System.out.println(mathSeries.fibo(n));
		System.out.println("Fibo Series");
		
		
		executorService.shutdown();
	}

}
