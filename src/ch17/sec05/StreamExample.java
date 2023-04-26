package ch17.sec05;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws Exception {
		Path p = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		Stream<String> s = Files.lines(p,Charset.defaultCharset());
		s.forEach(line -> System.out.println(line));
		s.close();
	}
}
