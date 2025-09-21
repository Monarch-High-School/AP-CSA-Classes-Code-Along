/**
 * Keeps track of mileage and fuel data for vehicles as they drive. We will identify
 * flaws and shortcomings in this approach and rewrite it in an object-oriented way.
 * @author 
 * @version 1.0
 * @since 2025-09
 */

 public class VehicleDriver {

    public static void main(String [] args) {
            // data for vehicle 1
        String vehicle1Make = "Honda";
        String vehicle1Model = "CRV";
        int vehicle1Year = 2016;
        double vehicle1FuelEfficiency = 28.5; // miles per gallon
        double vehicle1FuelCapacity = 15.3;
        double vehicle1CurrentFuel = 14.5;
        double vehicle1TotalMileage = 5430.5;

        System.out.printf("%d %s %s: Total Mileage: %.1f, Fuel: %.1f/%.1f, MPG: %.1f\n",
                        vehicle1Year,
                        vehicle1Make,
                        vehicle1Model,
                        vehicle1TotalMileage,
                        vehicle1CurrentFuel,
                        vehicle1FuelCapacity,
                        vehicle1FuelEfficiency
                        );

            // data for vehicle 2
        String vehicle2Make = "Bugatti";
        String vehicle2Model = "Chiron Super Sport";
        int vehicle2Year = 2024;
        double vehicle2FuelEfficiency = 8.0; 
        double vehicle2FuelCapacity = 26.4;
        double vehicle2CurrentFuel = 3.0;
        double vehicle2TotalMileage = 200.5;

         System.out.printf("%d %s %s: Total Mileage: %.1f, Fuel: %.1f/%.1f, MPG: %.1f\n",
                        vehicle2Year,
                        vehicle2Make,
                        vehicle2Model,
                        vehicle2TotalMileage,
                        vehicle2CurrentFuel,
                        vehicle2FuelCapacity,
                        vehicle2FuelEfficiency
                        );    
        
            // drive vehicle 1 150 miles
            // check that I have enough gas
        double fuelNeeded = 150 / vehicle1FuelEfficiency;
            // if I need more gas than I have, just travel as far as I can
        if (fuelNeeded > vehicle1CurrentFuel) {
            vehicle1TotalMileage += vehicle1CurrentFuel / vehicle1FuelEfficiency;
            vehicle1CurrentFuel = 0.0;
        }
            // otherwise travel that much
        else {
            vehicle1TotalMileage += 150;
            vehicle1CurrentFuel -= fuelNeeded;
        }

            // print out
        System.out.println("Driving 150 miles with vehicle 1");
        System.out.printf("%d %s %s: Total Mileage: %.1f, Fuel: %.1f/%.1f, MPG: %.1f\n",
                        vehicle1Year,
                        vehicle1Make,
                        vehicle1Model,
                        vehicle1TotalMileage,
                        vehicle1CurrentFuel,
                        vehicle1FuelCapacity,
                        vehicle1FuelEfficiency
                        );


        // Drive 25 miles with vehicle 2 - should probably check if I have enough fuel. 
        fuelNeeded = 25 / vehicle2FuelEfficiency;
        vehicle2TotalMileage += 25;
        vehicle2CurrentFuel -= fuelNeeded;

        System.out.println("Driving 25 miles with vehicle 2");
         System.out.printf("%d %s %s: Total Mileage: %.1f, Fuel: %.1f/%.1f, MPG: %.1f\n",
                        vehicle2Year,
                        vehicle2Make,
                        vehicle2Model,
                        vehicle2TotalMileage,
                        vehicle2CurrentFuel,
                        vehicle2FuelCapacity,
                        vehicle2FuelEfficiency
                        );            

    }
 }