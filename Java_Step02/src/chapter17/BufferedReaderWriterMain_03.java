package chapter17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain_03 {
	public static void main(String[] args) {
		String filePath = "buffered_output.txt";
		
		String[] data = {"Hello, world!", "This is a test.", "Java I/O is interesting!"};
		try(BufferedWriter wr = new BufferedWriter(new FileWriter(filePath))) {
			for(String line : data) {
				wr.write(line);
				wr.newLine();
			}
			System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}//try
		
		//bufferedReader로 파일읽기
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			System.out.println("file 내부: " );
			while ((line= br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}
