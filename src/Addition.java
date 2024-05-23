
public class Addition {
	int a=100;
	int b=100;
	int c=a+b;
	
	protected String country() {
		String name="I LOVE MY INDIA";
		return name;
		
	}
	public static void main(String[] args) {
		Addition obj=new Addition();
		System.out.println(obj.c);
		System.out.println("Country method:: "+obj.country());
	}

}
