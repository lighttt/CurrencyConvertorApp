package np.com.manishtuladhar.currencyapp;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText nepaliamount;
    public TextView convertedaamount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nepaliamount = (EditText)findViewById(R.id.et_nepaliamount);
        convertedaamount = (TextView)findViewById(R.id.tv_converted);
    }

    public void convert1(View view){
        Double amount = Double.parseDouble(nepaliamount.getText().toString());
        Double dollar = amount * 0.0090;
        convertedaamount.setText(String.format("%.2f",dollar));
    }
    public void convert2(View view){
        Double amount = Double.parseDouble(nepaliamount.getText().toString());
        Double euro = amount * 0.0080;
        convertedaamount.setText(String.format("%.2f",euro));

    }
    public void convert3(View view){
        Double amount = Double.parseDouble(nepaliamount.getText().toString());
        Double ic = amount * 0.625;
        convertedaamount.setText(String.format("%.2f",ic));

    }
    public void convert4(View view){
        Double amount = Double.parseDouble(nepaliamount.getText().toString());
        Double chinese = amount * 0.062;
        convertedaamount.setText(String.format("%.2f",chinese));

    }
}
