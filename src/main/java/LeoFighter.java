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

         setColors(Color.yellow,Color.blue,Color.pink); // body,gun,radar

        // Robot main loop
        while(true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(100); //Go ahead 100 pixels
            turnGunRight(360); //scan
            back(75); //Go back 75 pixels
            turnGunRight(360); //scan
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e){
        double distance = e.getDistance(); //get the distance of the scanned robot
        if(distance > 800) //this conditions adjust the fire force according the distance of the scanned robot.
            fire(5);
        else if(distance > 600 && distance <= 800)
            fire(4);
        else if(distance > 400 && distance <= 600)
            fire(3);
        else if(distance > 200 && distance <= 400)
            fire(2);
        else if(distance < 200)
            fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */

    public void onHitByBullet(HitByBulletEvent e){
        double energy = getEnergy();
        double bearing = e.getBearing(); //Get the direction which is arrived the bullet.
        if(energy < 100){ // if the energy is low, the robot go away from the enemy
            turnRight(-bearing); //This isn't accurate but release your robot.
            ahead(100); //The robot goes away from the enemy.
        }
        else
            turnRight(360); // scan
    }
    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e){
        double bearing = e.getBearing(); //get the bearing of the wall
        turnRight(-bearing); //This isn't accurate but release your robot.
        ahead(100); //The robot goes away from the wall.
    }
}
