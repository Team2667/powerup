package org.usfirst.frc2667.PowerUp.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2667.PowerUp.Robot;
import org.usfirst.frc2667.PowerUp.vision.PixyDegrees;

public class TestDistanceSensor {
	private int frame = 0;
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		frame++;
		if (frame % 5 == 0)
			System.out.println(Robot.driveTrain.getDistanceSensor());
		
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