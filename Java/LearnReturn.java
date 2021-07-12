package day1.Basics;

public class LearnReturn {

	public void return1() {
		  int x = 30;
	      int y = 70;
	      int z = x+y;
	      
	      return;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Before retrun");
		boolean flag = true;
		// if(  true) 
		if (flag) {
			return;
		}
		else
			System.out.println(" False flag");
		
		System.out.println(" Program executed");
		int z = 50 + 60;
		System.out.println(z);
		
		
		LearnReturn obj = new LearnReturn();
		//obj.clone();
		
		
		
		
	}

}
