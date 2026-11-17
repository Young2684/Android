package com.example.chapter11;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("deprecation")
public class Self1102 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self1102_main);
        setTitle("갤러리 영화 포스터(개선)");

        Gallery gallery = (Gallery) findViewById(R.id.galley1);

        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);
    }

    public class MyGalleryAdapter extends BaseAdapter {

        Context context;
        Integer[] posterID = { R.drawable.mov11, R.drawable.mov12,
                R.drawable.mov13, R.drawable.mov14, R.drawable.mov15,
                R.drawable.mov16, R.drawable.mov17, R.drawable.mov18,
                R.drawable.mov19, R.drawable.mov20 };

        String[] posterTitle = { "레옹", "주먹왕 랄프2", "타짜","걸캅스", "도굴", "어벤저스",
                "엑시트", "캡틴 마블", "봉오동 전투", "분노의 질주"};

        String[] posterText = { "고독한 킬러 레옹과 가족을 잃은 소녀 마틸다의 복수와 교감을 그린 액션 드라마",
                "고장 난 오락기 부품을 구하기 위해 인터넷 세상으로 떠난 랄프와 바넬로피의 모험",
                "도박판에 뛰어들어 전설적인 타짜로 거듭나는 고니의 목숨을 건 승부 이야기",
                "디지털 성범죄 사건을 해결하기 위해 뭉친 전직 전설의 형사와 현직 꼴통 형사의 비공식 수사극",
                "천재 도굴꾼 강동구가 전국의 전문가들과 함께 땅속에 숨겨진 유물을 파헤치는 범죄 오락 영화",
                "어벤져스 시리즈의 최종장",
                "유독가스로 뒤덮인 도심을 탈출하기 위해 맨손으로 건물을 오르는 청년 백수 용남과 의주의 재난 탈출기",
                "기억을 잃은 파일럿 캐럴 댄버스가 자신의 과거를 찾고 위대한 히어로로 거듭나는 이야기",
                "1920년 죽음의 골짜기로 일본 정규군을 유인해 첫 승리를 거둔 독립군들의 치열한 전투 실화",
                "언더그라운드 스트리트 레이싱 세계에 잠입한 경찰과 폭주족 리더의 우정과 질주를 그린 액션 영화"};

        public MyGalleryAdapter(Context c) {
            context = c;
        }

        public int getCount() {
            // TODO Auto-generated method stub
            return posterID.length;
        }

        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);
            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster = (ImageView) findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);

                    TextView MovieText = (TextView) findViewById(R.id.MovieText);
                    MovieText.setText(posterText[pos]);

                    Self1102.this.setTitle("Num : " + (pos + 1));

                    Toast toast = new Toast(getApplicationContext());
                    View toastView = (View) View.inflate(
                            getApplicationContext(), R.layout.toast1102, null);
                    TextView toastText = (TextView) toastView
                            .findViewById(R.id.textView1);

                    toastText.setText(posterTitle[pos] + " (Num : " + (pos + 1) + ")");
                    toast.setView(toastView);
                    toast.show();

                    return false;
                }
            });

            return imageview;
        }
    }

}