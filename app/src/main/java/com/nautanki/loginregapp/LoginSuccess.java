package com.nautanki.loginregapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginSuccess extends AppCompatActivity implements View.OnClickListener {
    /*TextView username,password;*/
    TextView t1;
    Button btnScanStdid,btnScanBkid;
    EditText txtstdid,txtbkid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login_success);

        Intent intent=getIntent();

        User user=new User(LoginSuccess.this);



        txtstdid=findViewById(R.id.txt_return_stdid);
        txtbkid=findViewById(R.id.txt_return_bkid);
        initViews();

        // Toast.makeText(this, sharedPrefForIDs.getBookId()+" stdid "+sharedPrefForIDs.getStudentId(), Toast.LENGTH_LONG).show();
        if( user.getStudentId()!="")
        {

            //Toast.makeText(this, sharedPrefForIDs.getBookId().toString(), Toast.LENGTH_SHORT).show();

            txtstdid.setText(user.getStudentId().toString());
            txtbkid.setText(user.getBookId2().toString());
        }


    }



    private void initViews() {
        btnScanStdid = findViewById(R.id.btn_return_stdid);
        btnScanBkid = findViewById(R.id.btn_return_bkid);


        // btnScanBarcode = findViewById(R.id.btnScanBarcode);

        btnScanStdid.setOnClickListener( this);
        btnScanBkid.setOnClickListener( this);
        //  btnScanBarcode.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_return_stdid:
                Intent i=new Intent(this,ScannedBarcodeActivty.class);
                i.putExtra("btnvalue","return_student");
                startActivity(i);
                finish();
                break;
            case R.id.btn_return_bkid:
                Intent i1=new Intent(this,ScannedBarcodeActivty.class);
                i1.putExtra("btnvalue","return_student");
                startActivity(i1);
                finish();
                break;

        }

    }



}