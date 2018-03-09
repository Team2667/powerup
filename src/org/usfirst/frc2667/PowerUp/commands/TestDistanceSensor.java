package org.usfirst.frc2667.PowerUp.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2667.PowerUp.Robot;
import org.usfirst.frc2667.PowerUp.vision.PixyDegrees;

public class TestDistanceSensor {

	
	protected void initialize() {
		
	}
	
	protected void execute() {
			SmartDashboard.putNumber("Distance Sensor", Robot.driveTrain.getDistanceSensor());
		
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void Interrupted() {
		end();
	}
	
	protected void end() {
		
	}

}