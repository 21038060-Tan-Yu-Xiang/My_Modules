package sg.edu.rp.c346.id21038060.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvAcademicYear;
    TextView tvAcademicSemester;
    TextView tvModuleCredit;
    TextView tvModuleVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.tvModuleCode);
        tvModuleName = findViewById(R.id.tvModuleName);
        tvAcademicYear = findViewById(R.id.tvAcademicYear);
        tvAcademicSemester = findViewById(R.id.tvAcademicSemester);
        tvModuleCredit = findViewById(R.id.tvModuleCredit);
        tvModuleVenue = findViewById(R.id.tvModuleVenue);
        btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(view -> onBackPressed());

        Intent intent = getIntent();
        String moduleCode = intent.getStringExtra("moduleCode");
        String moduleName = intent.getStringExtra("moduleName");
        Integer academicYear = intent.getIntExtra("academicYear", 1965);
        Integer academicSemester = intent.getIntExtra("academicSemester", 0);
        Integer moduleCredit = intent.getIntExtra("moduleCredit", 0);
        String moduleVenue = intent.getStringExtra("moduleVenue");

        tvModuleCode.setText("Module Code: "+moduleCode);
        tvModuleName.setText("Module Name: "+moduleName);
        tvAcademicYear.setText("Academic Year: "+academicYear);
        tvAcademicSemester.setText("Semester: "+academicSemester);
        tvModuleCredit.setText("Module Credit: "+moduleCredit);
        tvModuleVenue.setText("Venue: "+moduleVenue);
    }
}