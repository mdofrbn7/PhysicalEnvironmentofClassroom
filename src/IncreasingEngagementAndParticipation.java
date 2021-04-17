
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
public class IncreasingEngagementAndParticipation {
    private static boolean encreseParticipent, gainMindset,theyThinkTheyAreAtAPlaceOfLearning ,increasingEngagementAndParticipation ;
   private static boolean  isIncreasedEngagementAndParticipation, educativePostersOnWalls, theDeskToRead, theBooksOnTheShelves;
    private static Scanner sc= new Scanner(System.in);
    
    private static boolean theyThinkTheyAreAtAPlaceOfLearning(){
        
       if(educativePostersOnWalls && theDeskToRead && theBooksOnTheShelves ){
           theyThinkTheyAreAtAPlaceOfLearning = true;
       }else{
           theyThinkTheyAreAtAPlaceOfLearning =false;
       }
        
        return theyThinkTheyAreAtAPlaceOfLearning;
        
    }
    public static boolean encreseParticipent(){
      
        if(theyThinkTheyAreAtAPlaceOfLearning()){
            encreseParticipent = true;
        }else{
            encreseParticipent = false;
        }
        return encreseParticipent;
    }
    
    private static void getValue(){
        try{
             System.out.println("Are the Class rooms has educative posters on wall?\nAnswer in true/false:");
             educativePostersOnWalls = sc.nextBoolean();
             System.out.println("Are the students have desk to read?\nAnswer in true/false:");
             theDeskToRead = sc.nextBoolean();
             System.out.println("Are the students have book shelves?\nAnswer in true/false:");
             theBooksOnTheShelves = sc.nextBoolean();
//             System.out.println(educativePostersOnWalls);
//             System.out.println(theDeskToRead);
//             System.out.println(theBooksOnTheShelves);
            
            
        }catch(Exception e){
            System.out.println("Please answer in true or false\nYou got an Exception:"+ e);
            
        }
       
    }
    
    private static boolean isIncreasedEngagementAndParticipation(){
       getValue();
      if(encreseParticipent() && theyThinkTheyAreAtAPlaceOfLearning()){
          isIncreasedEngagementAndParticipation = true;
      }else{
          isIncreasedEngagementAndParticipation= false;
      }
       return isIncreasedEngagementAndParticipation;
    }
    
    public boolean increasingEngagementAndParticipation(){
        
      if (isIncreasedEngagementAndParticipation()){
         increasingEngagementAndParticipation  = true;
         
      }
      return increasingEngagementAndParticipation;
    }
//    public static void main(String[] args) {
//        IncreasingEngagementAndParticipation x = new IncreasingEngagementAndParticipation();
//        System.out.println(x.increasingEngagementAndParticipation);
//    }
    
}
