package com.seustudents.inclass202230;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter <CourseViewHolder> {
   private Context context;
   private ArrayList<Course> courseList;
   public CourseAdapter(Context context, ArrayList<Course> courseList) { // contractor
   this.context = context;
   this.courseList = courseList;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(context).inflate(R.layout.row_course,parent, false);
        return new CourseViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        Course course = courseList.get(position);
        holder.setCourseName(course.getmCourse_name());
        holder.setCourseID(course.getmCourse_id());
        holder.setCourseTime(course.getmCourse_time());
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
}

