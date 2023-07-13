public class Bat extends Mammal {
	
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		if (energyLevel <= 0) {
			System.out.println("The bat has no energy left");
		}
		else {
					energyLevel -= 50;
		System.out.println("the bat is airborne");
		}

	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("the bat has ate and it's satisfied");
	}
	public void attackTown() {
		if (energyLevel <= 0) {
			System.out.println("The bat has no energy left");
		}
		else {
		energyLevel -= 100;
		System.out.println("the bat has attacked a town");
		}
	}
}