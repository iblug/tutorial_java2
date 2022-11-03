class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}

public class test {

	public static void main(String[] args) {
	       Child c = new Child();
	}
}