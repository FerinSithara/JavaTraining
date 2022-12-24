package day8Polymorphism;

public class calMethds {
	
	//Encapsulation ??
	
			// Binding data and methods
			// Hiding Data 
			// Protecting Data // Securities is increased 
			// Encapsulation can be achieved by setting a variable in Private 
			// Encapsulation can be achieved using getter and setter method
			
			private String account ;
			private String phonenumber; // = "9876567412" ;
			
			
			public String getAccount() {
				return account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getPhonenumber() {
				return phonenumber;
			}

			public void setPhonenumber(String phonenumber) {
				this.phonenumber = phonenumber;
			}

			
			

	
	
	
	
	// Polymorphism is divided into two types 
	
		// Static - Compile Time Polymorphism  - Method over riding
		
		//Dynamic - Run time Polymorphism 
		
		
		//Dynamic - Run time Polymorphism - Method over loading 
		
		// Methods with same name but different arguments are called as method overloading
		
		

		

		public int sum(int i , int j)
		{
			int z = i + j;
			return z ;
		}
		
		public int sum(int p , int t , int s)
		{
			int l = p+t+s;
			return l ;
		}
		
		public int sum(int d , int f , int h, int n)
		{
			int x = d+f+h+n;
			return x ;
		}
		
		
		

	}





