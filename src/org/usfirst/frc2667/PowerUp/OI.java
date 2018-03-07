// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.PowerUp;

import org.usfirst.frc2667.PowerUp.commands.*;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton grabCubeButton;
    public JoystickButton liftUpButton;
    public JoystickButton liftDownButton;
    public JoystickButton releaseCubeButton;
    public Joystick joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public Joystick controller = new Joystick(0);
	public JoystickButton dropLeftButton;
	public JoystickButton dropRightButton;
	public JoystickButton liftLeftButton;
	public JoystickButton liftRightButton;
	public JoystickButton raiseLeftLiftButton;
	

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(0);
        
        releaseCubeButton = new JoystickButton(joystick, 6);
        releaseCubeButton.whileHeld(new ReleaseCube());
        liftDownButton = new JoystickButton(joystick, 8);
        liftDownButton.whileHeld(new LiftDrop());
        liftUpButton = new JoystickButton(joystick, 7);
        liftUpButton.whileHeld(new LiftUp());
        grabCubeButton = new JoystickButton(joystick, 5);
        grabCubeButton.whileHeld(new GrabCube());


        // SmartDashboard Buttons
        SmartDashboard.putData("LeftSideStart", new LeftSideStart());
        SmartDashboard.putData("RightSideStart", new RightSideStart());
        SmartDashboard.putData("DriveStraight", new DriveStraight());
        SmartDashboard.putData("CenterStart", new CenterStart());
        SmartDashboard.putData("Turn45", new Turn45());
        SmartDashboard.putData("LiftMiddle", new LiftMiddle());
        SmartDashboard.putData("LiftDrop", new LiftDrop());
        SmartDashboard.putData("LiftUp", new LiftUp());
        SmartDashboard.putData("GrabCube", new GrabCube());
        SmartDashboard.putData("ReleaseCube", new ReleaseCube());
        SmartDashboard.putNumber("Distance Sensor", Robot.driveTrain.getDistanceSensor());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        dropLeftButton = new JoystickButton(joystick, 1);
        dropLeftButton.whenPressed(new DropLeftCommandGroup());
        dropRightButton = new JoystickButton(joystick, 3);
        dropRightButton.whenPressed(new DropRightCommandGroup());
        liftLeftButton = new JoystickButton(joystick, 4);
        liftLeftButton.whileHeld(new SideLiftLeftOnly());
        liftRightButton = new JoystickButton(joystick, 2);
        liftRightButton.whileHeld(new SideLiftRightOnly());
       // raiseLeftLiftButton = new JoystickButton(joystick, 10);
        //raiseLeftLiftButton.whenPressed(new LeftDropButUp());
        
    }
    

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

