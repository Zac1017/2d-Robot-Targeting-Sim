import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter robot X position: ");
        double roboX = scanner.nextDouble();
        System.out.print("Enter robot Y position: ");
        double roboY = scanner.nextDouble();
        System.out.print("Enter target X position: ");
        double targetX = scanner.nextDouble();
        System.out.print("Enter target Y position: ");
        double targetY = scanner.nextDouble();
        System.out.print("Enter robot heading (degrees): ");
        double heading = scanner.nextDouble();

        Target target = new Target(roboX, roboY, targetX, targetY, heading);
        
        System.out.println("Distance to target: " + target.getDistance());
        System.out.println("Angle to target: " + target.getPlus() + target.getAngleToTarget());
        
    }
}