public class empwage {
   public static void main(String[] args) {
   // Constants
   int IS_PART_TIME = 1;
   int IS_FULL_TIME = 2;
   int EMP_RATE_PER_HOUR = 20;
   // Variables
   int empHrs = 0;
   int empWage = 0;
   //Computation
   double empCheck = Math.floor(Math.random() * 10) % 3;
   if (empCheck == IS_FULL_TIME)
       empHrs = 8;
   else if (empCheck == IS_FULL_TIME)
       empHrs = 4;
   empWage = empHrs * EMP_RATE_PER_HOUR;
   System.out.println("Emp Wage: " + empWage);
   }
}


