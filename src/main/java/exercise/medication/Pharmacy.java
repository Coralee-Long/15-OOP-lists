package exercise.medication;

import java.util.HashMap;
import java.util.Map;

// Reminder:
// Map - Maps objects to Value and Key pairs (no duplicate keys)
// Set - Stores objects, won't allow duplicate items

public class Pharmacy {

    // Create a new Map
    private final Map<String, Medication> medications = new HashMap<>();

    public void addNewMedication(Medication medication) {
        // Check if the key already exists
        if (medications.containsKey(medication.getName())) {
            throw new IllegalArgumentException("Medication with name " + medication.getName() + " already exists!");
        }
        // Add the new medication
        medications.put(medication.getName(), medication);
        System.out.println("Medication " + medication.getName() + " added.");
    }

    // Create a method to count the Medications in the medications Map
    public int getMedicationCount() {
        return medications.size();
    }

    // Create a method to save a Medication in the medications Map
    public void updateMedication(Medication medication) {

        medications.put(medication.getName(), medication); // Always save/overwrite
        System.out.println("Medication " + medication.getName() + " updated & saved");
    }

    // Create a method to find a medication by name in the medications Map
    public Medication findMedication(String name) {
        // Check if the medication exists in the map

        if (medications.containsKey(name)) {
            System.out.println("Medication " + name + " found :" + medications.get(name));
            return medications.get(name);
        }
        // returns null if nothing found
        System.out.println("Medication " + name + " not found");
        return null;
    }

    // Create a method to delete a medication from the medications Map
    public void deleteMedication(String name) {
        if (medications.containsKey(name)) {
            System.out.println("Medication " + name + " deleted successfully");
            medications.remove(name);
        } else {
            System.out.println("Medication " + name + " not found");
        }
    }

    // Print all medications
    public void printMedications() {
        System.out.println(" ------ Printing all " + getMedicationCount() + " Medications : ");
        for (Medication medication : medications.values()) {
            System.out.println("Medication Name: " + medication.getName() + " , Price: " + medication.getPrice() + " , inStock: " + medication.isInStock());
        }
    }


}
