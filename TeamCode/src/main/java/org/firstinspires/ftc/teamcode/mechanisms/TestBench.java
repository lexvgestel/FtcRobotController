package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DcMotor motor;
    private double ticksPRev;
    private DigitalChannel touchSensor;
    private double gearRatio;

    public void init(HardwareMap hwm) {

        motor = hwm.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPRev = motor.getMotorType().getTicksPerRev();
        gearRatio = 2;
        touchSensor = hwm.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);

    }



    public void setMotorSpeed(double speed) {
        motor.setPower(speed);

    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPRev * gearRatio;

    }

    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }
    public void setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior zeroBehaviour) {
        motor.setZeroPowerBehavior(zeroBehaviour);

    }
}
