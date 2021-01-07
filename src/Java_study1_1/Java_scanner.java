package Java_study1_1;
import java.util.Scanner;

public class Java_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scannerクラスのインスタンス作成
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("あなたの名前は");
		 
		// String inputName = scanner.nextLine();
		 //System.out.println("あなたの名前は"+ inputName +"ですね！");
		// scanner.close();
		 
		 //課題
		 //名前
		 String Student_name="田中";
		 System.out.println(Student_name);
		 //国語の点数
		 int japanese_score =85;
		 System.out.println(japanese_score);
		 //数学の点数
		 int math_score=66;
		 System.out.println(math_score);
		 //平均点
		 int average_score=(japanese_score+math_score)/2;
		 System.out.println(average_score);
		 
		 //scanner
		 //名前
		 Scanner studentName = new Scanner(System.in);
		 System.out.println("あなたの名前は？");
		 
		 String inputName = studentName.nextLine();
		 System.out.println("あなたの名前は"+ inputName +"さんですね！");
		 
		 //点数（国語）
		 Scanner japaneseScore = new Scanner(System.in);
		 System.out.println("あなたの国語の点数は？");
		 
		 int inputJapanese = japaneseScore.nextInt();
		 System.out.println(inputJapanese+"点ですね！");
		 
		 //点数（数学）
		 Scanner mathScore = new Scanner(System.in);
		 System.out.println("あなたの数学の点数は？");
		 
		 int inputMath = mathScore.nextInt();
		 System.out.println(inputMath+"点ですね！");
		 
		 //平均点
		 Scanner averageScore = new Scanner(System.in);
		 System.out.println("あなたの平均点は？");
		 
		 int inputAverage = mathScore.nextInt();
		 System.out.println(inputAverage+"点ですね！");
		 
		 
	}

}
