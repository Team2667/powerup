package org.usfirst.frc2667.PowerUp.commands;

import org.usfirst.frc2667.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DropLeftCommandGroup extends CommandGroup {

	public DropLeftCommandGroup() {
		System.out.println("Starting println");
		if(Robot.isEndGame() ) {
		addSequential(new DropLeftLift());
		addSequential(new LeftDropButUp());
		System.out.println("Command group is being run!");
		}
	}
	
	protected void initialize() {

	}
	
}
