package org.usfirst.frc.team5190.robot.commands;


import org.usfirst.frc.team5190.robot.OI;
import org.usfirst.frc.team5190.robot.*;

import edu.wpi.first.wpilibj.command.Command;

@SuppressWarnings("unused")
public class ArcadeDriveCommand extends Command {

	
	public ArcadeDriveCommand() {
	
		requires(Robot.DriveTrains);
		
	}
	
	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		Robot.DriveTrains.TeleopDrive(Robot.oi.getJoystick());
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}

	
}
