package Java_study1_1;
import java.util.Scanner;

public class Java_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner�N���X�̃C���X�^���X�쐬
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("���Ȃ��̖��O��");
		 
		// String inputName = scanner.nextLine();
		 //System.out.println("���Ȃ��̖��O��"+ inputName +"�ł��ˁI");
		// scanner.close();
		 
		 //�ۑ�
		 //���O
		 String Student_name="�c��";
		 System.out.println(Student_name);
		 //����̓_��
		 int japanese_score =85;
		 System.out.println(japanese_score);
		 //���w�̓_��
		 int math_score=66;
		 System.out.println(math_score);
		 //���ϓ_
		 int average_score=(japanese_score+math_score)/2;
		 System.out.println(average_score);
		 
		 //scanner
		 //���O
		 Scanner studentName = new Scanner(System.in);
		 System.out.println("���Ȃ��̖��O�́H");
		 
		 String inputName = studentName.nextLine();
		 System.out.println("���Ȃ��̖��O��"+ inputName +"����ł��ˁI");
		 
		 //�_���i����j
		 Scanner japaneseScore = new Scanner(System.in);
		 System.out.println("���Ȃ��̍���̓_���́H");
		 
		 int inputJapanese = japaneseScore.nextInt();
		 System.out.println(inputJapanese+"�_�ł��ˁI");
		 
		 //�_���i���w�j
		 Scanner mathScore = new Scanner(System.in);
		 System.out.println("���Ȃ��̐��w�̓_���́H");
		 
		 int inputMath = mathScore.nextInt();
		 System.out.println(inputMath+"�_�ł��ˁI");
		 
		 //���ϓ_
		 Scanner averageScore = new Scanner(System.in);
		 System.out.println("���Ȃ��̕��ϓ_�́H");
		 
		 int inputAverage = mathScore.nextInt();
		 System.out.println(inputAverage+"�_�ł��ˁI");
		 
		 
	}

}
