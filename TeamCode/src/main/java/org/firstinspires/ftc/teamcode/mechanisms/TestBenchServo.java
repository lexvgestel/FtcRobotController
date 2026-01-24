package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class TestBenchServo {
    private Servo servoPos;
    private CRServo servoRot;


    public void init(HardwareMap hwm) {
        servoPos = hwm.get(Servo.class, "servoPos");
        servoRot = hwm.get(CRServo.class, "servoRot");
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }

    public void setServoRot(double power) {
        servoRot.setPower(power);
    }
}
