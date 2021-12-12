package by.geekbrains.android1.lesson1;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import by.geekbrains.android1.R;

public class CustomElementsActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        initView();
        pickADate();

    }

    private void pickADate() {
        calendarView.setOnDateChangeListener((calendarView, year, month, day) -> {
            String date = day + "/" + (month + 1) + "/" + year;
            textView.setText(date);
            Toast.makeText(CustomElementsActivity.this, date, Toast.LENGTH_SHORT).show();
        });
    }

    private void initView() {
        calendarView = findViewById(R.id.calendar_view);
        textView = findViewById(R.id.text_view);
    }
}