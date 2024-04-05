import robocode.*;

import java.awt.Color;
import java.util.Random;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * LeoFighter - a robot by (your name here)
 */
public class LeoFighter extends Robot
{
    /**
     * run: LeoFighter's default behavior
     */
    public void run() {
        // Initialization of the robot should be put here

        // After trying out your robot, try uncommenting the import at the top,
        // and the next line:

         setColors(Color.green,Color.blue,Color.red); // body,gun,radar

        // Robot main loop
        while(true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(20);
            turnGunRight(20);
            ahead(20);
            turnLeft(30);
            ahead(new Random(100).nextLong());
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        fire(3);
        turnGunLeft(3);
        fire(1);
        turnGunRight(8);
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        turnLeft(15);
        ahead(50);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        turnLeft(30);
    }
}
