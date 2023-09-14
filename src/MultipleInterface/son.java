package MultipleInterface;

public class son implements father, mother {

	@Override
	public void color() {
		System.out.println("white");
		
	}

	@Override
	public void height() {
		System.out.println("normal");
	}

	@Override
	public void car() {
		System.out.println("2");
		
	}

	@Override
	public void land() {
		System.out.println("3");
	}

	public static void main(String[] args) {
	    
		son s = new son();
		s.color();
		s.height();
		s.car();
		s.land();
	}

	
}
