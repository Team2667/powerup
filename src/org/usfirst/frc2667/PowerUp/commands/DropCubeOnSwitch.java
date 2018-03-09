package org.usfirst.frc2667.PowerUp.commands;

import org.usfirst.frc2667.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DropCubeOnSwitch extends CommandGroup {

	public DropCubeOnSwitch() {
		addSequential(new GrabCube());
		addSequential(new DriveToSwitch());
		addParallel(new LiftUp());
		addSequential(new ReleaseCube());
	}
}
