// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.PowerUp.subsystems;

import org.usfirst.frc2667.PowerUp.RobotMap;
import org.usfirst.frc2667.PowerUp.commands.*;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogInput;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX leftFront = RobotMap.driveTrainLeftFront;
    private final WPI_TalonSRX leftRear = RobotMap.driveTrainLeftRear;
    private final WPI_TalonSRX rightFront = RobotMap.driveTrainRightFront;
    private final WPI_TalonSRX rightRear = RobotMap.driveTrainRightRear;
    private final AnalogInput distanceSensor = RobotMap.driveTrainDistanceSensor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DifferentialDrive drive = RobotMap.driveTrain;
    private boolean isAuto = false;
    
    public DifferentialDrive getRobotDrive() {
    	return this.drive;
    }
    
    public void tankDrive(Joystick joystick) {
    	getRobotDrive().tankDrive(-joystick.getY(), -joystick.getRawAxis(3));
    }
    
    public void arcadeDrive(Joystick joystick ) {
    	getRobotDrive().arcadeDrive(-joystick.getY(), joystick.getZ());
    }
    
    public void slowArcadeDrive(Joystick joystick ) {
    	getRobotDrive().arcadeDrive(-joystick.getY() * .7, joystick.getZ() * .9);
    }
    
    public void arcadeDrive(double mag, double turn ) {
    	getRobotDrive().arcadeDrive(-mag, -turn);
    }
    
    public void tankDrive(double x, double y) {
    	getRobotDrive().tankDrive(x, y);
    }
    
    public void changeMode(boolean isAuto) {
    	this.isAuto = isAuto;
    }
    
    public boolean getMode() {
    	return isAuto;
    }
    
    public void stop() {
    	getRobotDrive().tankDrive(0, 0);
    }
    
    public double getDistanceSensor() {
    	return distanceSensor.getVoltage() / 0.009766; // When we find out how it will be mounted, subtract the distance from the front bumper from the result
    }
    

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	setDefaultCommand(new Drive());
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

