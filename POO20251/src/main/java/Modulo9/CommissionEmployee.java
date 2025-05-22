package Modulo9;

public class CommissionEmployee {
   private final String firstName;                        
   private final String lastName;                         
   private final String socialSecurityNumber;             
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate) {

      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }      

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public String getSocialSecurityNumber() { return socialSecurityNumber; }

   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      
      this.grossSales = grossSales;
   } 

   public double getGrossSales() { return grossSales; }

   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      } 
      this.commissionRate = commissionRate;
   } 

   public double getCommissionRate() { return commissionRate; }

   // calcular ganancias
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   }

   // calcular sueldo después del 2% de IVA
   public double earningsAfterTax() {
      return earnings() * 0.98; // se descuenta el 2%
   }

   @Override 
   public String toString() {
      return String.format(
         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
         "Empleado por comisión", getFirstName(), getLastName(), 
         "Número de seguridad social", getSocialSecurityNumber(), 
         "Ventas brutas", getGrossSales(), 
         "Porcentaje de comisión", getCommissionRate(),
         "Ganancias", earnings(),
         "Sueldo después del IVA (2%)", earningsAfterTax());
   } 
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
