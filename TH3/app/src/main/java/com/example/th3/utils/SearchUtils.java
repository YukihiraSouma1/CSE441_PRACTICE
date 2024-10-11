package com.example.th3.utils;

import com.example.th3.model.data.Student;

import java.util.ArrayList;
import java.util.List;

public class SearchUtils {

    public static List<Student> searchStudents(List<Student> studentList, String query) {
        List<Student> searchResults = new ArrayList<>();
        for (Student student : studentList) {
            String fullName = student.getFullName().getLast() + " " + student.getFullName().getMidd() + " " + student.getFullName().getFirst();
            if (fullName.toLowerCase().contains(query.toLowerCase())) {
                searchResults.add(student);
            }
        }
        return searchResults;
    }

}
