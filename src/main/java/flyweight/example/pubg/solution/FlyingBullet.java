package flyweight.example.pubg.solution;

public class FlyingBullet {
    private String curCoordinate;   // coordinate represented by 3 directions = xi + yj + zk
    private String targetCoordinate;
    private Bullet bulletType;

    public FlyingBullet(String curCoordinate, String targetCoordinate, Bullet bulletType) {
        this.curCoordinate = curCoordinate;
        this.targetCoordinate = targetCoordinate;
        this.bulletType = bulletType;
    }

    public String getCurCoordinate() {
        return curCoordinate;
    }

    public void setCurCoordinate(String curCoordinate) {
        this.curCoordinate = curCoordinate;
    }

    public String getTargetCoordinate() {
        return targetCoordinate;
    }

    public void setTargetCoordinate(String targetCoordinate) {
        this.targetCoordinate = targetCoordinate;
    }

    public Bullet getBulletType() {
        return bulletType;
    }

    public void setBulletType(Bullet bulletType) {
        this.bulletType = bulletType;
    }

    public void fire() {
        System.out.println("Firing bullet: " + this.bulletType + " at coordinates: " + this);
    }

    @Override
    public String toString() {
        return "FlyingBullet{" +
                "curCoordinate='" + curCoordinate + '\'' +
                ", targetCoordinate='" + targetCoordinate + '\'' +
                '}';
    }
}
