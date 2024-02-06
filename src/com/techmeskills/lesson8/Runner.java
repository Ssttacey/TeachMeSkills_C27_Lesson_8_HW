package com.techmeskills.lesson8;

import com.techmeskills.lesson8.medStaff.Therapist;
import com.techmeskills.lesson8.patient.Patient;


public class  Runner {
    public static void main(String[] args) {

        Patient patient1 = new Patient("name", 1);
        Patient patient2 = new Patient("somebody", 2);
        Patient patient3 = new Patient("anotherName", 3);

        Therapist therapist = new Therapist();

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);
    }
}