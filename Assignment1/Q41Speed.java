/* Implement a Java program to takes the user for a distance (in meters) 
and the time was taken (as three numbers: hours, minutes, seconds), 
and display the speed, in meters per second, kilometers per hour and miles per hour 
(hint: 1 mile = 1609 meters). */

import java.util.Scanner;

class Q41Speed{
	
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the distance covered in meters");
		
		int distance = Integer.parseInt(obj.next());
		
		System.out.println("Enter the time taken in hours minutes and seconds");
		
		double timeHour = Integer.parseInt(obj.next());
		double timeMin = Integer.parseInt(obj.next());
		double timeSec = Integer.parseInt(obj.next());
		
		double totalTimeSec = (timeHour*3600) + (timeMin*60) + timeSec ;
		
		double totalTimeHour = timeHour + (timeMin/60) + (timeSec/3600);
		
		//System.out.println("Time in hour is "+totalTimeHour);
		
		double speed_mps = (double)distance / (double)totalTimeSec ;
		
		double distanceKm = (double)distance / 1000.00;
		
		double distanceMiles = (double)distance / 1609.00;
		
		System.out.println("Speed in meters per second is "+speed_mps+" m/s");
		
		System.out.println("Speed in kilometer per hour is "+(distanceKm/totalTimeHour)+" km/hr");
		
		System.out.println("Speed in miles per hour is "+(distanceMiles/totalTimeHour)+" miles/hr");
		
	}
}