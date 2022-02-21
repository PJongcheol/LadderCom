package pro01;

import java.util.ArrayList;

public class Code234 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Java");
		list.add("HTML");
		list.add(1, "C++");
		list.set(0, "Fortran");
		list.remove(2);
		list.remove("C++");
		
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}

}
