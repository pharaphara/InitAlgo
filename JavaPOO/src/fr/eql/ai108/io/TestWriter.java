package fr.eql.ai108.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:/DossierAI108/testFW.txt", false);
			fw.write("Hello AI108 \r \n");
			fw.write(42);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
