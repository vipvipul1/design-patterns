package flyweight.example.pubg.solution;

// This is our Client code.
public class Game {
    public static void main(String[] args) {
        // Assuming 100 players in a game. Each player can have max 1000 bullets.
        int bulletsInGame = 100000;
        FlyingBullet[] flyingBullets = new FlyingBullet[bulletsInGame];

        // Creating bullets for all players in game.
        System.out.println("Creating Bullets:");
        for (int b = 0; b < bulletsInGame; b++) {
            // Only 10 Bullet types are created in the game.
            // So, max 10 Bullet types will be created in the Bullet.bulletTypes at any point of time.
            int repeatVal1 = b % 10;

            // These are intrinsic attribute values which will be common for each type of Bullet.
            String name = "name" + repeatVal1, color = "color" + repeatVal1;
            double radius = repeatVal1, weight = repeatVal1;
            String img = "img" + repeatVal1;         // this will actually be an image of size at least >= 1kb.

            // These are extrinsic attribute values which will vary for each bullet.
            String curCoordinate = b + "i" + (b + 1) + "j" + (b + 2) + "k";
            String targetCoordinate = (b + 3) + "i" + (b + 4) + "j" + (b + 5) + "k";

            // If exists returns the Bullet type already created or creates a new one and returns that Bullet.
            Bullet bulletType = Bullet.getBullet(name, radius, color, weight, img);

            // Each FlyingBullet object contains only the unique extrinsic values.
            // The intrinsic values of Bullet are stored in a ref variable (bulletType) in FlyingBullet object.
            flyingBullets[b] = new FlyingBullet(curCoordinate, targetCoordinate, bulletType);
            flyingBullets[b].fire();
        }
        // Total unique Bullet types size >= (1kb * 10) >= 0.01mb (approx)
        // Total FlyingBullet bullets size <= 10 mb (approx)
        // (considering size for name, radius, color etc. which will hardly be <= 10mb for 1 lac FlyingBullet objects)
    }
}