package helloWorld;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DamitIchNichtEinroste {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello world");

		OutputStream os = null;
		String data = "I will write this String to File in Java";
		int noOfLines = 10;
//
//		try {
//			os = new FileOutputStream(new File("messungenOutText.txt"));
//			os.write(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				os.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//weiter mit Repository
		LocalDateTime date = LocalDateTime.now();
		System.out.println("hallo Olaa");
		System.out.println("hallo Olaa");
		System.out.println("Halloooo Olaa");
		
		File file = new File("messungenOutText.txt");
		FileWriter fr = null;
		BufferedWriter br = null;
		// String dataWithNewLine= date.toString()+System.getProperty("line.separator");
		try {
			fr = new FileWriter(file);
			br = new BufferedWriter(fr);

			for (int i = noOfLines; i > 0; i--) {
				
				Thread.sleep((long) (1000 + Math.random() * 3000));
				
				LocalDateTime dateNachher = LocalDateTime.now();
				
				Duration duration = Duration.between(date, dateNachher);
				long durationNanoSeconds = duration.toNanos();
				String dataWithNewLine = durationNanoSeconds + System.getProperty("line.separator");
				br.write(dataWithNewLine);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
