package sdmcet.cse.oop;

import java.io.*;

class Throws {
	void display() throws IOException {
		throw new IOException();
	}
}

public class ThrowClauseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Throws t = new Throws();

		try {
			t.display();
		} catch (IOException ioe) {
			System.out.println("IOException has occured");
		}
	}

}
