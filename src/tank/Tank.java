package tank;

public abstract class Tank {
    private String name;
    private byte lifePoints;
    private byte lives;
    private int x;
    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(byte lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(byte lives) {
        this.lives = lives;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
