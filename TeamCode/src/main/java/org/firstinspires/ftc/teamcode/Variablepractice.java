package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Variablepractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 16785;
        int motorAngle = 78;
        double motorSpeed = 0.8;
        boolean clawClosed = true;
        String teamName = "Lex";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motorAngle", motorAngle);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("clawClosed", clawClosed);
        telemetry.addData("ProBotiX", teamName);
    }
    public void loop() {

    }
}
