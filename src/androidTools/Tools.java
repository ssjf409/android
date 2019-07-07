package androidTools;

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//=========== tools==================
		
		// toast
		public void onButton1Clicked(View v) {
			Toast.makeText(getApplicationContext(), "���� ��Ʈ�� ���Ⱦ��.", Toast.LENGTH_LONG).show();
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
		
		// new page ���ο� ������ �����
		/*
		 app�ǿ� new - Activity - Empty Activity
		 //��Ƽ��Ƽ �̸� �ٲ��ֱ� ex) MenuActivity
		 */
		
		//back page ���ư���
		public void onBackButtonClicked(View v) {
			Toast.makeText(getApplicationContext(), "���ư��� ��ư�� �������.", Toast.LENGTH_LONG).show();
			finish();
		}
		
		//=====================================

	}

}
