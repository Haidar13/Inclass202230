package com.seustudents.inclass202230;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Course> mCourseList;
    private RecyclerView rvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "First Application", Toast.LENGTH_SHORT).show();
        Log.i("info", "We are on the onCreate method");
        init();
        generateData();
        setData();

    }

    private void init(){
        mCourseList = new ArrayList<>();
        rvCourse = findViewById(R.id.rv_course);
    }

    private void generateData() {

    mCourseList.add(new Course("Mobile Application Development", "IT448", "4:00 PM - 5:00 PM"));
    mCourseList.add(new Course("Web Design", "IT404", "5:00 PM - 6:00 PM"));
    mCourseList.add(new Course("Computer Organization", "IT233", "6:00 PM - 7:00 PM"));
    mCourseList.add(new Course("Business Computer Languages", "IT401", "7:00 PM - 8:00 PM"));
    mCourseList.add(new Course("Computer Networks", "IT210", "8:00 PM - 9:00 PM"));
    mCourseList.add(new Course("Operating Systems", "IT241", "9:00 PM - 10:00 PM"));
}
    private void setData() {
    rvCourse.setLayoutManager(new LinearLayoutManager(this));
    rvCourse.setAdapter(new CourseAdapter(this, mCourseList));
}



}