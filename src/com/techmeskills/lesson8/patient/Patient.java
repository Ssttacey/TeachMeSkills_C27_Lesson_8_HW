package com.techmeskills.lesson8.patient;

import com.techmeskills.lesson8.medStaff.ITreatment;

public class Patient {
    String name;
    public int treatmentPlan;

    public Patient (String name, int treatmentPlan){
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    private ITreatment doctor;

    public ITreatment getDoctor() {
        return doctor;
    }

    public void setDoctor(ITreatment doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
