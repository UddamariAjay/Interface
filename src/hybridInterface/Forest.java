package hybridInterface;

public class Forest implements Animal{

	
	@Override
	public void color() {
		System.out.println("yellow");
		
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		System.out.println("3.4");
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
         System.out.println("king");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("forest");
	}
	
	public void behave() {
		System.out.println("animal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Forest f = new Forest();
        f.color();
        f.height();
        f.type();
        f.area();
        f.behave();
        Animal.colors();
	}

	

}
