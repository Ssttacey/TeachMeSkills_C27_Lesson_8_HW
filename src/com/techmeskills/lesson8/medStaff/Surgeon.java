package com.techmeskills.lesson8.medStaff;
/**
 * the surgeon class interprets the method
 */

public class Surgeon implements ITreatment {

    @Override
    public void treatment() {
        System.out.println(" Your treatment plan has been prescribed. You are referred to a surgeon ");
    }
}
