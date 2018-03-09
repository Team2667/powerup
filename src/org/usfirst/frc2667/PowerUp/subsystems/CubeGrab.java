package org.usfirst.frc2667.PowerUp.subsystems;

import org.usfirst.frc2667.PowerUp.RobotMap;
import org.usfirst.frc2667.PowerUp.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class CubeGrab extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Spark grabWindow = RobotMap.cubeGrabGrabWindow;
    private final Spark liftWindow = RobotMap.cubeGrabLiftWindow;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public void stop() {
    	grabWindow.stopMotor();
    	liftWindow.stopMotor();
    }
    
    public void stopGrab() {
    	grabWindow.stopMotor();
    }
  
    public void stopLift() {
    	liftWindow.stopMotor();
    }
    
    public void grab() {
    	grabWindow.set(.25);
    }
    
    public void release() {
    	grabWindow.set(-.25);
    }
    
    public double getGrabber() {
    	return grabWindow.getRaw();
    }
    
    public void lift() {
    	liftWindow.set(.5);
    }
    
    public void drop() {
    	liftWindow.set(-.5);
    }
    
    public double getLift() {
    	return liftWindow.getRaw();
    }
    
    

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
