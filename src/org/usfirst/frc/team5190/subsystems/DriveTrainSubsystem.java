package org.usfirst.frc.team5190.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5190.robot.commands.ArcadeDriveCommand;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

@SuppressWarnings("unused")
public class DriveTrainSubsystem extends Subsystem {
	
	private SpeedController frontLeftMotor = new CANTalon(1);
	private SpeedController rearLeftMotor = new CANTalon(2);
	private SpeedController frontRightMotor = new CANTalon(3);
	private SpeedController rearRightMotor = new CANTalon(4);
	
	private RobotDrive MainDrive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	
	@Override
	protected void initDefaultCommand() {
		
		setDefaultCommand(new ArcadeDriveCommand());
		
	}


	public void TeleopDrive(Joystick Drivers) {

		MainDrive.arcadeDrive(Drivers.getX(), Drivers.getY());
		
	}
	
	public void Stop() {
		
		
		
	}


	public SpeedController getFrontLeftMotor() {
		return frontLeftMotor;
	}


	public void setFrontLeftMotor(SpeedController frontLeftMotor) {
		this.frontLeftMotor = frontLeftMotor;
	}


	public SpeedController getRearLeftMotor() {
		return rearLeftMotor;
	}


	public void setRearLeftMotor(SpeedController rearLeftMotor) {
		this.rearLeftMotor = rearLeftMotor;
	}


	public SpeedController getFrontRightMotor() {
		return frontRightMotor;
	}


	public void setFrontRightMotor(SpeedController frontRightMotor) {
		this.frontRightMotor = frontRightMotor;
	}


	public SpeedController getRearRightMotor() {
		return rearRightMotor;
	}


	public void setRearRightMotor(SpeedController rearRightMotor) {
		this.rearRightMotor = rearRightMotor;
	}
	
}
