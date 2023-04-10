package com.seustudents.inclass202230;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CourseViewHolder extends RecyclerView.ViewHolder { //1
   private TextView mtxtCourseName;   //2
   private TextView mtxtCourseId;
   private TextView mtxtCourseTime;
   public CourseViewHolder(View itemView) { //3
       super(itemView);
       mtxtCourseName = itemView.findViewById(R.id.txt_course_name);
       mtxtCourseId = itemView.findViewById(R.id.txt_course_id);
       mtxtCourseTime = itemView.findViewById(R.id.txt_course_time);
   }
   public void setCourseName(String courseName) {  // 4
       this.mtxtCourseName.setText(courseName);
   }
   public void setCourseID(String courseId) {
       this.mtxtCourseId.setText(courseId);
   }
   public void setCourseTime(String courseTime) {
       this.mtxtCourseTime.setText(courseTime);
   }
}
