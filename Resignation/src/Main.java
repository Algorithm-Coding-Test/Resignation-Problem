import java.util.*;

class Process{
	int num;
	int value;
	int duration;
	public Process(int num, int duration, int value) {
		this.num = num;
		this.duration = duration;
		this.value = value;
	}
}
class State{
	int startDate;
	int value;
	public State(int startDate, int value) {
		this.startDate= startDate;
		this.value= value;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int remainDay = scan.nextInt();
		
		scan.nextLine();
		ArrayList<Process> reservation = new ArrayList<>();
		for (int i = 0; i < remainDay; i++) {
			reservation.add(new Process(i,scan.nextInt(), scan.nextInt()));
		}
		int maxValue =0;

		ArrayList<State> states = new ArrayList<>();
		states.add(new State(1, 0));
		while(!states.isEmpty()) {
		
			State newState = states.get(0);
			
			for(int i=newState.startDate;i<=remainDay;i++) {
				
				if((reservation.get(i-1).duration+i) <= remainDay) {
				 states.add(new State(reservation.get(i-1).duration+i, newState.value + reservation.get(i-1).value));
				}
				else {
					if((reservation.get(i-1).duration+i-1) == remainDay) {
						if(maxValue < (newState.value+reservation.get(i-1).value)) maxValue = (newState.value+reservation.get(i-1).value);
					}
				}
			}
			if(maxValue < newState.value) {
				maxValue = newState.value;
			}
			
			states.remove(0);
		}
		System.out.println(maxValue);
	}


}
