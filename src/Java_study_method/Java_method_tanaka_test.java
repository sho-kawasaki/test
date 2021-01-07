package Java_study_method;

public class Java_method_tanaka_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		変数定義
		String StudentName = "田中";
		int japanese_score = 85;
		int math_score = 66;
		
//		点数出力
		System.out.println("国語の点数は85点です");
		System.out.println("数学の点数は66点です");
		
//		国語と数学の点数を平均点メソッドへ引き渡す
		double average_score = average_score(japanese_score, math_score);
		System.out.println(average_score);
	}
//		平均点メソッド
	public static double average_score(double japanese_score, double math_score) {
//		平均点の計算結果を呼び出し先（メインメソッド）へ返す
		return (japanese_score+math_score)/2;
	}
	
		
	
}