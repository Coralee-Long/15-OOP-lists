package exercise.medication;

public class Main {
    public static void main(String[] args) {

        // Create some Medications
        Medication med1 = new Medication("Paracetamol", 4.99, true);
        Medication med2 = new Medication("Ibuprofen", 6.99, false);
        Medication med3 = new Medication("Aspirin", 5.49, true);
        Medication med4 = new Medication("Wellbutrin", 34.65, false);
        Medication med5 = new Medication("Fluoxetine", 12.59, true);

        // Create a Pharmacy
        Pharmacy pharmacy = new Pharmacy();

        // Add a Medication to the medications Map in our Pharmacy
         pharmacy.addNewMedication(med1);
         pharmacy.addNewMedication(med2);
         pharmacy.addNewMedication(med3);
         pharmacy.addNewMedication(med4);
         pharmacy.addNewMedication(med5);

        // Overwrite the existing Aspirin medication with new details
        pharmacy.updateMedication(new Medication("Aspirin", 7.99, true));

        // Search for a Medication
        pharmacy.findMedication("Ibuprofen");
            // Medication Ibuprofen found :Medication: {name = 'Ibuprofen', price = 6.99, isInStock = false}
        pharmacy.findMedication("Codeine");
            // Medication Codeine not found

        // Delete a Medication
        pharmacy.deleteMedication("Fluoxetine");
            // Medication Fluoxetine deleted successfully
        pharmacy.deleteMedication("Zolpidem");
            // Medication Zolpidem not found


        System.out.println("Medication Count: " + pharmacy.getMedicationCount());

        pharmacy.printMedications();
    }
}
