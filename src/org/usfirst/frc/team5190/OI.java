package org.usfirst.frc.team5190.robot;

import edu.wpi.first.wpilibj.Joystick;



public class OI {

	Joystick Drivers = new Joystick(0);
	
		public OI() {
		
		}
	
	
	public Joystick getJoystick(){
		
		return Drivers; 
	}


}
