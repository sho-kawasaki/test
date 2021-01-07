package Java_study1_1;

public class Java_study1_1_2 {

	public static void main(String[] args) {
		// if•¶Šî–{

		int a=3;
		if(a==2) {
			System.out.println("a‚Í2‚Å‚·");
			System.out.println("‚»‚êˆÈã‚Å‚àˆÈ‰º‚Å‚à‚È‚¢‚Å‚·");
		}
		
		//¡“ú‚Ì‰Û‘è(BMI)
		
		double weight= 52.0;
		double height= 1.65;
		//BMI
		double BMI=weight/(height*height);
		System.out.println(BMI);
		//if•¶
		if(BMI>=25) {
			System.out.println("”ì–ž");
		} else if(BMI>=18.5&&BMI<=25) {	
			System.out.println("•W€");
		} else {
			System.out.println("’á‘Ìd");
		}
		
		
		
	}

}
