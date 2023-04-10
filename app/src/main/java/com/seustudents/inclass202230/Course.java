package com.seustudents.inclass202230;

public class Course {
    private String mCourse_name;
    private String mCourse_id;
    private String mCourse_time;

    public Course(String cid, String cname, String ctime ){
        mCourse_id = cid;
        mCourse_name = cname;
        mCourse_time = ctime;
    }

    public String getmCourse_name() {
        return mCourse_name;
    }

    public String getmCourse_id() {
        return mCourse_id;
    }

    public String getmCourse_time() {
        return mCourse_time;
    }
}
