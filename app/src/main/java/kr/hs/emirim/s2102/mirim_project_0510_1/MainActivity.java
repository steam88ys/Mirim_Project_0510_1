package kr.hs.emirim.s2102.mirim_project_0510_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout baselayout = new LinearLayout(this);
        baselayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                        ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(baselayout, params);
        edit = new EditText(this);
        Button btn = new Button(this);
        text = new TextView(this);

        edit.setTextSize(20);
        edit.setTextColor(Color.BLACK);

        btn.setBackgroundColor(Color.YELLOW);
        btn.setText("버튼입니다.");

        text.setTextSize(25);
        text.setTextColor(Color.MAGENTA);
        text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);

        baselayout.addView(edit);
        baselayout.addView(btn);
        baselayout.addView(text);

//      EditText에 입력한 후 버튼을 클릭하면 TextView에 똑같은 문자열이 출력되게
        btn.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            text.setText(edit.getText().toString());
        }
    };
}