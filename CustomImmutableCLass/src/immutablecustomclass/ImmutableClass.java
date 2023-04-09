package immutablecustomclass;

public class ImmutableClass {
	int x;
	
	public ImmutableClass(int x) {
		
		this.x =x;
	}
	
	public ImmutableClass change(int x)
	{
		if(this.x == x)
		{
			return this;
		}else {
			return new ImmutableClass(x);
		}
	}
	
	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass(10);
		System.out.println(im);
		System.out.println(im.change(10));
		
		System.out.println(im.change(15));
		
	}

}
