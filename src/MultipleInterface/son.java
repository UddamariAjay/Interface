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
	
	public void prop() {
		System.out.println("prop");
	}

	public static void main(String[] args) {
	    
		System.out.println(num);
		son s = new son();
		System.out.println(s.nums);
		System.out.println(num1);
		s.color();
		s.height();
		s.car();
		s.land();
		father.shop();
		s.prop();
	}

	
}
