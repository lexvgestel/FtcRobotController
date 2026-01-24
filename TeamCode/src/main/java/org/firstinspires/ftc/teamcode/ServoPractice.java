package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchServo;

@TeleOp
public class ServoPractice extends OpMode {
    TestBenchServo bench = new TestBenchServo();

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            bench.setServoPos();
        }

    }
}
