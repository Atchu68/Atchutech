package onlineclasses;
interface Age1{
	int a=22;
	void show();
}
interface Age2{
	int b=25;
	void display();
}
class Impl implements Age1,Age2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello my age is 25");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello my age is 22");
	}
	
}
 public class AnonymousDemo {

	public static void main(String[] args) {
		
		Age1 obj=new Impl();{
			
		};
		obj.show();
		
	Age2 obj2=new Impl();{
		
		
	};
	obj2.display();

	}
	
}

