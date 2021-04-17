/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billi
 */
public class PhysicalEnvironmentOfClassroomMain {
    
    public static void main(String[] args) {
        EnsuringUtmostComfortYoungLearers ensuringUtmostComfortYoungLearers = new EnsuringUtmostComfortYoungLearers();
        OfferingNeedfullRightHand offeringNeedfullRightHand = new OfferingNeedfullRightHand();
        MinimizingTheDistractions minimizingTheDistractions = new MinimizingTheDistractions();
        IncreasingEngagementAndParticipation increasingEngagementAndParticipation = new IncreasingEngagementAndParticipation();
        if(ensuringUtmostComfortYoungLearers.ensuringUtmostComfortYoungLearers() && offeringNeedfullRightHand.offeringNeedfullRightHand() && minimizingTheDistractions.minimizingTheDistractions() && increasingEngagementAndParticipation.increasingEngagementAndParticipation()){
            System.out.println("The Physical Environment of this Classrooms is Ensuring Engrossed Learning");
        }else{
            System.out.println("The Physical Environment of this Classrooms is NOT Ensuring Engrossed Learning");
        }
        
    }
    
}
