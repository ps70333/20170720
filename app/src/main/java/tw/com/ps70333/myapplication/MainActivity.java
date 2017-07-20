package tw.com.ps70333.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getJackpot(View view){
        //Log.i("simon","OK");
        getNumber();
    }
    private void getNumber(){
        HashSet<Integer> set =new HashSet<>();
        while(set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        TextView textView =(TextView)findViewById(R.id.myText);
        textView.setText(set.toString());
    }
}
