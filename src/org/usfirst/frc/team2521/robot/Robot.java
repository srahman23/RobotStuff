
package org.usfirst.frc.team2521.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.CANTalon;

public class Robot extends IterativeRobot {
	CANTalon motor;
    public void robotInit() {
    	motor = new CANTalon(52);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	motor.set(0.5);
    }

    public void teleopPeriodic() {
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
