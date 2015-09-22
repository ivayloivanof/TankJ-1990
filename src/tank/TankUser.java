package tank;

public class TankUser extends Tank {
    private TypeTankUsers type;
    private final byte LIFE_POINTS = 1;
    private final byte LIVES = 3;
    private final int startX = 250;
    private final int startY = 1000;

    public TankUser(String name) {
        this.setName(name);
        this.type = TypeTankUsers.Marine;
        this.setLifePoints(LIFE_POINTS);
        this.setLives(LIVES);
        this.setX(startX);
        this.setY(startY);
    }
}
