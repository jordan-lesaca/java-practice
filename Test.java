//if
public class Test {

   public static void main(String args[]) {
      int x = 10;

      if( x < 20 ) {
         System.out.print("This is if statement");
      }
   }
}

// syntax for if.. else if statement
// if(Boolean_expression 1) {
//    // Executes when the Boolean expression 1 is true
// }else if(Boolean_expression 2) {
//    // Executes when the Boolean expression 2 is true
// }else if(Boolean_expression 3) {
//    // Executes when the Boolean expression 3 is true
// }else {
//    // Executes when the none of the above condition is true.
// }

// Example
// public class Test {

//    public static void main(String args[]) {
//       int x = 30;

//       if( x == 10 ) {
//          System.out.print("Value of X is 10");
//       }else if( x == 20 ) {
//          System.out.print("Value of X is 20");
//       }else if( x == 30 ) {
//          System.out.print("Value of X is 30");
//       }else {
//          System.out.print("This is else statement");
//       }
//    }
// }

//Syntax:
// if(Boolean_expression 1) {
//    // Executes when the Boolean expression 1 is true
//    if(Boolean_expression 2) {
//       // Executes when the Boolean expression 2 is true
//    }
// }

// public class Test {

//    public static void main(String args[]) {
//       int x = 30;
//       int y = 10;

//       if( x == 30 ) {
//          if( y == 10 ) {
//             System.out.print("X = 30 and Y = 10");
//          }
//       }
//    }
// }

// SWITCH SYNTAX

// switch(expression) {
//    case value :
//       // Statements
//       break; // optional
   
//    case value :
//       // Statements
//       break; // optional
   
//    // You can have any number of case statements.
//    default : // Optional
//       // Statements
// }

//Example 
// public class Test {

//    public static void main(String args[]) {
//       // char grade = args[0].charAt(0);
//       char grade = 'C';

//       switch(grade) {
//          case 'A' :
//             System.out.println("Excellent!"); 
//             break;
//          case 'B' :
//          case 'C' :
//             System.out.println("Well done");
//             break;
//          case 'D' :
//             System.out.println("You passed");
//          case 'F' :
//             System.out.println("Better try again");
//             break;
//          default :
//             System.out.println("Invalid grade");
//       }
//       System.out.println("Your grade is " + grade);
//    }
// }