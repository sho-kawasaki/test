package Java_study1_1;

public class Java_study1_1_2 {

	public static void main(String[] args) {
		// if文基本

		int a=3;
		if(a==2) {
			System.out.println("aは2です");
			System.out.println("それ以上でも以下でもないです");
		}
		
		//今日の課題(BMI)
		
		double weight= 52.0;
		double height= 1.65;
		//BMI
		double BMI=weight/(height*height);
		System.out.println(BMI);
		//if文
		if(BMI>=25) {
			System.out.println("肥満");
		} else if(BMI>=18.5&&BMI<=25) {	
			System.out.println("標準");
		} else {
			System.out.println("低体重");
		}
		
		
		
	}

}
