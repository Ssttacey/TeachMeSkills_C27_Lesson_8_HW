package com.techmeskills.lesson8.medStaff;

import com.techmeskills.lesson8.patient.Patient;
/**
 * The therapist class interprets the treatment method.
 * Contains a new method that is prescribed by the attending physician
 */

public class Therapist implements ITreatment {

    @Override
    public void treatment() {
        System.out.println(" Your treatment plan has been prescribed. You are referred to a Therapist ");
    }

    public void assignDoctor(Patient patient) {
        ITreatment doctor;
        if (patient.treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (patient.treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.treatment();
    }
}