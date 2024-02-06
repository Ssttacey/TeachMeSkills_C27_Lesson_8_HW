package com.techmeskills.lesson8.medStaff;
/**
 * the dentist class interprets the method
 */
public class Dentist implements ITreatment {

    @Override
    public void treatment() {
        System.out.println(" Your treatment plan has been prescribed. You are referred to a dentist ");

    }
}