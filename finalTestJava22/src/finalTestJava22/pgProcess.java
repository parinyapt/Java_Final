package finalTestJava22;
import java.util.Scanner;
public class pgProcess {
Scanner input = new Scanner(System.in);
float distance , speed, time;
char charInput ;
		public float destanceProcess(float sp , float ti){
			distance = sp*ti;
			return distance;
		}
		public float speedProcess(float dis , float ti){
			speed = dis/ti;
			return speed;
		}
		public float timeProcess(float dis , float sp){
			time = dis/sp;
			return time;
		}
		
		pgProcess(char charip){
			charInput = charip;
			if(charip == 'D' || charip == 'd'){
				System.out.println("-----:: Distance Process ::-----");
				System.out.print("Enter Speed : ");
				float sp = input.nextFloat();
				System.out.print("Enter Time : ");
				float ti = input.nextFloat();
				destanceProcess(sp,ti);
				System.out.println(distance + " Km");
			}
			else if(charip == 'S' || charip == 's'){
				System.out.println("-----:: Speed Process ::-----");
				System.out.print("Enter Distance : ");
				float dis = input.nextFloat();
				System.out.print("Enter Time : ");
				float ti = input.nextFloat();
				speedProcess(dis,ti);
				//System.out.println(speed  + " Km/h");
				System.out.printf("%.2f Km/h" ,speed);
			}
			else if(charip == 'T' || charip == 't'){
				System.out.println("-----:: Time Process ::-----");
				System.out.print("Enter Distance : ");
				float dis = input.nextFloat();
				System.out.print("Enter Speed : ");
				float sp = input.nextFloat();
				timeProcess(dis,sp);
				//System.out.println(time + " hour");
				System.out.printf("%.2f hour" ,time);
			}
			else{
				System.out.print("Charecter Not Correct | Input new Charecter");
			}
		}
}
