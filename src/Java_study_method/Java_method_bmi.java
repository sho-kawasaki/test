package Java_study_method;

public class Java_method_bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		体重と身長の変数定義
		double height = 1.60;
		double weight = 50.0;
		
//		heightとweightの値をBMIメソッドへ引き渡す
		double bmi =  bmi(height, weight);
		
//		出力して処理終了
		System.out.println(bmi);
	}
	
//		bmiメソッド
	public static double bmi (double height, double weight) {
//		BMIの計算結果を呼び出し元（メインメソッド）へ返す
		return weight / (height*height);
	}
}
