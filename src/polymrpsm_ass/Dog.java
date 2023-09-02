package polymrpsm_ass;

public class Dog extends Animal {
	
	public Dog(String name) {
		
		super(" ");
		super.name=name;
		super.sound="barking";
		
	}
	public void make_Sound() {
		super.makeSound();
	}
	

	public static void main(String[] args) {
		Dog d=new Dog("dog");
		d.make_Sound();
		
	}

}
