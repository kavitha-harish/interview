package pract;

import java.util.Date;

public class test3 {

	public static void main(String[] args) {
		Date date = new Date();
			String out = date.toString();
			String out1 = out.replace(":", "_").replace(" ", "_");
			
			System.out.println(out1);

	}

}
