package com.example.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        public void onBackButtonClicked(View v){
            Toast.makeText(getApplicationContext(), "돌아가기 버튼을 눌렀어요.", Toast.LENGTH_LONG).show();
            finish();
        }
        //manifests에 들어가보면
        //<activity android:name=".MenuActivity"></activity>가 추가된 것을 확인 할 수 있다.

        //change page 화면 전환
        public void onButton3Clicked(View v) {
            Intent myIntent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);
        }

        //=====================================
    }
}
