package com.example.a2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public	class	 Activity {
    Button btnPay;
@
    public void onCreate(Bundle savedInstanceState)	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);
        btnPay =	(Button) btnPay.findViewById();
    @Override
        public void onClick(View v) {
            String msg = "Coffee ";
            if (chkCream.isChecked()){
                msg += " & cream ";

            }
        }
        if (chkSugar.isChecked()){
            msg += " & Sugar";
        }
        Toast.makeText(getApplicationContext(),
    msg, Toast.LENGTH_SHORT).show();
    //go now and compute cost...
}
});
}
}
