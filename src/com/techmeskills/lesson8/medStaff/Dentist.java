package com.techmeskills.lesson8.medStaff;

public class Dentist implements ITreatment {

    @Override
    public void treatment() {
        System.out.println(" Your treatment plan has been prescribed. You are referred to a dentist ");

    }
}