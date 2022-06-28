// creates result class
public class Task3 {
// creates variables with no assigned value
	int phMarks; int chMarks; int bioMarks; static int total; static int percentage;
// creates method 1 : displays the results that the person got for each exam & the total mark
	static String myResults(int phMarks, int chMarks, int bioMarks) {
		total = phMarks + chMarks + bioMarks;
	return "Congratulations! " +
			"\n" + "Here are your results : " + 
			"\n" + "Physics: " + phMarks +
			"\n" + "Chemistry: " + chMarks +
			"\n" + "Biology: " + bioMarks + 
			"\n" + "Your Total is : " + total;
	}
	
// creates method 2: finds & displays the percentage that the person received for the exams overall.	
	static String myPercentage(int phMarks, int chMarks, int bioMarks ) {
		// % calculation
		 percentage = (phMarks + chMarks + bioMarks) * 100 / (450);
		 // 90 equals to the 60% of 150, which is the maximum mark, so any mark under 90 is a fail, regardless of percentage
		 if ((phMarks < 90) || (chMarks < 90) || (bioMarks < 90)) {
			 return " you are an ABSOLUTE FAILURE,your percentage is : " + percentage + "%," + " but who cares" ;
		 }
		 return " you shoudl be proud,YOUR PERCENTAGE IS " + percentage + "%";
		}

	public static void main(String[] args) {
		System.out.println(myResults(900, 900 , 0));
		System.out.println(myPercentage(900, 900 , 80));
		}
	}

