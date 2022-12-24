package day9;

public class calMethods {
	
	
	final int o = 20;
	int x = 10;
	
	public int sum(int a, int b)
	{
		int c = a + b;
		return c ;
				
	}
	
	private void out(int i)
	{
		System.out.println("The Input is " +i);
	}
	
	final void p(int y)
	{
		System.out.println("The input" +y);
	}
	
	protected void z(int x, int y )
	{
		System.out.println("Protected");
	}
	
	
	 private void add(int p, int q, int r)
	    {
		 
		 int k = p + q + r;
		 System.out.println("Private function");
		 
	    }
	    
	    protected int sub(int a, int b)
	    {
	    	int c = a - b;
	    	return c;
	    }
	    
	    final int mul(int o, int i)
	    {
	    	int k = o * i;
	    	return k;
	    	
	    }
	 
   
}
