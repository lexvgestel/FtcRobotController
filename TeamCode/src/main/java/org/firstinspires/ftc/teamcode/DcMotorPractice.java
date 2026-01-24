package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;


@TeleOp
public class DcMotorPractice extends OpMode {

    TestBench DcMotor = new TestBench();
    TestBench touchSensor = new TestBench();

    @Override
    public void init() {
        DcMotor.init(hardwareMap);
        touchSensor.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (touchSensor.isTouchSensorPressed()) {
            DcMotor.setMotorSpeed(0.5);
        }
        else {
            DcMotor.setMotorSpeed(0.0);
        }
        if (gamepad1.a) {
            DcMotor.setMotorZeroBehaviour(com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
            DcMotor.setMotorZeroBehaviour(com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor Revs", DcMotor.getMotorRevs());
    }

}
