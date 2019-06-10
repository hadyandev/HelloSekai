package com.example.hellosekai;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnCalculatorActivity;
    Button btnMoveWithDataActivity;
    Button btnDialPhone;
    Button btnMyView;
    Button btnMyRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnCalculatorActivity = findViewById(R.id.btn_calculator);
        btnCalculatorActivity.setOnClickListener(this);

        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        btnMyView = findViewById(R.id.btn_my_view);
        btnMyView.setOnClickListener(this);

        btnMyRecycleView = findViewById(R.id.btn_my_recycler_view);
        btnMyRecycleView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_calculator:
                Intent calculatorIntent = new Intent(MainActivity.this, BarVolumeActivity.class);
                startActivity(calculatorIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "085887231617";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_my_view:
                Intent myviewIntent = new Intent(MainActivity.this, MyViewActivity.class);
                startActivity(myviewIntent);
                break;
            case R.id.btn_my_recycler_view:
                Intent myRecyclerviewIntent = new Intent(MainActivity.this, MyRecyclerActivity.class);
                startActivity(myRecyclerviewIntent);
                break;
        }
    }
}
