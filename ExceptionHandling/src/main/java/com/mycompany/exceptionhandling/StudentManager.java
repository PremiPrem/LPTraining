/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author tharu
 */
public class StudentManager {
    public Student find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return new Student();
        } else {
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }
    }
    
}
