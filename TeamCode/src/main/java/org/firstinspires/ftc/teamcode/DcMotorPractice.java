package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;


@TeleOp
public class DcMotorPractice extends OpMode {

    TestBench bench = new TestBench();
    TestBench touchSensor = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
        touchSensor.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (touchSensor.isTouchSensorPressed()) {
            bench.setMotorSpeed(0.5);
        }
        else {
            bench.setMotorSpeed(0.0);
        }
        if (gamepad1.a) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
            bench.setMotorZeroBehaviour(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }

}
