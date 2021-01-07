package Java_study1_1;

public class Java_study1_tanakaTest {

	public static void main(String[] args) {
		
		//出力
		String Student_name="田中";
		System.out.println(Student_name);
		int japanese_score=85;
		System.out.println(japanese_score);
		int math_score=66;
		System.out.println(math_score);
		
		//国語、数学の点数
		 System.out.println("田中さんの国語の点数は85点です。");
		 System.out.println("田中さんの数学の点数は66点です。");
		 
		//平均点
		 double avarege_score=(japanese_score+math_score)/2.0;
		 System.out.println(avarege_score);
		 System.out.println("田中さんの平均点は75.5点です。");
		 
		 //if文
		 if (avarege_score>=70) {
			 System.out.println("合格");
		 } else {
			 System.out.println("不合格");
		 }
		 
		//中間、期末の結果(出力)
		 int midterm_test=85;
		 System.out.println(midterm_test);
		 int final_test=66;
		 System.out.println(final_test);
		 
		 //合計点
		 int Total_score=midterm_test+final_test;
		 System.out.println(Total_score);
		 
		 //結果
		 System.out.println("中間テストの結果は85点です");
		 System.out.println("期末テストの結果は66点です");
		 System.out.println("中間テストと期末テストの合計点は151点です");
		 		 
		 //if文（合格、不合格）
		 if (midterm_test>=60&&60<=final_test) {
			 System.out.println("合格");
		 }else if (Total_score>=130) {
			 System.out.println("合格");
		 }else if (Total_score>=100||(midterm_test>=90||90<=final_test)) {
			 System.out.println("合格");
		 }else {
			 System.out.println("不合格");
		 }
		 
		 
	
	}	
}


