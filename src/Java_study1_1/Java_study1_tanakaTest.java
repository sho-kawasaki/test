package Java_study1_1;

public class Java_study1_tanakaTest {

	public static void main(String[] args) {
		
		//�o��
		String Student_name="�c��";
		System.out.println(Student_name);
		int japanese_score=85;
		System.out.println(japanese_score);
		int math_score=66;
		System.out.println(math_score);
		
		//����A���w�̓_��
		 System.out.println("�c������̍���̓_����85�_�ł��B");
		 System.out.println("�c������̐��w�̓_����66�_�ł��B");
		 
		//���ϓ_
		 double avarege_score=(japanese_score+math_score)/2.0;
		 System.out.println(avarege_score);
		 System.out.println("�c������̕��ϓ_��75.5�_�ł��B");
		 
		 //if��
		 if (avarege_score>=70) {
			 System.out.println("���i");
		 } else {
			 System.out.println("�s���i");
		 }
		 
		//���ԁA�����̌���(�o��)
		 int midterm_test=85;
		 System.out.println(midterm_test);
		 int final_test=66;
		 System.out.println(final_test);
		 
		 //���v�_
		 int Total_score=midterm_test+final_test;
		 System.out.println(Total_score);
		 
		 //����
		 System.out.println("���ԃe�X�g�̌��ʂ�85�_�ł�");
		 System.out.println("�����e�X�g�̌��ʂ�66�_�ł�");
		 System.out.println("���ԃe�X�g�Ɗ����e�X�g�̍��v�_��151�_�ł�");
		 		 
		 //if���i���i�A�s���i�j
		 if (midterm_test>=60&&60<=final_test) {
			 System.out.println("���i");
		 }else if (Total_score>=130) {
			 System.out.println("���i");
		 }else if (Total_score>=100||(midterm_test>=90||90<=final_test)) {
			 System.out.println("���i");
		 }else {
			 System.out.println("�s���i");
		 }
		 
		 
	
	}	
}


