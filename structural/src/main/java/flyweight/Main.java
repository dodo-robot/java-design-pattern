package flyweight;

public class Main {

	public static void main(String[] args) {
		System.out.println("Shooting with cached bullets");
		Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
		shotGun.loadBullets();
		shotGun.shoot();
		
		System.out.println("Shooting with uncached bullets");
		Gun shotGunUncached = new ShotGun(8, BulletType.SHOTGUN_BULLET);
		shotGunUncached.loadUncachedBullets();
		shotGunUncached.shoot();
	}

}
