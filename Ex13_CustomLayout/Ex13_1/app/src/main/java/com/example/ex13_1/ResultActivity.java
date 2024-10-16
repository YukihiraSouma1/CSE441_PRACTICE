package com.example.ex13_1;

public class ResultActivity extends AppCompatActivity{
    TextView txtViewChoice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtViewChoice = findViewById(R.id.textView2);
        Intent receive = getIntent()    ;
        String name = receive.getStringExtra("name");
        txtViewChoice.setText(name);

    }
}
