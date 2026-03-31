package M1Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student{
	String name;
	String department;
	int quiz1;
	int quiz2;
	int quiz3;
	
	
	public Student(String name,String department,int q1,int q2, int q3) {
		this.name = name;
		this.department=department;
		this.quiz1=q1;
		this.quiz2=q2;
		this.quiz3=q3;
	}
	public String getName() {
		return name;
		
	}
	public String getDepartment() {
		return department;
	}
	public int getQuiz1() {
		return quiz1;
	}
	public int getQuiz2() {
		return quiz2;
	}
	public int getQuiz3() {
		return quiz3;
	}
	

	public int total() {
		return quiz1+quiz2+quiz3;
	}
}
//class Methods{
//	public static List<Student> records = new ArrayList<>();
//	
//	public void addRecord(Student s) {
//		if(!records.contains(s)) {
//			System.out.println("Record Added: "+ s.getName());
//			records.add(s);
//		}
//	}
//	public void topDepartment(String department) {
//		List<Student> tempDepart = new ArrayList<>();
//		for(Student s :records) {
//			if(s.getDepartment().equalsIgnoreCase(department)) {
//				tempDepart.add(s);
//			}
//		}
//		Student s;
//		Collections.sort(records,(s1,s2)->s1.getTotal()-s2.getTotal());
//	    int i=tempDepart.size()-1;
//	    	s = tempDepart.get(i);
//	    	System.out.println(s.getName()+" "+ s.getTotal());
//	    	
//	    
//	}
//	public void topQuizName(String quizName) {
//		
//	}
//}

public class QuizPerformanceRanking {
	
	public static List<Student> records = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
//		Methods m = new Methods();
		
		while(n-- >0) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String operation = values[0];
			
			if(operation.equals("Record")) {
				
				Student s = new Student(
				 values[1],
				 values[2],
				 Integer.parseInt(values[3]),
				 Integer.parseInt(values[4]),
				 Integer.parseInt(values[5]));
				
				records.add(s);
				System.out.println("record added:"+ s.getName());
				
			}
			else if(values[0].equals("Top")) {
				
				if(records.isEmpty()) {
					System.out.println("no record availabe");
					continue;
				}
				String key = values[1];
				
				
					if( key.startsWith("Q")) {
						int max = Integer.MIN_VALUE;
						for(Student s:records) {
							
							int score = key.equals("Q1")? s.quiz1:
								key.equals("Q2")?s.quiz2:s.quiz3;
							
							if(score>max) {
								max = score;
							}
						}
						 for(Student s:records){

		                        int score = key.equals("Q1") ? s.quiz1 :
		                                    key.equals("Q2") ? s.quiz2 :
		                                    s.quiz3;

		                        if(score==max)
		                            System.out.println(s.name+" "+score);
		                    }
						 
		        }
					else {
						int max=Integer.MIN_VALUE;
						boolean found =false;
						
						for(Student s : records) {
							if(s.department.equalsIgnoreCase(key)) {
								found = true;
								max = Math.max(max,s.total());
							}
						}
						if(!found) {
							System.out.println("department not found");
							continue;
						}
						for(Student s : records) {
							if(s.department.equalsIgnoreCase(key) && s.total()==max) {
								System.out.println(s.getName()+" "+max);
							}
						}
						
					}
				
			}
         
		}

	}

}
