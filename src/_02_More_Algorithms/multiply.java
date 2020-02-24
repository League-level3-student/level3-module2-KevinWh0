package _02_More_Algorithms;

public class multiply {
	public String multiply(int x, int y) {

		return x + " x " + y + " = " + x * y;
	}

	public boolean isPrime(int numb) {
		// TODO Auto-generated method stub
		for (int i = 2; i < numb; i++) {
			if (numb % i == 0) {
				return false;
			}

		}
		return true;
	}

}
