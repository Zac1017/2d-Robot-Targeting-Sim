public class Target {
    
    public double roboX;
    public double roboY;

    public double targetX;
    public double targetY;

    public double heading;

    public Target(double roboX, double roboY, double targetX, double targetY, double heading) {
        this.roboX = roboX;
        this.roboY = roboY;
        this.targetX = targetX;
        this.targetY = targetY;
        this.heading = heading;
    }

    public double getXDistance() {
        return targetX - roboX;
    }

    public double getYDistance() {
        return targetY - roboY;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(getXDistance(), 2) + Math.pow(getYDistance(), 2));   
    }

    public double getAngleToTarget() {
        double targetAngle =  Math.toDegrees(Math.atan2(getYDistance(), getXDistance()));
        double angle = targetAngle - heading;

        while (true) {
            if (angle < 0) {
                angle += 360;
            } else if (angle >= 360) {
                angle -= 360;
            } else {
                break;
            }
        }
        

        return angle;
    }

    public char getPlusMinus() {
        double targetAngle = Math.toDegrees(Math.atan2(getYDistance(), getXDistance()));
        
        double angle = targetAngle - heading;

        while (true) {
            if (angle < -180) {
                angle += 180;
            } else if (angle >= 180) {
                angle -= 180;
            } else {
                break;
            }
        }

        if (angle < 0) {
            return '-';
        } else {
            return '+';
        }

    }
}
