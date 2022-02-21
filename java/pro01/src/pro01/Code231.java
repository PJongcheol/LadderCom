package pro01;

class Data5<T extends Number> {
	T obj;
	Data5(T ob) {
		obj = ob;
	}
	int calcMultiple(int n) {
		return obj.intValue() * 5;
	}
}

public class Code231 {

	public static void main(String[] args) {
		Data5<Integer> d = new Data5<Integer>(100);
		int result = d.calcMultiple(5);
		System.out.println(result);
		
		Data5<Double> e = new Data5<Double>(17.5);
		int reuslt2 = e.calcMultiple(5);
		System.out.println(reuslt2);
	}

}
