package Java_study1_1;

public class Java_study1_1_2 {

	public static void main(String[] args) {
		// if����{

		int a=3;
		if(a==2) {
			System.out.println("a��2�ł�");
			System.out.println("����ȏ�ł��ȉ��ł��Ȃ��ł�");
		}
		
		//�����̉ۑ�(BMI)
		
		double weight= 52.0;
		double height= 1.65;
		//BMI
		double BMI=weight/(height*height);
		System.out.println(BMI);
		//if��
		if(BMI>=25) {
			System.out.println("�얞");
		} else if(BMI>=18.5&&BMI<=25) {	
			System.out.println("�W��");
		} else {
			System.out.println("��̏d");
		}
		
		
		
	}

}
