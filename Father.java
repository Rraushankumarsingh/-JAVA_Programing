
class Father{
	Father(int x){
		System.out.println("f1");
		
	}
	Father(String x){
		System.out.println("f2");
	}
	Father(int x,String a)
	{
		System.out.println("f3");
	}
	
}
class son extends Father{
	son(){
		super("java");
		System.out.println("son");
	}
	public static void main(String[] args) {
		son s1=new son();
		
	}
}
