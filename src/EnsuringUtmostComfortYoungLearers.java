
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billi
 */
public class EnsuringUtmostComfortYoungLearers {
    
    private static boolean ensuredUtmostComfortYoungLearers,  obstructMobility, accessibilityToClassroomTools,visibilityToTheirTeachers , gainMindset ;
    private static Scanner sc= new Scanner(System.in);
    
    
    private static void getValue(){
        try{
             System.out.println("Are the students have obstructs their mobility?\nAnswer in true/false:");
             obstructMobility = sc.nextBoolean();
             System.out.println("Are the students have accessibility to the classroom tools?\nAnswer in true/false:");
             accessibilityToClassroomTools = sc.nextBoolean();
             System.out.println("Are the students visibile to their teachers?\nAnswer in true/false:");
             visibilityToTheirTeachers = sc.nextBoolean();
//             System.out.println(obstructMobility);
//             System.out.println(accessibilityToClassroomTools);
//             System.out.println(visibilityToTheirTeachers);
            
            
        }catch(Exception e){
            System.out.println("Please answer in true or false\nYou got an Exception:"+ e);
            
        }
       
    }
    
    private static boolean gainMindset(){
        if(obstructMobility && accessibilityToClassroomTools && visibilityToTheirTeachers){
            gainMindset= true;
        } else {
            gainMindset = false;
        }
        return gainMindset;
    }
    
    public boolean ensuringUtmostComfortYoungLearers(){
      getValue();
      if (gainMindset()){
         ensuredUtmostComfortYoungLearers = true;
      }
      return ensuredUtmostComfortYoungLearers;
    }
//    public static void main(String[] args) {
//      getValue();
//      if (gainMindset()){
//         ensuredUtmostComfortYoungLearers = true;
//      }
//    }
}

