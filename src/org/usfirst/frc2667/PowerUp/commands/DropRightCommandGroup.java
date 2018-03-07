package org.usfirst.frc2667.PowerUp.commands;

import org.usfirst.frc2667.PowerUp.Robot;
import org.usfirst.frc2667.PowerUp.commands.DropRightLift;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DropRightCommandGroup extends CommandGroup {

	public DropRightCommandGroup() {
		System.out.println("Starting println");
		//if(Robot.isEndGame() ) {
		addSequential(new DropRightLift());
		addSequential(new RightDropButUp());
		System.out.println("Command group is being run!");
		//}
	}
	
	protected void initialize() {

	}
	
}