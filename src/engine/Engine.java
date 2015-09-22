package engine;

import exception.CreateTankException;
import tank.Tank;
import tank.TankEnemy;
import tank.TankUser;

import java.util.ArrayList;

public class Engine {
    private ArrayList<Tank> tankUsers;
    private ArrayList<Tank> tankEnemy;

    public Engine() {
        //initilization tanks arrays
        this.tankEnemy = new ArrayList<>();
        this.tankUsers = new ArrayList<>();
    }

    public void run() {
        //start game in loop
    }

    public void init(int users, int enemy) throws CreateTankException {
        //create tanks users
        if (!this.createUsersTanks(users)) {
            throw new CreateTankException("Cannot be created users!");
        }

        //create tanks enemy
        if (!this.createEnemyTanks(enemy)) {
            throw new CreateTankException("Cannot be created users!");
        }

        //create map
    }

    private boolean createUsersTanks (int numberOfUsers) {
        if (numberOfUsers <= 0) {
            return false;
        }

        for (int i = 1; i <= numberOfUsers; i++) {
            String user = "user" + i;
            this.tankUsers.add(new TankUser(user));
        }

        return true;
    }

    private boolean createEnemyTanks (int numbersOfEnemy) {
        if (numbersOfEnemy <= 0) {
            return false;
        }

        for (int i = 1; i <= numbersOfEnemy; i++) {
            String enemy = "enemy" + i;
            this.tankEnemy.add(new TankEnemy(enemy));
        }

        return true;
    }
}
