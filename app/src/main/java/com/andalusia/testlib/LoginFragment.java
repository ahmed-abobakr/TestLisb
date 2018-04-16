package com.andalusia.testlib;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    EditText editPhone, editPassword;
    Button btnLogin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        btnLogin = rootView.findViewById(R.id.login_btn);
        editPhone = rootView.findViewById(R.id.login_phone);
        editPassword = rootView.findViewById(R.id.login_password);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editPhone.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(), getActivity().getResources().getString(R.string.empty_phone_error),
                            Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getActivity(), R.string.empty_password_error, Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}
