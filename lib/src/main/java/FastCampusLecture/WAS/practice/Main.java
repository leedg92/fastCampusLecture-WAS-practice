package FastCampusLecture.WAS.practice;

import java.io.IOException;

//GET /calculate?operand1=11&operator=*&operand2=551
public class Main {
	public static void main(String[] args) throws IOException {
		new CustomWebApplicationServer(8080).start();
	}
}
