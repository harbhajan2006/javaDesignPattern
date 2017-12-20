package logical;
// the program will calculate angle between minute and hour hand
/*first we need to calculate minute angle with repect to 12 
as whole watcch is circle and total have 360 angle , watch has total 60
minute so each minute is equal to 6 degree , 360/60.
so minute angle is minute*6

hour angle - The hour hand of a normal 12-hour analogue clock 
turns 360° in 12 hours (720 minutes) or 0.5° per minute. 360/(12*60) = 0.5
hour = 5*6*h+0.5*m
to get angle between both we need to minus hour angle - min angle
=5*6*h+0.5*m-6*m
=30*h-5.5*m
*/

public class WatchAngleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("the angle is :: " + calculateAngle(2,20));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	private static double calculateAngle(int hour , int min) throws Exception{
		if(hour>12 || hour <0){
			throw new Exception("invalid hour");
		}
		if(min>60 || min<0){
			throw new Exception("invalid min");
		}
		return (5.5*min-30*hour);
	}
}
