package org.usfirst.frc.team3482.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogInput;


public class RobotMap {
	public static CANTalon frontLeft;
	public static CANTalon frontRight;
	public static CANTalon backLeft;
	public static CANTalon backRight;
	public static AnalogInput rangeFinder;
	
	public void init(){
		frontLeft = new CANTalon(0);
		frontRight = new CANTalon(1);
		backLeft = new CANTalon(2);
		backRight = new CANTalon(3);
		rangeFinder = new AnalogInput(0);
	}
}
