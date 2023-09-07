package etc.api904.io907.buffered907;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bwPratice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:/Users/ict/Desktop/새 폴더/kitae.txt");
			bw = new BufferedWriter(fw);
			System.out.println("첫 번째 문장 : ");
			  String first = sc.next();
			  System.out.println("두 번째 문장 : ");
			  String second = sc.next();
			  bw.write(first +"\r\n"+ second);
			  System.out.println("정상 출력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		  
		
		
		
		
	}

}
