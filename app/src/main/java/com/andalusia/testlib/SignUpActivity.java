package com.andalusia.testlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText editPhone, editPassword, editConfirmPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editPhone = findViewById(R.id.signup_edit_email);
        editPassword = findViewById(R.id.signup_password);
        editConfirmPassword = findViewById(R.id.signup_confirm_password);
        btnSignUp = findViewById(R.id.signup_btn);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editPhone.getText().toString().isEmpty() &&
                        editPassword.getText().toString().equals(editConfirmPassword.getText().toString())){
                    Intent i = new Intent(SignUpActivity.this, HomeActivity.class);
                    i.putExtra("phone", editPhone.getText().toString());
                    startActivity(i);
                    SignUpActivity.this.finish();
                }else {
                    if(editPhone.getText().toString().isEmpty()){
                        Toast.makeText(SignUpActivity.this, R.string.empty_phone_error, Toast.LENGTH_LONG)
                                .show();
                    }else {
                        Toast.makeText(SignUpActivity.this, R.string.password_not_match_error, Toast.LENGTH_LONG)
                                .show();
                    }
                }
            }
        });
    }
}
