package scenario_based;

public class Distributing_Pens {
	public static void main(String[] args) {
		int pens = 14;
		int students =3;
		
		int remainingPens = pens%students;
		int pensDistributed = pens/students;
		
		System.out.println("the pen per student is :"+" "+pensDistributed+"\n"+"the remaining pens are:"+" "+remainingPens);
	}

}
