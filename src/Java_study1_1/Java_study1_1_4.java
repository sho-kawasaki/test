package Java_study1_1;

import java.util.Random;

import java.util.Scanner;

public class Java_study1_1_4 {

	public static void main(String[] args) {
		// 1�ԁ@�ŏ��ɂ���񂯂�Q�[���Əo�͂���B
		// 2�ԁ@���[�U�[���z��ԍ�����͂���i������if���Ŕz��ԍ�������׏��s�����߂邽�߁j
		// 3�ԁ@���͂����z��ԍ����X�L��������B
		// 4�ԁ@���肪�����_���ŏo�͂���B
		// 5�ԁ@���肪�����_���ŏo�͂����z��ԍ��Ǝ������o�͂����z��ԍ���if���Ō���
		// 6�ԁ@if���Ń��[�U�[�����p�^�[���@������p�^�[���@�������̃p�^�[��������
		
		//ran�Ƃ����ϐ����̔��ɁArandom�N���X�Ƃ����@�B��ݒ肵�Ă���B
	     Random ran = new Random();
		//scan�Ƃ����ϐ����̔��ɁAscanner�N���X�Ƃ����@�B��ݒ肵�Ă���B
    	 Scanner scan = new Scanner(System.in);
		 int cpu = 0; //����̏������̏����l
		 int user =0; //�����̏������̏����l
//		 ����񂯂�̔z��
		 String [] rps = {"�O�[","�`���L","�p�["};
		 
		//����񂯂�Q�[���쐬�i�ۑ�j
		//������3���A�܂��͑��肪3������܂ł���񂯂�Q�[���𑱂���
		 while(user<=3||cpu<=3) { //������3���A���肪3��
			 System.out.println("����񂯂�Q�[���J�n");
			 System.out.println("�w0�x�w1�x�w2�x����͂��Ă��������B�i0���O�[�C1���`���L�C2���p�[)");
			 int userInput = scan.nextInt();	//���[�U�[��0����2�̔ԍ�����͂����Ƃ��ɁA�X�L���i�[�œǂݎ��A�ǂݎ�����l��userinput�ɓ����
			 int cpurandom = ran.nextInt(3); //cpurandom�̒��ɂ́A3�̗v�f���������_���œ����Ă���B
			 System.out.println("���Ȃ����I�񂾂���񂯂��"+rps[userInput]+"�ł�");
			 System.out.println("���肪�I�񂾂̂�"+rps[cpurandom]+"�ł�");
		
//			 if���i���s�����߂�j
//		     ���[�U�̏���
			 if ((userInput == 0 && cpurandom == 1) || (userInput == 1 && cpurandom == 2) || (userInput == 2 && cpurandom == 0)) {
				 System.out.println("���Ȃ��̏����I");
//			CPU�̏��� 
			 } else if ((userInput == 0 && cpurandom == 2) || (userInput == 1 && cpurandom == 0) || (userInput == 2 && cpurandom == 1)) {
				 System.out.println("���Ȃ��̕����B����̏����B");
//			������	 
			 } else if ((userInput == 0 && cpurandom == 0) || (userInput == 1 && cpurandom == 1) || (userInput == 2 && cpurandom == 2)) {
				 System.out.println("�������ł�");
			 }

			
			
			
			 
			 
			
		}
	}
}

