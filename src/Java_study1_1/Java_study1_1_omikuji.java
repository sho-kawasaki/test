package Java_study1_1;

import java.util.Random;

import java.util.Scanner;

public class Java_study1_1_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 �ۑ�u���݂����v
//		 �����ݒ�
//		 1�A�ŏ��ɂ��݂����������܂��ƕ\��
//		 2�A���O���X�L���i�œǂݎ��A����͂ŕ\��������
//		 3�A���݂����̌��ʂ������_���N���X��p���ĕ\��������
		 
//		 rand�Ƃ����ϐ����̔��ɁArandom�N���X�Ƃ����@�B��ݒ�
		 Random rand = new Random();
//		scan�Ƃ����ϐ����̔��ɁAscanner�N���X�Ƃ����@�B��ݒ�
		Scanner scan = new Scanner(System.in);
		int Omikuji = 0;  //���݂����̏����l��ݒ�
		String [] luck = {"��g","���g","���g","���g","��"}; //���݂����̔z���ݒ�
		
//		���݂����������Ɛ錾
		System.out.println("�����̂��݂����������܂��I");
		System.out.println("���Ȃ��̂����O�́H");
//		���O������͂ŕ\��
		String name = scan.nextLine();
		System.out.println("���Ȃ��̖��O��"+name);
		
//		random�N���X���g���A���݂����̌��ʂ�\��
		int omikujirandom = rand.nextInt(5); //omikujirandom�̒��ɁA5�̗v�f�����A�����_���œ����Ă���B
		System.out.println(name+"����̍����̂��݂����̌��ʂ�"+luck[omikujirandom]);
		

	}

}
