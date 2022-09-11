package com.project.agriculturalapp.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.project.agriculturalapp.R;

import static com.project.agriculturalapp.R.layout.activity_fertilizer_calculator;

public class FertCal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_fertilizer_calculator);
        Toast.makeText(FertCal.this,"Get your Soil Health Card done before calculating required fertilizer",Toast.LENGTH_LONG).show();

    }
    @SuppressLint("SetTextI18n")
    public void btnclick(View view) {
        double urea=  2.173;
        double dapn=0.18;
        double dapp=2.173;
        double mop=1.666;
        EditText stemp = findViewById(R.id.size);
        double s = Float.valueOf(stemp.getText().toString());
        EditText ntemp = (EditText)findViewById(R.id.nitro);
        double n = Float.valueOf(ntemp.getText().toString());

        EditText ptemp = (EditText)findViewById(R.id.phosp);
        double p = Float.valueOf(ptemp.getText().toString());
        TextView result = (TextView)findViewById(R.id.soln);

        EditText ktemp = (EditText)findViewById(R.id.potash);
        double k = Float.valueOf(ktemp.getText().toString());
        int mop_req = (int) (mop*k);
        int dap_req = (int) (dapp*p);
        dapn = dapn*dap_req;
        n = n - dapn;
        int urea_req = (int) (urea*n);
        result.setText("Required Urea :\t" + urea_req + "\tkg/ha or "+ urea_req*0.404686 + "kg/acre\n\n"+
                "Required DAP :\t" + dap_req + "\tkg/ha or "+ dap_req*0.404686 + "kg/acre\n\n"+
                "Required MOP :\t" + mop_req + "\tkg/ha or "+ mop_req*0.404686 + "kg/acre\n\n");



    }

}