
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billi
 */
public class MinimizingTheDistractions {
    private static boolean minimizingTheDistractions,  studentsShiftAttention,  ensureKeptClassroomsUnnecessaryToolsNotInClass, destracts ;
   
    private static Scanner sc= new Scanner(System.in);
    
    
    private static void getValue(){
        try{
             System.out.println("it takes nothing more than a few minutes for the students\nto shift their attention and be distracted\nAre they shift their attention?\nAnswer in true/false:");
             studentsShiftAttention = sc.nextBoolean();
             System.out.println("Ensure that nothing as such is kept in the classroom that \nneed not be there or that cannot come to aid the learning process \nof the kids in any possible way.\nDo teachers kept unnecessary tools out of class?\nAnswer in true/false:");
              ensureKeptClassroomsUnnecessaryToolsNotInClass = sc.nextBoolean();
//             System.out.println("Wasting time in getting hold of the educational tools can mean losing their focus\nDo students lossing their focus?\nAnswer in true/false:");
//             wastingTimelosingFocus = sc.nextBoolean();
//             System.out.println(studentsShiftAttention);
//             System.out.println( ensureKeptClassroomsUnnecessaryToolsNotInClass);
//             System.out.println(wastingTimelosingFocus);
            
            
        }catch(Exception e){
            System.out.println("Please answer in true or false\nYou got an Exception:"+ e);
            
        }
       
    }
    
    private static boolean destracts(){
        if(!studentsShiftAttention &&  ensureKeptClassroomsUnnecessaryToolsNotInClass ){
            destracts = false;
        } else {
            destracts = true;
        }
        return destracts;
    }
    
    public boolean minimizingTheDistractions(){
      getValue();
      if (!destracts()){
         minimizingTheDistractions = true;
      }
      return minimizingTheDistractions;
    }
//    public static void main(String[] args) {
//      getValue();
//      if (!destracts()){
//          //System.out.println(destracts);
//         minimizingTheDistractions = true;
//         // System.out.println(minimizingTheDistractions);
//      }
//    }
}
