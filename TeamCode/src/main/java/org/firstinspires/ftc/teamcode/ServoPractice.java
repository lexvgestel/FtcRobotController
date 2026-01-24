package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchServo;

@TeleOp
public class ServoPractice extends OpMode {
    TestBenchServo bench = new TestBenchServo();
    double leftTrigger, rightTrigger;

    @Override
    public void init() {
        leftTrigger = 0.0;
        rightTrigger = 0.0;
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            bench.setServoPos(0.0);
        }
        else if (gamepad1.b) {
            bench.setServoPos(1.0);
        }

        if (gamepad1.x) {
            bench.setServoRot(1.0);
        }
        else  {
            bench.setServoRot(0.0);
        }

        leftTrigger = gamepad1.left_trigger;
        rightTrigger = gamepad1.right_trigger;

        bench.setServoRot(rightTrigger);
        bench.setServoPos(leftTrigger);
    }
}
