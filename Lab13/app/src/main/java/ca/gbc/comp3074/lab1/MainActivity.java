package ca.gbc.comp3074.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView label;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         label = (TextView)findViewById(R.id.mylabel);
          edit = (EditText)findViewById(R.id.myedit);
        Button button = findViewById(R.id.mybutton);

        label.setText(R.string.mylabel);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String txt = edit.getText().toString();
                label.setText(txt);
            }
        }
        );
    }
}