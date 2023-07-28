package flyweight.example.pubg.problem;

// This is our Client code.
public class Game {
    public static void main(String[] args) {
        // Assuming 100 players in a game. Each player can have max 1000 bullets.
        int bulletsInGame = 100000;
        Bullet[] bullets = new Bullet[bulletsInGame];

        // Creating bullets for all players in game.
//        System.out.println("Creating Bullets:");
        for (int b = 0; b < bulletsInGame; b++) {
            int repeatVal1 = b % 10;

            // These are intrinsic attribute values which will be common for each type of Bullet.
            String name = "name" + repeatVal1, color = "color" + repeatVal1;
            double radius = repeatVal1, weight = repeatVal1;
            String img = "img" + repeatVal1;         // this will actually be an image of size at least >= 1kb.

            // These are extrinsic attribute values which will vary for each bullet.
            String curCoordinate = b + "i" + (b + 1) + "j" + (b + 2) + "k";
            String targetCoordinate = (b + 3) + "i" + (b + 4) + "j" + (b + 5) + "k";

            // Here is the problem.
            // We are copying heavy weight intrinsic attributes to each new Bullet increasing the memory consumption.
            bullets[b] = new Bullet(name, radius, color, weight, curCoordinate, targetCoordinate, img);
            bullets[b].fire();
        }
        // Total bullets size >= (1kb * 100000) >= 100mb.
        // Consuming 100mb for just the bullets is not good for a low memory mobile phone.
        // Game will crash saying - out of memory error.
    }
}
