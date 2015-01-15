
public class Polymorphism {

	public static void main(String[] args) {
		
		A obj = new A();//declared type here is useless 
		((B) obj).other();
		C freak = (C) obj;
		freak.foo();
	}

}

class A extends B {
	A(){
		super("freak");
		System.out.println("A");
	}
	public void foo(){
		System.out.println("Afoo");
	}
}

class B extends C {
	B(){
		System.out.println("B");
	}
	B(String s){
		System.out.println(s);
	}
	public void foo(){
		System.out.println("Bfoo");
	}
	public void other(){
		System.out.println("Bother");
	}
}

class C {
	C(){
		System.out.println("C");
	}
	public void foo(){
		System.out.println("Cfoo");
	}
}