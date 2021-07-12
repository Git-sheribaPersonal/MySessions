package day1.Basics;

public class LearnIf {

	public static void main(String[] args) {
		int time = 6; // am
		// = Assignment operator
		// == comparison operator
		int wakeUpTime = 12;
		// 6--> on time
        // 7 --> late
		// 10 --> very late
		
		if (wakeUpTime == time) {
			System.out.println(" On time");
		}
		else if(wakeUpTime == 7)
		{
			System.out.println("Late");
		}
		else if(wakeUpTime == 10)
			System.out.println(" very late");
		else
			System.out.println("Very Bad");
		
		

	}

}
