package Java_study_method;

public class Java_method_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�̏d�Ɛg���̕ϐ���`
		double height = 1.60;
		double weight = 50.0;
		
//		height��weight�̒l��BMI���\�b�h�ֈ����n��
		double bmi =  bmi(height, weight);
		
//		�o�͂��ď����I��
		System.out.println(bmi);
	}
	
//		bmi���\�b�h
	public static double bmi (double height, double weight) {
//		BMI�̌v�Z���ʂ��Ăяo�����i���C�����\�b�h�j�֕Ԃ�
		return weight / (height*height);
	}
}
