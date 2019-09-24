import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

public class OuputFile {

	public static void main(String[] args) throws Exception {

		String sourceFile = "Purchase.xml";
		String targetFile = "MyOutputFile.xml";
		File file = new File("MyOutputFile.xml");

		// Adds the files from "MyInputFile.txt" to "MyOutputFile.txt"
		try (FileReader fReader = new FileReader(sourceFile);
				BufferedReader bReader = new BufferedReader(fReader);
				FileWriter writer = new FileWriter(targetFile);) {
			System.out.printf("%-10s%n", "File Copied! ");
			// If the file is created it will add a new line until there is no more input.
			while (true) {
				String line = bReader.readLine();

				if (line == null) {
					break;
				} else {
					while (bReader.ready()) {

						line = bReader.readLine();
						System.out.println(line + "\n");
						writer.write(line + "\n");
					}
				}
			}
		} catch (IOException | NoSuchElementException | IllegalStateException e) {
			e.printStackTrace();
		}
	} // END OF MAIN
}// END OF CLASS