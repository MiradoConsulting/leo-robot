import robocode.*;

import java.awt.Color;
import java.io.FileReader;
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

         setColors(Color.yellow,Color.pink,Color.pink); // body,gun,radar

        // Robot main loop
        while(true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(new Random(80).nextLong());
            turnLeft(new Random(60).nextLong());
            ahead(new Random(80).nextLong());
            turnRight(new Random(90).nextLong());
            ahead(new Random(80).nextLong());
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        fire(3);
        turnGunLeft(5);
        fire(2);
        turnGunRight(5);
        fire(2);

        ahead(100);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        turnLeft(new Random(90).nextLong());
        ahead(40);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        turnLeft(30);
    }
}
