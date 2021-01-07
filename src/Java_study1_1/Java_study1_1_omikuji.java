package Java_study1_1;

import java.util.Random;

import java.util.Scanner;

public class Java_study1_1_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 課題「おみくじ」
//		 流れを設定
//		 1、最初におみくじを引きますと表示
//		 2、名前をスキャナで読み取り、手入力で表示させる
//		 3、おみくじの結果をランダムクラスを用いて表示させる
		 
//		 randという変数名の箱に、randomクラスという機械を設定
		 Random rand = new Random();
//		scanという変数名の箱に、scannerクラスという機械を設定
		Scanner scan = new Scanner(System.in);
		int Omikuji = 0;  //おみくじの初期値を設定
		String [] luck = {"大吉","中吉","小吉","末吉","凶"}; //おみくじの配列を設定
		
//		おみくじを引くと宣言
		System.out.println("今日のおみくじを引きます！");
		System.out.println("あなたのお名前は？");
//		名前を手入力で表示
		String name = scan.nextLine();
		System.out.println("あなたの名前は"+name);
		
//		randomクラスを使い、おみくじの結果を表示
		int omikujirandom = rand.nextInt(5); //omikujirandomの中に、5つの要素数が、ランダムで入っている。
		System.out.println(name+"さんの今日のおみくじの結果は"+luck[omikujirandom]);
		

	}

}
