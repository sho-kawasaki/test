package Java_study_method;

public class Java_method_tanaka_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ϐ���`
		String StudentName = "�c��";
		int japanese_score = 85;
		int math_score = 66;
		
//		�_���o��
		System.out.println("����̓_����85�_�ł�");
		System.out.println("���w�̓_����66�_�ł�");
		
//		����Ɛ��w�̓_���𕽋ϓ_���\�b�h�ֈ����n��
		double average_score = average_score(japanese_score, math_score);
		System.out.println(average_score);
	}
//		���ϓ_���\�b�h
	public static double average_score(double japanese_score, double math_score) {
//		���ϓ_�̌v�Z���ʂ��Ăяo����i���C�����\�b�h�j�֕Ԃ�
		return (japanese_score+math_score)/2;
	}
	
		
	
}