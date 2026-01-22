package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y/2.0;
        double diffX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTrigger = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Xl", gamepad1.left_stick_x);
        telemetry.addData("Yl", speedForward);

        telemetry.addData("Yr", gamepad1.right_stick_y);
        telemetry.addData("Xr", gamepad1.right_stick_x);

        telemetry.addData("A", gamepad1.a);
        telemetry.addData("B", gamepad1.b);

        telemetry.addData("Difference X", diffX);
        telemetry.addData("Sum Triggers", sumTrigger);

    }
}
