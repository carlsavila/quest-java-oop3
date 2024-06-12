public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff(){
        if (!isFlying() && this.getAltitude() == 0){
            this.flying = true;
            System.out.printf("%s takes off into the sky.%n", this.getName());
        }
    }

    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }
    public void glide() {
        if (this.flying && this.altitude != 0) {
            this.flying = true;
            System.out.printf("%s glides into the sky.%n", this.getName());
        }
    }

    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flies downward, depths : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s gets down of the sky.%n", this.getName());
        } else {
            System.out.printf("%s is too height, it can't get down.%n", this.getName());
        }
    }
}
