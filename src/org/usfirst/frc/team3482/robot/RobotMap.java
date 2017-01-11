package org.usfirst.frc.team3482.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogInput;


public class RobotMap {
	public static CANTalon talon1;
	public static AnalogInput rangeFinder;
	
	public void init(){
		talon1 = new CANTalon(1);
		rangeFinder = new AnalogInput(0);
	}
}
