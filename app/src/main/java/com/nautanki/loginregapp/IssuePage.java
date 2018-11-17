package com.nautanki.loginregapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IssuePage extends AppCompatActivity implements View.OnClickListener {
    EditText stdid,bkid1,bkid2,bkid3,bkid4;
    Button btn_stdid,btn_bkid1,btn_bkid2,btn_bkid3,btn_bkid4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_issue_page);
        stdid= findViewById(R.id.txt_issue_std_id);
        bkid1=findViewById(R.id.txt_issue_bkid1);
        bkid2=findViewById(R.id.txt_issue_bkid2);
        bkid3=findViewById(R.id.txt_issue_bkid3);
        bkid4=findViewById(R.id.txt_issue_bkid4);

        initViews();

        User user=new User(IssuePage.this);
        stdid.setText(user.getStudentId().toString());
        bkid1.setText(user.getBookId1().toString());
        bkid2.setText(user.getBookId2().toString());
        bkid3.setText(user.getBookId3().toString());
        bkid4.setText(user.getBookId4().toString());


    }

    private void initViews() {
        btn_stdid=findViewById(R.id.btn_issue_std_id);
        btn_bkid1=findViewById(R.id.btn_issue_bkid1);
        btn_bkid2=findViewById(R.id.btn_issue_bkid2);
        btn_bkid3=findViewById(R.id.btn_issue_bkid3);
        btn_bkid4=findViewById(R.id.btn_issue_bkid4);

        // btnScanBarcode = findViewById(R.id.btnScanBarcode);
        btn_stdid.setOnClickListener(this);
        btn_bkid1.setOnClickListener( this);
        btn_bkid2.setOnClickListener( this);
        btn_bkid3.setOnClickListener( this);
        btn_bkid4.setOnClickListener( this);
        //  btnScanBarcode.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_issue_bkid1:
                Intent intent1=new Intent(this,ScannedBarcodeActivty.class);
                intent1.putExtra("btnvalue","issue_book1");
                startActivity(intent1);
                finish();
                break;
            case R.id.btn_issue_bkid2:
                Intent intent2=new Intent(this,ScannedBarcodeActivty.class);
                intent2.putExtra("btnvalue","issue_book2");
                startActivity(intent2);
                finish();
                break;
            case R.id.btn_issue_bkid3:
                Intent intent3=new Intent(this,ScannedBarcodeActivty.class);
                intent3.putExtra("btnvalue","issue_book3");
                startActivity(intent3);
                finish();
                break;
            case R.id.btn_issue_bkid4:
                Intent intent4=new Intent(this,ScannedBarcodeActivty.class);
                intent4.putExtra("btnvalue","issue_book4");
                startActivity(intent4);
                finish();
                break;
            case R.id.btn_issue_std_id:
                Intent i=new Intent(this,ScannedBarcodeActivty.class);
                i.putExtra("btnvalue","issue_student");
                startActivity(i);
                finish();
                break;

        }

    }

    public void reset(View view) {
        User user=new User(IssuePage.this);
        user.setStudentId("");
        user.setBookId1("");
        user.setBookId2("");
        user.setBookId3("");
        user.setBookId4("");
        startActivity(new Intent(this,IssuePage.class));
        finish();
    }
}
