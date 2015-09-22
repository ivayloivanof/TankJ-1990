package tank;

public class TankEnemy extends Tank{
    private TypeTankEnemy type;
    private final byte LIFE_POINTS = 1;
    private final byte LIVES = 1;
    private final int startX = 0;
    private final int startY = 0;

    public TankEnemy(String name) {
        this.setName(name);
        this.type = TypeTankEnemy.Easy;
        this.setLifePoints(LIFE_POINTS);
        this.setLives(LIVES);
        this.setX(startX);
        this.setY(startY);
    }
}
