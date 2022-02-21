package pro01;

class Parent6{
}


class Child6 extends Parent6 {
}


class InstanceofExample {
	void method1(Parent6 parentA) {
		if(parentA instanceof Child6) {
			System.out.println("method1 - Child1로 변환 성공");
		} else {
			System.out.println("method1 - Child1로 변환되지 않음");
		}
	}
}

public class Code152_1 {

	public static void main(String[] args) {
		Parent6 parentA = new Child6();
	}

}
