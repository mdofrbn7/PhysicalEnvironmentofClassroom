
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
public class OfferingNeedfullRightHand {
    private static boolean offeringNeedfullRightHand,  accessTechnologyBasicClassroomTools, teachersAbleFindSverything,wastingTimelosingFocus, accessable ;
   
    private static Scanner sc= new Scanner(System.in);
    
    
    private static void getValue(){
        try{
             System.out.println("It is crucial to have all the educational tools right at hand for there\n to be no obstruction in the process of learning.\nIs it easyly accessable to technology or the basic classroom tools?\nAnswer in true/false:");
             accessTechnologyBasicClassroomTools = sc.nextBoolean();
             System.out.println("Are the teachers able to find everything right when they need?\nAnswer in true/false:");
             teachersAbleFindSverything = sc.nextBoolean();
             System.out.println("Wasting time in getting hold of the educational tools can mean losing their focus\nDo students lossing their focus?\nAnswer in true/false:");
             wastingTimelosingFocus = sc.nextBoolean();
//             System.out.println(accessTechnologyBasicClassroomTools);
//             System.out.println(teachersAbleFindSverything);
//             System.out.println(wastingTimelosingFocus);
            
            
        }catch(Exception e){
            System.out.println("Please answer in true or false\nYou got an Exception:"+ e);
            
        }
       
    }
    
    private static boolean accessable(){
        if(accessTechnologyBasicClassroomTools && teachersAbleFindSverything && !wastingTimelosingFocus){
            accessable = true;
        } else {
            accessable = false;
        }
        return accessable;
    }
    
    public boolean offeringNeedfullRightHand(){
      getValue();
      if (accessable()){
         offeringNeedfullRightHand = true;
      }
      return offeringNeedfullRightHand;
    }
//    public static void main(String[] args) {
//      getValue();
//      if (accessable()){
//         // System.out.println("accessable");
//         offeringNeedfullRightHand = true;
//        //  System.out.println(offeringNeedfullRightHand);
//      }
//    }
}
