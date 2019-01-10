package flyweight;

public abstract class Gun {

	protected Bullet[] bullets;
	protected int capacity;
	private final BulletType bulletType;

	public Gun(int capacity, BulletType type) {
		this.capacity = capacity;
		this.bulletType = type;
		this.bullets = new Bullet[capacity];
	}

	public abstract void shoot();

	public void loadBullets() {
		for(int i=0; i<capacity; i++) {
			this.bullets[i] = BulletFactory.getBulletFromCache(this.bulletType);
		}

	}

	public void loadUncachedBullets() {
		for(int i=0; i<capacity; i++) {
			this.bullets[i] = BulletFactory.getBulletByType(this.bulletType);
		}
	}
	
}
