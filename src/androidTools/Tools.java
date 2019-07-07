package androidTools;

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//=========== tools==================
		
		// toast
		public void onButton1Clicked(View v) {
			Toast.makeText(getApplicationContext(), "시작 버트이 눌렸어요.", Toast.LENGTH_LONG).show();
		}
		
		//web browser button
		
		public void onButton1Clicked(View v) {
			Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("www.naver.com"));
			startActivity(myIntent);
		}
		
		//call
		public void onButton2Clicked(View v) {
			Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
			startActivity(myIntent);
		}
		
		// new page 새로운 페이지 만들기
		/*
		 app탭에 new - Activity - Empty Activity
		 //액티비티 이름 바꿔주기 ex) MenuActivity
		 */
		
		//back page 돌아가기
		public void onBackButtonClicked(View v) {
			Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌렀어요.", Toast.LENGTH_LONG).show();
			finish();
		}
		
		//=====================================

	}

}
