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
public class StudentTest {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
 
        try {
 
            Student student = manager.find("0000001");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
    }
    
}
