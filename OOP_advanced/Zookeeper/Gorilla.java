public class Gorilla extends Mammal {
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("the gorilla has thrown something");
		System.out.println("-------------------------------------------------");
	}
	public void eatBananas() {
		energyLevel -= 10;
		System.out.println("the gorilla has eaten a banana is it's satisfied");
		
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("the gorilla has climbed a tree");
		
	}
}