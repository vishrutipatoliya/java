public class inheritence{
	public static void main(String[] args) {
		Realme r1 = new Realme();
		r1.phone();
		r1.realme();
		
	}
}
class Phone{
void phone() {
	System.out.print("Phone is...");
	}
}


class Realme extends Phone{
	void realme() {
		System.out.print("Realme...");
	}
	}

	