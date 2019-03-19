package lt.vtmc.ems.crazy_convert;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button convertButton;

//    private EditText inputNumberField;
//    private TextView Kilometre;
//    private TextView Centrimate;
//    private TextView Mile;
//    private TextView Yard;
//    private TextView Foot;



    private Button buttonResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.inputNumberField);
        TextView k = (TextView)findViewById(R.id.Kilometre);
        TextView c = (TextView)findViewById(R.id.Centrimate);
        TextView m = (TextView)findViewById(R.id.Mile);
        TextView y = (TextView)findViewById(R.id.Yard);
        TextView f = (TextView)findViewById(R.id.Foot);

        int num1 = Integer.parseInt(e1.getText().toString());


         int  kil = num1 / 1000;
         int cen = num1 / 1;
         double mil = num1 / 0.1;
         double yar = num1 * 9.144;
         double fot = num1 * 3.048;

        k.setText(Integer.toString(kil));
        c.setText(Integer.toString(cen));
        m.setText(Double.toString( mil));
        y.setText(Double.toString(yar));
        f.setText(Double.toString(fot));

    }

    public void onClick(View v) {
        TextView k = (TextView)findViewById(R.id.Kilometre);
        TextView c = (TextView)findViewById(R.id.Centrimate);
        TextView m = (TextView)findViewById(R.id.Mile);
        TextView y = (TextView)findViewById(R.id.Yard);
        TextView f = (TextView)findViewById(R.id.Foot);

        k.setText("00");
        c.setText("00");
        m.setText("00");
        y.setText("00");
        f.setText("00");
    }

}
