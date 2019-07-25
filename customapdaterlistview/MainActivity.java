package com.example.customapdaterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvStudent;
    private List<Student> studentList;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radiation();
        Event();
        CreateAdapter();
    }

    private void CreateAdapter() {
        studentList = new ArrayList<Student>();
        for (int i = 0 ; i < 15 ; i++){
            Student student = new Student();
            student.setId("ID: " + i);
            student.setName("Name: Khương " + i);
            student.setNumberPhone("NumberPhone: 035624196" + i);
            studentList.add(student);
        }

        studentAdapter = new StudentAdapter(MainActivity.this,studentList);
        lvStudent.setAdapter(studentAdapter);
    }

    private void Event() {

    }

    private void Radiation() {
        lvStudent = (ListView) findViewById(R.id.lvStudent);
    }
}
