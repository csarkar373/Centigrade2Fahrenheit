package com.westhillcs.centigrade2fahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static EditText et_c;
    private static EditText et_f;
    private static Button b_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initialize();
    }

    private void initialize() {
        et_c = (EditText)findViewById(R.id.c_et);
        et_f = (EditText)findViewById(R.id.f_et);
        b_convert = (Button)findViewById(R.id.convert_b);
        b_convert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double c = Double.parseDouble(  et_c.getText().toString()  );
                        double f = (9.0/5.0)*c + 32.0;
                        et_f.setText( f+"");
                    }
                }
        );


    }


}
