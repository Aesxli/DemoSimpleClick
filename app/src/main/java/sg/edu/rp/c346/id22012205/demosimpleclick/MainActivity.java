package sg.edu.rp.c346.id22012205.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton attoggle;

    RadioGroup grgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.button);
        etInput=findViewById(R.id.editTextText);
        attoggle=findViewById(R.id.toggleButtonEnabled);
        grgroup=findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);


            }
        });
        attoggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(attoggle.isChecked())
                {
                    etInput.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                    btnDisplay.setEnabled(false);
                }
            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String gen =" ";
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = grgroup.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.MaleradioButton){
                    // Write the code when male selected
                        gen +="He says ";
                }
                else{
                    // Write the code when female selected
                        gen +="She says ";
                }
                tvDisplay.setText(gen + stringResponse);
            }
        });


    }
}