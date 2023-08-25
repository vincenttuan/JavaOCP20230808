package day23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileIODemo1 {
	/*
	 * "112年08月24日 個股日本益比、殖利率及股價淨值比"
	 * "證券代號","證券名稱","殖利率(%)","股利年度","本益比","股價淨值比","財報年/季",
	 * */
	public static void main(String[] args) {
		try {
			Stream<String> lines = Files.lines(Paths.get("src/day23/BWIBBU_d_ALL_20230824.csv"));
		 	//System.out.println(lines.count());
		 	lines.skip(2).forEach(line -> System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
