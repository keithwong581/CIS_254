/******************************************************************************
 * Keith Wong
 * CIS 254
 *   
 * Compilation:  javac IsaSpringDay.java
 * Execution:    java day month
 *  
 *  Prints true if the given day and month fall between March 20 (inclusive) and June 20 (inclusive).
 * 
 *  % java IsaSpringDay 3 20
 *  true
 *
 *  % java IsaSpringDay 6 20
 *  true
 *
 *  % java IsaSpringDay 4 15
 *  true
 *
 *  % java IsaSpringDay 9 11
 * false
 *
 ******************************************************************************/

public class IsaSpringDay { 
    public static void main(String[] args) { 

        int month = Integer.parseInt(args[0]);
        int day   = Integer.parseInt(args[1]);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}