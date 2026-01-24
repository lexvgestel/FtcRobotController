package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class IfPractice extends OpMode {
    private DcMotor motor = null;

    @Override
    public void init() {
        motor  = hardwareMap.get(DcMotor.class, "motor");

    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
        boolean aButton = gamepad1.a;

        if(!aButton) {
            motorSpeed = motorSpeed * 0.5;
        }
        else {
            motorSpeed = motorSpeed * 1;
        }

        motor.setPower(motorSpeed);

    }

}
