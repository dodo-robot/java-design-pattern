package flyweight;

public class ShotGun extends Gun{

	public ShotGun(int capacity, BulletType type) {
		super(capacity, type);
	}

	@Override
	public void shoot() {
		for(int i=0; i<this.capacity; i++)
			System.out.println(this.bullets[i].toString());
	}

}
