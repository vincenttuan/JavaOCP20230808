package day23;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileIODemo1 {

	public static void main(String[] args) {
		try {
			Stream<String> lines = Files.lines(Paths.get("src/day23/BWIBBU_d_ALL_20230824.csv"));
		 	System.out.println(lines.count());
		 	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
