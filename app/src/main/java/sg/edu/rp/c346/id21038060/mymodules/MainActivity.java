package sg.edu.rp.c346.id21038060.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1;
    TextView tvModule2;
    TextView tvModule3;
    TextView tvModule4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.tvModule1);
        tvModule2 = findViewById(R.id.tvModule2);
        tvModule3 = findViewById(R.id.tvModule3);
        tvModule4 = findViewById(R.id.tvModule4);

        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

        tvModule1.setOnClickListener(view -> {
            intent.putExtra("moduleCode", "C346");
            intent.putExtra("moduleName", "Android Programming");
            intent.putExtra("academicYear", 2020);
            intent.putExtra("academicSemester", 1);
            intent.putExtra("moduleCredit", 4);
            intent.putExtra("moduleVenue", "W66M");
            startActivity(intent);
        });

        tvModule2.setOnClickListener(view -> {
            intent.putExtra("moduleCode", "C349");
            intent.putExtra("moduleName", "iPad Programming");
            intent.putExtra("academicYear", 2019);
            intent.putExtra("academicSemester", 2);
            intent.putExtra("moduleCredit", 4);
            intent.putExtra("moduleVenue", "E66A");
            startActivity(intent);
        });

        tvModule3.setOnClickListener(view -> {
            intent.putExtra("moduleCode", "C286");
            intent.putExtra("moduleName", "Advanced Web Dev in .NET");
            intent.putExtra("academicYear", 2020);
            intent.putExtra("academicSemester", 2);
            intent.putExtra("moduleCredit", 4);
            intent.putExtra("moduleVenue", "W63A");
            startActivity(intent);
        });

        tvModule4.setOnClickListener(view -> {
            intent.putExtra("moduleCode", "C303");
            intent.putExtra("moduleName", "C303 IT Project Management");
            intent.putExtra("academicYear", 2021);
            intent.putExtra("academicSemester", 1);
            intent.putExtra("moduleCredit", 4);
            intent.putExtra("moduleVenue", "E53D");
            startActivity(intent);
        });
    }
}