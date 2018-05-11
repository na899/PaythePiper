package e.pnaveena.paythepiper;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int paid=0;


    public void setgoal(View view){
        Random r = new Random();
        int i = r.nextInt(101 - 1) + 1;//maximum=100 and minimum=1
        TextView goalTextView= (TextView)findViewById(R.id.goal);
        goalTextView.setText(""+ i);

    }
    public void addOne(View view) {
        paid = paid + 1;
        display(paid);
    }
    public void addTwo(View view)
    {paid=paid+2;
        display(paid);
    }
    public void addFive(View view)
    {paid=paid+5;
        display(paid);
    }
    public void addTen(View view)
    {paid=paid+10;
    display(paid);

    }
    public void reset(View view) {
        paid = 0;
        display(paid);
    }
    private void display ( int a)
    {        TextView quantityTextView= (TextView)findViewById(R.id.status);
        quantityTextView.setText(""+ a);
        changeColor();
    }
    private void changeColor(){

        TextView textViewA = (TextView) findViewById(R.id.goal);
        TextView textViewB = (TextView) findViewById(R.id.status);

        if (textViewA.getText().toString().equals(textViewB.getText().toString())){
            TextView quantityTextView= (TextView)findViewById(R.id.msg);
            quantityTextView.setVisibility(View.VISIBLE);
            View view = this.getWindow().getDecorView();
            view.setBackgroundColor(000000);


        }



}
    }
