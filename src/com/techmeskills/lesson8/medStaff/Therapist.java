package com.techmeskills.lesson8.medStaff;

import com.techmeskills.lesson8.patient.Patient;

public class Therapist implements ITreatment {

    @Override
    public void treatment() {
        System.out.println(" Your treatment plan has been prescribed. You are referred to a Therapist ");
    }

    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();
    Therapist therapist = new Therapist();

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            surgeon.treatment();
        } else if (patient.treatmentPlan == 2) {
            dentist.treatment();
        } else {
            therapist.treatment();
        }
    }
}
