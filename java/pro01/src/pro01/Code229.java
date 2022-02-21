package pro01;

class Data4<T> {
	T obj;
	Data4(T ob) {
		obj = ob;
	}
	T getObj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T: " + obj.getClass().getName());
	}
}

public class Code229 {
	public static void main(String[] args) {
		Data4<Integer> d1 = new Data4<Integer>(100);
		System.out.println(d1.getObj());
		d1.showType();
		
		Data4<String> d2 = new Data4<String>("JAVA");
		System.out.println(d1.getObj());
		d2.showType();
	}
}
