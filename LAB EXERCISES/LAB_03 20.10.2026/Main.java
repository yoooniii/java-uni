import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);

		//ЗАД1
		/*
		  Player[] players = {new Footballer(), new ChessPlayer()};
	        for (Player p : players) {
	            p.play();
	 }
	 */
		//ЗАД2
	/*
		BankAccount savings=new SavingsAccount();
		savings.deposit(1000);
		savings.calculateInterest(3);
		System.out.println("Баланс на спестовната сметка след 1 година: "+savings.getBalance());
		
		BankAccount checking=new CheckAccount();
		checking.deposit(500);
		checking.withdraw(200);
		checking.calculateInterest(1);
		System.out.println("Баланс на текущата сметка след 6 месеца: "+checking.getBalance());
	*/
		//ЗАД3
		 
		 SchoolCourse[] courses = {new Math(),new Informatics()};
		 for (int i = 0; i < courses.length; i++) {
	            SchoolCourse c = courses[i];
	            System.out.println("Курс: " + c.name);

	            System.out.print("Брой студенти: ");
	            int studentsCount = inp.nextInt();

	            for (int s = 1; s <= studentsCount; s++) {
	                System.out.print("Студент " + s + " - име: ");
	                String studentName = inp.next();
	                System.out.println("Въведете оценки: ");
	                int[] grades = new int[5];
	                for (int j=0;j<5;j++) {
	                    //System.out.print("Оценка " + (j + 1) + ": ");
	                    grades[j] = inp.nextInt();
	                }

	                c.enroll(studentName, grades);
	            }
	        }

	        for (int i = 0; i < courses.length; i++) {
	            System.out.println("Среден успех на курс " + courses[i].name + ": " + courses[i].AvgGrade());
	        }
	}
}
