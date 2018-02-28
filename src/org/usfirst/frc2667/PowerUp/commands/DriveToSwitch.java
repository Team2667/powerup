package org.usfirst.frc2667.PowerUp.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2667.PowerUp.Robot;
import org.usfirst.frc2667.PowerUp.RobotMap;
import org.usfirst.frc2667.PowerUp.vision.PixyDegrees;

public class DriveToSwitch extends Command {
	
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.driveTrain.arcadeDrive(.65, PixyDegrees.getDirection() * .03);
	}
	
	protected boolean isFinished() {
		return (Robot.driveTrain.getDistanceSensor() <= 2 && !(Robot.driveTrain.getDistanceSensor() == 0));
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		Robot.driveTrain.stop();
	}
}
