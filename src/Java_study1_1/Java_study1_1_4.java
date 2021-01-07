package Java_study1_1;

import java.util.Random;

import java.util.Scanner;

public class Java_study1_1_4 {

	public static void main(String[] args) {
		// 1番　最初にじゃんけんゲームと出力する。
		// 2番　ユーザーが配列番号を入力する（条件式if文で配列番号を見比べ勝敗を決めるため）
		// 3番　入力した配列番号をスキャンする。
		// 4番　相手がランダムで出力する。
		// 5番　相手がランダムで出力した配列番号と自分が出力した配列番号をif文で見る
		// 6番　if文でユーザーが勝つパターン　負けるパターン　あいこのパターンを書く
		
		//ranという変数名の箱に、randomクラスという機械を設定している。
	     Random ran = new Random();
		//scanという変数名の箱に、scannerクラスという機械を設定している。
    	 Scanner scan = new Scanner(System.in);
		 int cpu = 0; //相手の勝ち数の初期値
		 int user =0; //自分の勝ち数の初期値
//		 じゃんけんの配列
		 String [] rps = {"グー","チョキ","パー"};
		 
		//じゃんけんゲーム作成（課題）
		//自分が3勝、または相手が3勝するまでじゃんけんゲームを続ける
		 while(user<=3||cpu<=3) { //自分が3勝、相手が3勝
			 System.out.println("じゃんけんゲーム開始");
			 System.out.println("『0』『1』『2』を入力してください。（0→グー，1→チョキ，2→パー)");
			 int userInput = scan.nextInt();	//ユーザーが0から2の番号を入力したときに、スキャナーで読み取り、読み取った値をuserinputに入れる
			 int cpurandom = ran.nextInt(3); //cpurandomの中には、3つの要素数がランダムで入っている。
			 System.out.println("あなたが選んだじゃんけんは"+rps[userInput]+"です");
			 System.out.println("相手が選んだのは"+rps[cpurandom]+"です");
		
//			 if文（勝敗を決める）
//		     ユーザの勝ち
			 if ((userInput == 0 && cpurandom == 1) || (userInput == 1 && cpurandom == 2) || (userInput == 2 && cpurandom == 0)) {
				 System.out.println("あなたの勝ち！");
//			CPUの勝ち 
			 } else if ((userInput == 0 && cpurandom == 2) || (userInput == 1 && cpurandom == 0) || (userInput == 2 && cpurandom == 1)) {
				 System.out.println("あなたの負け。相手の勝ち。");
//			あいこ	 
			 } else if ((userInput == 0 && cpurandom == 0) || (userInput == 1 && cpurandom == 1) || (userInput == 2 && cpurandom == 2)) {
				 System.out.println("あいこです");
			 }

			
			
			
			 
			 
			
		}
	}
}

