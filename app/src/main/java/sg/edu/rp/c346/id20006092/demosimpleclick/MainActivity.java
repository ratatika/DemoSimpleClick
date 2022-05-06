package sg.edu.rp.c346.id20006092.demosimpleclick;

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
    ToggleButton tbBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbBtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                if (tbBtn.isChecked() == true) {

                    String stringResponse = etInput.getText().toString();
                    tvDisplay.setText(stringResponse);

                    int checkedRadioId = rgGender.getCheckedRadioButtonId();

                    if(checkedRadioId == R.id.radioButtonGenderMale){
                        // Write the code when male selected
                        tvDisplay.setText("He says" + stringResponse);
                    }
                    else{
                        // Write the code when female selected
                        tvDisplay.setText("She says" + stringResponse);
                    }

                }
            }

        });


        tbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbBtn.isChecked() == true) {
                    tbBtn.setEnabled(true);
                } else {
                    tbBtn.setEnabled(false);
                }
            }
        });




    }
}