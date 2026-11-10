package com.example.ch10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity1001 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second1001_main);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        RadioButton rdo1 = (RadioButton)findViewById(R.id.rdoBTS);
        RadioButton rdo2 = (RadioButton) findViewById(R.id.rdoKiss);
        RadioButton rdo3 = (RadioButton) findViewById(R.id.rdoGirl);
        RadioButton rdo4 = (RadioButton) findViewById(R.id.rdoPink);

        TextView result = (TextView) findViewById(R.id.textAns);

        Button btn = (Button) findViewById(R.id.btnSelect);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rdo1.isChecked() == true)
                    result.setText("결과: 방탄소년단");
                else if (rdo2.isChecked() == true)
                    result.setText("결과: 잭스키스");
                else if (rdo3.isChecked() == true)
                    result.setText("결과: 소녀시대");
                else if (rdo4.isChecked() == true)
                    result.setText("결과: 에이핑크");
            }
        });
    }
}
