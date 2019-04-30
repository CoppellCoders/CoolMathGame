package ml.coppellcoders.coolmathgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    private TextView question;
    private EditText answer;
    private Button submitButton;
    private TextView correctOrNot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        question = (TextView)findViewById(R.id.question);
        answer = (EditText)findViewById(R.id.answer);
        submitButton = (Button)findViewById(R.id.submit);
        correctOrNot = (TextView)findViewById(R.id.correct_or_not);

        String sampleQuestion = "2+2 = ?";
        String sampleAnswer = "4";

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.getText().toString().equals()){
                    correctOrNot.setText("CORRECT!");
                    correctOrNot.setVisibility(View.VISIBLE);

                }else{
                    correctOrNot.setText("INCORRECT");
                    correctOrNot.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
