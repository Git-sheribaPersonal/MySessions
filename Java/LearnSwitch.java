package day1.Basics;

public class LearnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// = Assignment operator
		// == comparison operator
		int wakeUpTime = 7;
		// 6--> on time
        // 7 --> late
		// 10 --> very late
		
		switch(wakeUpTime){
		case 6:
			System.out.println("On Time");
			break;
		case 7: 
			System.out.println("Late");
			break;
		case 10:
			System.out.println("Very Late");
			break;
		default:
			System.out.println("Very Bad");
			break;
		}
	
		
	}

}
