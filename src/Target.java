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

        while (angle > 180) {
            angle -= 360;
        }

        while (angle < -180) {
            angle += 360;
        }
        

        return angle;
    }

    public String getPlus() {
        return getAngleToTarget() >= 0 ? "+" : "";
    }

    public double getRelativeX() {
        double headingInRadians = Math.toRadians(heading);

        return getXDistance() * Math.cos(headingInRadians)
            + getYDistance() * Math.sin(headingInRadians);
    }

    public double getRelativeY() {
        double headingInRadians = Math.toRadians(heading);

        return -getXDistance() * Math.sin(headingInRadians)
            + getYDistance() * Math.cos(headingInRadians);
    }

}