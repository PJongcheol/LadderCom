package pro01;

class Dog {
	String name;
	int age;
}


public class Code94 {

	public static void main(String[] args) {
		Dog happy = new Dog();
		Dog bella = new Dog();
		Dog ssali = new Dog();
		happy.name = "Happy";
		happy.age = 3;
		bella.name = "Bella";
		bella.age = 2;
		ssali.name = "Ssali";
		ssali.age = 11;
		
		System.out.println("나는 강아지를 세 마리를 키웁니다");
		System.out.println("첫번째는 이름이 " + happy.name + "이고 " + happy.age + "세 입니다");
		System.out.println("두번째는 이름이 " + bella.name + "이고 " + bella.age + "세 입니다");
		System.out.println("나머지 한 마리는 이름이 " + ssali.name + "이고 " + ssali.age + "세 입니다");
	}

}
