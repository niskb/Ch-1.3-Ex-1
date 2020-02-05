package ex1;

public class Demo {

	public static void main(String[] args) {
		// double a11 = .75;
		// double a12 = .5;
		// double a21 = .25;
		// double a22 = .5;
		boolean isSunny = true;
		int numberOfTrials = 10;

		System.out.println("Day 1: Heads... Sunny!");
		for (int i = 1; i < numberOfTrials; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			isSunny = flip(isSunny);
		}

	}

	public static boolean flip(boolean isSunny) {
		if (isSunny) { // if previous day was sunny, flip once and if previous day was cloudy, flip twice
			if (Math.random() < 0.5) {
				System.out.println("Heads... Sunny!");
				return true;
			} else {
				System.out.println("Tails... Cloudy!");
				return false;
			}
		} else {
			if (Math.random() < 0.5) {
				System.out.println("Heads on first toss");
				if (Math.random() < 0.5) {
					System.out.println("Heads... Sunny!");
					return true;
				} else {
					System.out.println("Tails... Cloudy!");
					return false;
				}
			} else {
				System.out.println("Tails on first toss");
				if (Math.random() < 0.5) {
					System.out.println("Heads... Sunny!");
					return true;
				} else {
					System.out.println("Tails... Cloudy!");
					return false;
				}
			}
		}
	}

}
