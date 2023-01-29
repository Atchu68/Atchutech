package onlineclasses;
interface father{
	default void fun() {
		
		
	}
}
interface daughter{
	default void happy() {
		
	}
}
class HappyFamily{
	void joy() {
		
	}
}
class Demo extends HappyFamily implements father,daughter{

	
	public void fun() {
		// TODO Auto-generated method stub
  System.out.println("happy to see you ammu");
	}
	public void happy() {
		System.out.println("happy to see you  dady");
	}
	public void joy() {
		System.out.println("dad little princess forever");
	}
}

class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              father obj =new Demo();{
             obj.fun(); 
	}
              daughter obj1 =new Demo();{
                  obj1.happy(); 
     	}  
              HappyFamily obj2 =new Demo();{
                  obj2.joy(); 
     	}

}
}